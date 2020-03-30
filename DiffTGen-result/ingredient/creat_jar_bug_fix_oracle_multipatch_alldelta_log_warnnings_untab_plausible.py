import os
import shutil
import datetime as dt

work_path = os.getcwd()+'/'
print("work_path: "+work_path)

# 输出log信息
def log(msg):
    print(msg)
    with open(work_path+"log.txt",'a') as logs:
        now_time = dt.datetime.now().strftime('%F %T')
        logs.write(now_time + ": " + msg + '\n') 

# 输出warnning信息
def delta_warnning(msg):
    print(msg)
    with open(work_path+"delta_warnning.txt",'a') as warns:
        now_time = dt.datetime.now().strftime('%F %T')
        warns.write(now_time + ": " + msg + '\n')

def oracle_warnning(msg):
    print(msg)
    with open(work_path+"oracle_warnning.txt",'a') as warns:
        now_time = dt.datetime.now().strftime('%F %T')
        warns.write(now_time + ": " + msg + '\n')


# source_file:源路径, target_ir:目标路径
def copy_folder(source_dir, target_dir):
    for file in os.listdir(source_dir):
        file = os.path.join(source_dir, file)
        if os.path.isdir(file):
            target_dir = os.path.join(target_dir, file.split("/")[-1])
            if not os.path.exists(target_dir):
                os.mkdir(target_dir)
            copy_folder(file, target_dir)
        elif os.path.isfile(file):
            shutil.copy(file, target_dir)
        else:
            print("WRONG!!!!!!")



#递归查找文件夹下面所有文件
def findAllfile(path, allfile):
    filelist =  os.listdir(path)  
    for filename in filelist:  
        filepath = os.path.join(path, filename)  
        if os.path.isdir(filepath):
            #print(filepath)  
            findAllfile(filepath, allfile)  
        else:  
            if ".patch" in filepath:
                allfile.append(filepath)  
    return allfile


#"./metadata.csv"
def get_data(csv_file = "metadata.csv"): #获取csv信息
    bugs_dict = {'Chart':{}, 'Time':{}, 'Math':{}, 'Lang':{}, 'Closure':{}}
    with open(work_path+csv_file) as metadata:
        lines = metadata.readlines()
        for line in lines:
                if "," in line:  # 去掉空行
                    data=line.split(",")
                    if data[0] != "Mockito":
                        bugs_dict[data[0]][data[1]] = data[2:]
    # print("%s process done!"%csv_file)
    log("%s process done!"%csv_file)
    #两级字典
    return bugs_dict


def creat_jar(proj, id):        
    if os.path.exists(work_path+proj+'/'+id+'/'+proj.lower()+id+".jar"):
        print(proj.lower()+id+".jar exist, needn't package!")
        return
    if not os.path.exists(work_path+proj+'/'+id):
        os.makedirs(work_path+proj+'/'+id)
    os.chdir(work_path+'buggy/'+proj+'_'+id)
    current_path = os.getcwd()+'/'
    os.system("defects4j compile")
    # print("%s compile done"%(proj+id))
    log("%s compile done"%(proj+id))
    if proj == "Chart":
        os.chdir(current_path+"build")
    elif proj == "Time":
        if int(id)<=11:
            os.chdir(current_path+"target/classes")
        else:
            os.chdir(current_path+"build/classes")
    elif proj == "Math":
        os.chdir(current_path+"target/classes")
    elif proj == "Lang":
        os.chdir(current_path+"target/classes")
    elif proj == "Closure":
        os.chdir(current_path+"build/classes")

    #将class打包成jar到指定位置
    os.system("jar -cvf "+work_path+proj+'/'+id+'/'+proj.lower()+id+".jar ./*")
    # print(proj.lower()+id+".jar created!")
    log(proj.lower()+id+".jar created!")



def add_jar(proj, id):
    if proj != "Closure":
        return
    if os.path.exists(work_path+proj+'/'+id+'/'+proj.lower()+id+".jar"):
        log("Prepare adding depends into %s%s.jar"%(proj, id))
    else:
        log("%s%s.jar doesn't exists! Please creat it first!"%(proj, id))
        return

    os.chdir(work_path + "depend")
    os.system("jar -uvf "+work_path+proj+'/'+id+'/'+proj.lower()+id+".jar ./*")
    log("add depend into%s%s.jar done!"%(proj, id))

def move_bug_fix(proj, id, bugs):
    #创建bug文件夹及拷贝相应的java文件
    os.chdir(work_path+'buggy/'+proj+'_'+id)
    if not os.path.exists(work_path+proj+'/'+id+"/bug"):
        os.makedirs(work_path+proj+'/'+id+"/bug")
        os.system("cp "+bugs[proj][id][0]+" "+work_path+proj+'/'+id+"/bug")
        # print(proj+'/'+id+": bug's java  moved!")
        log(proj+'/'+id+": bug's java  moved!")

    #创建fix文件夹及拷贝相应的java文件
    os.chdir(work_path+'fixed/'+proj+'_'+id)
    if not os.path.exists(work_path+proj+'/'+id+"/fix"):
        os.makedirs(work_path+proj+'/'+id+"/fix")
        os.system("cp "+bugs[proj][id][0]+" "+work_path+proj+'/'+id+"/fix")
        # print(proj+'/'+id+": fix's java  moved!")
        log(proj+'/'+id+": fix's java  moved!")


def checkout_bug_fix(proj, id):
    #创建目录保存bug
    if not os.path.exists(work_path+"buggy"):
        os.makedirs(work_path+"buggy")
    bug_id = str(id)
    os.chdir(work_path)
    if not os.path.exists(work_path+"buggy/"+proj_name+'_'+bug_id):
        os.system("defects4j checkout -p "+proj_name+" -v "+bug_id+"b -w " + work_path+"buggy/"+proj_name+'_'+bug_id)
        # print("checkout bug %s%s done"%(proj, id))
        log("checkout bug %s%s done"%(proj, id))
    else:
        # print("%s%s bug has exist,needn't checkout!"%(proj, id))
        log("%s%s bug has exist,needn't checkout!"%(proj, id))
    
    #创建目录保存fix
    if not os.path.exists(work_path+"fixed"):
        os.makedirs(work_path+"fixed")
    bug_id = str(id)
    os.chdir(work_path)
    if  not os.path.exists(work_path+"fixed/"+proj_name+'_'+bug_id):
        os.system("defects4j checkout -p "+proj_name+" -v "+bug_id+"f -w " + work_path+"fixed/"+proj_name+'_'+bug_id)
        # print("checkout fix %s%s done"%(proj, id))
        log("checkout fix %s%s done"%(proj, id))
    else:
        # print("%s%s fix has exist,needn't checkout!"%(proj, id))
        log("%s%s fix has exist,needn't checkout!"%(proj, id))


def create_oracle_and_delta(bugs):
    #若Patches与py文件不在同一目录下，可以修改patches_path
    patches_path = work_path + "Patches"
    patch_list = findAllfile(patches_path,[])
    log("/************* Begin create oracle and delta! **************/")
    # 遍历629个补丁
    for patchfile in patch_list:
        patch_name = patchfile.split('/')[-1]
        data = patch_name.split('-')
        if "plausible.patch" in data:
            patchNum = data[0][-1]+"-plausible"
        else:
            patchNum = data[0][-1]
        proj,id,tool = data[1],data[2],data[3].split('.')[0]
        # print("- proj: %s id: %s tool: %s"%(proj,id,tool))
        if id not in bugs[proj].keys():
            oracle_warnning("warnning: %s-%s-%s doesn't in csvfile"%(proj,id,tool))
            continue
        create_oracle(bugs, patchfile, patch_name, patchNum, proj, id, tool)
        create_delta(bugs, patchfile, patch_name, patchNum, proj, id, tool)
    log("/************* Create oracle and delta finished! **************/")

def create_oracle(bugs, patchfile, patch_name, patchNum, proj, id, tool):
    log("* %s-%s-%s-%s oracle begin!"%(proj,id,tool, patchNum))
    javaFileName = bugs[proj][id][0].split('/')[-1]
    buggy_path = work_path+'buggy/'+proj+'_'+id+'/'
    
    #创建工具名文件夹
    tool_path = work_path+proj+'/'+id+'/'+tool+'/'+patchNum+'/'  
    if not os.path.exists(tool_path): 
        os.makedirs(tool_path) 
    
    # 创建并进入patch文件夹
    patch_path = tool_path + "patch/"
    if not os.path.exists(patch_path): 
        os.makedirs(patch_path)
    
    # 标记patch修改的java是否和标准补丁修改的相一致
    issame = True
    # 标记patch修改的java文件数量是否多于1个,如果是，将java文件拷至bug文件夹，生成半成品oracle并跳过打补丁过程
    multiPatch = False
    
    with open(patchfile) as p:
        difffiles = p.read().split('\n\n\n')
        if len(difffiles) > 1:
            multiPatch = True
            # print("!!!!!!!!!!WARNNING_1: %s-%s-%s.patch changes more than one javaFile!"%(proj,id,tool))
            delta_warnning("!!!!!!!!!!WARNNING_1: %s-%s-%s.patch changes more than one javaFile!"%(proj,id,tool))
        for diffs in difffiles:
            diffs = diffs.split('\n')
            targetpatch = diffs[0].split("--- ")[1].strip()
            targetjava = targetpatch.split('/')[-1]
            if targetjava != javaFileName:  # 判断patch修改的java是否和标准补丁修改的相一致如不一致，把不一致的java文件的fix版本拷到fix文件夹中
                os.system("cp "+work_path+'fixed/'+proj+'_'+id+'/'+targetpatch+" "+work_path+proj+'/'+id+"/fix")  
                issame = False
                # print("!!!!!!!!!!WARNNING_2: %s-%s-%s.patch changes different javaFile with fixed version!"%(proj,id,tool))
                oracle_warnning("!!!!!!!!!!WARNNING_2: %s-%s-%s.patch changes different javaFile with fixed version!"%(proj,id,tool))
                # print("targetjava: %s, javaFileName: %s"%(targetjava, javaFileName))
                os.system("cp "+work_path+'buggy/'+proj+'_'+id+'/'+targetpatch+" "+work_path+proj+'/'+id+"/bug")  # 拷贝工具要修改的java源文件

            # 拷贝打补丁所需文件：java源文件
            os.system("cp "+buggy_path+targetpatch+" "+patch_path)  # 拷贝bug源文件,注意，此处拷贝的是patch文件中要修改的java文件
    
    os.chdir(patch_path)
    # 拷贝打补丁所需文件：patch补丁文件
    os.system("cp "+patchfile+" "+patch_path) # 拷贝patch补丁文件
    os.system("dos2unix ./*")  # 修改patch目录下所有文件的编码方式
    os.system("patch -u -l --fuzz=15 < "+patch_name) # 打补丁
    # print("patch %s done!" % patch_name)
    log("patch %s done!" % patch_name)

    # 生成oracle.txt,暂未考虑patch中修改的是不一样的java文件
    with open(tool_path+"oracle.txt","a") as oracle: #创建oracle.txt
        flag = 0
        for info in bugs[proj][id][1:]:
            flag += 1
            if flag > 1:
                oracle.write('\n')
            info = info.replace('_', ',')
            if ',' in info:
                if issame == False:
                    oracle.write("null("+work_path+proj+'/'+id+"/fix/"+javaFileName+")"+'\n')
                    break
                else:
                    oracle.write(work_path+proj+'/'+id+"/fix/"+javaFileName+":"+info)
        
    # print("%s oracle.txt created" % patch_name)
    log("    %s-%s-%s oracle finished!"%(proj,id,tool))
    
    # 如果该补丁针对多个java，则不覆盖补丁文件
    if multiPatch:
        return
    # 用diff生成标准补丁
    os.system("diff -r -u -w "+work_path+proj+'/'+id+"/bug/"+targetjava+" "+patch_path+targetjava+" > "+patch_path+"a.txt")
    with open("a.txt") as a:
        a_lines = a.readlines()[2:]
    with open(patch_name,'r+') as p:
        p_lines = p.readlines()[0:2]
        n_lines = p_lines+a_lines
        p.seek(0)  # 指针重定位到开头
        p.truncate()  # 清空文件内容
        p.writelines(n_lines)
    
    #删除临时文件
    os.system("find . -name '*.txt' | xargs rm -rf")
    os.system("find . -name '*.orig' | xargs rm -rf")


def create_delta(bugs, patchfile, patch_name, patchNum, proj, id, tool):
    log("* %s-%s-%s delta begin!"%(proj,id,tool))
    tool_path = work_path+proj+'/'+id+'/'+tool+'/'+patchNum+'/'
    patch_path = tool_path + "patch/"
    javaFileName = ''
    bugJavaPath = ''
    patchJavaPath = ''

    delta = open(tool_path+"delta.txt", 'a') # 创建delta文件
    with open(patch_path+patch_name, 'r') as patch: # 打开.patch文件


        lineNo_bug = 0 # bug.java中的当前行数
        lineNo_patch = 0 # patch.java中的当前行数
        state = 0 # 标记状态
        keyBugLn, keyPatchLn = 0, 0 # 关键行数
        keyBugCol, keyPatchCol = 0, 0 # 关键列数
        patchCol = 0
        lines = patch.readlines()
        for l in lines:
            if l[0:3] == "---":
                javaFileName = l.split("--- ")[1].strip().split('/')[-1]
                bugJavaPath = work_path+proj+'/'+id+'/bug/'+javaFileName
                patchJavaPath = patch_path + javaFileName

            if l[0] == "@":
                line_a = l.split(' ')
                #         number_3
                #            |
                #@@ -145,7 +145,8 @@
                #     |  |      |
                #     |number_2 |
                #     |      number_4
                # number_1  
                number_1 = line_a[1].split(',')[0].split('-')[1]		
                number_2 = line_a[1].split(',')[1]
                number_3 = line_a[2].split(',')[0].split('+')[1]
                number_4 = line_a[2].split(',')[1]
                lineNo_bug = int(number_1) - 1
                lineNo_patch = int(number_3) - 1
                continue

            if l[0] != '+' and l[0] != '-' and l[0] != '@':
                patchCol = count_Column(l)  #这一行的起始列数
                lineNo_bug += 1
                lineNo_patch += 1
                if state != 0:                # !!!!!Path还没加!!!!!!
                    if state == 2: # 替换的情况
                        # print("    Has a replace!")
                        log("    Has a replace!")
                        delta.write(bugJavaPath+':'+str(keyBugLn)+','+str(keyBugCol)+'\n')
                        delta.write(patchJavaPath+':'+str(keyPatchLn)+','+str(keyPatchCol)+'\n')
                    elif state == 1: # 删除的情况
                        # print("    Has a delete!")
                        log("    Has a delete!")
                        delta.write(bugJavaPath+':'+str(keyBugLn)+','+str(keyBugCol)+'\n')
                        delta.write('null('+patchJavaPath+':'+str(keyPatchLn)+','+str(keyPatchCol)+';after)\n')
                    elif state == 3: # 插入的情况
                        # print("    Has a insert!")
                        log("    Has a insert!")
                        keyBugLn = lineNo_bug
                        keyBugCol = patchCol
                        delta.write('null('+bugJavaPath+':'+str(keyBugLn)+','+str(keyBugCol)+';before)\n')
                        delta.write(patchJavaPath+':'+str(keyPatchLn)+','+str(keyPatchCol)+'\n')
                    state = 0 # 退出当前状态，返回状态0

            if l[0] == '-' and l[1] != '-':
                lineNo_bug += 1
                if state == 0: # 如果处于状态0，进状态1并记录行列
                    state = 1
                    keyBugLn = lineNo_bug
                    keyBugCol = count_Column(l)
                    keyPatchLn = lineNo_patch
                    keyPatchCol = patchCol

            if l[0] == '+' and l[1] != '+':
                lineNo_patch += 1
                if state == 1: # 如果当前处于状态1，则此情况为替换，进入状态2并记录行列
                    state = 2
                    keyPatchLn = lineNo_patch
                    keyPatchCol = count_Column(l)
                if state == 0: # 如果当前处于状态0或3，则此情况为插入，进入状态3并记录行列
                    state = 3
                    keyPatchLn = lineNo_patch
                    keyPatchCol = count_Column(l)
    delta.close()
    # print("    proj: %s id: %s tool: %s finished!"%(proj,id,tool))
    log("    %s-%s-%s delta finished!"%(proj,id,tool))


def count_Column(l):
    keyColumn = 0
    if l[0] == '+' or l[0] == '-':
        l = l[1:]
    else:
        keyColumn = -1
    for c in l: # 排除'+'和'-'
        if c ==' ':
            keyColumn += 1
        else:
            if c == "\t":
                log("!!!!!!!!!!WARNNING: Find tabs !")
            break
    return keyColumn
        

def replace_tab():
    #若Patches与py文件不在同一目录下，可以修改patches_path
    patches_path = work_path + "Patches"
    patch_list = findAllfile(patches_path,[])
    log("/************* Begin replace tab! **************/")
    # 遍历629个补丁
    for patchfile in patch_list:
        print(patchfile)
        with open(patchfile,"r+") as p:
            data = p.read()
            newdata = data.replace("\t","    ")
            p.seek(0)  # 指针重定位到开头
            p.truncate()  # 清空文件内容
            p.write(newdata)
    log("/************* End replace tab! **************/")

if __name__ == '__main__':
    replace_tab()
    proj = ['Chart', 'Time', 'Math', 'Lang', 'Closure']
    bugs = get_data("metadata_Chart_Closure.csv")
    for proj_name in proj:
        for bug_id in bugs[proj_name]:
            checkout_bug_fix(proj_name,bug_id)
            creat_jar(proj_name, bug_id)
            #add_jar(proj_name, bug_id) #  只需第一次运行时打开，其余不需要
            move_bug_fix(proj_name, bug_id, bugs)
    create_oracle_and_delta(bugs) #  重复生成会额外添加

