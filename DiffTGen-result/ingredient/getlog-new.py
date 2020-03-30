import os
import json

zero_patch = []
def getlog(logfile):
    global zero_patch
    if not os.path.exists(logfile):
        print("%s haven't created!!"%logfile)
        return 0
    
    result = {}
    with open(logfile) as logs:
        
        logs = logs.readlines()
        if logs == []:
            print("\nERROR!!!, %s内容为空,即将删除\n"%logfile)
            return -1
        bugid = logs[0].split(": ")[-1].strip()
        tool = logs[1].split(": ")[-1].strip()

        
        result["patch"] = tool+"_"+bugid
        result["time"] = {"Target":'0', "Method":'0', "Total":'0', "Case":'0'}
        for log in logs:
            if "Test Target Generation execution time" in log:
                result["time"]["Target"] = log.split(": ")[-1].strip()

            elif "Test Method Generation execution time" in log:
                result["time"]["Method"] = log.split(": ")[-1].strip()

            elif "Total execution time" in log:
                result["time"]["Total"] = log.split(": ")[-1].strip()

            elif "Test Case Generation execution time" in log:
                result["time"]["Case"] = log.split(": ")[-1].strip()

            

    
    if result["time"]["Target"] == '0':
        print("all time in %s is 0!" % logfile)
        zero_patch.append(logfile)
        return 1
    return result


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
            

if __name__ == "__main__":
    
    work_path = os.getcwd()+'/'
    patches_path = work_path + "Patches"
    #ingredient_dir = "/home/whj/dowork/ingredient/"
    ingredient_dir = work_path
    patch_list = findAllfile(patches_path,[])
    # 遍历629个补丁
    with open("result.txt", 'a') as result:
        alllog = []
        for patchfile in patch_list:
            patch_name = patchfile.split('/')[-1]
            data = patch_name.split('-')
            if "plausible.patch" in data:
                patchNum = data[0][-1]+"-plausible"
            else:
                patchNum = data[0][-1]
            proj,id,tool = data[1],data[2],data[3].split('.')[0]        
            runlog_dir = ingredient_dir+proj+'/'+id+"/"+tool+"/"+patchNum+"/"
            logs = getlog(runlog_dir+"runlog.txt")
            if logs == 0:
                continue

            elif logs == -1:
                os.remove(runlog_dir+"runlog.txt")
                print("%s removed!"%(runlog_dir+"runlog.txt"))
                continue

            elif logs == 1:
                os.remove(runlog_dir+"runlog.txt")
                print("%s removed!"%(runlog_dir+"runlog.txt"))
                continue
            alllog.append(json.dumps(logs)+'\n')
            #result.writelines(json.dumps(logs)+'\n')
        alllog.sort()
        zero_patch.sort()
        for i in range(len(alllog)):
            result.writelines(alllog[i])
        for i in range(len(zero_patch)):
            result.writelines(zero_patch[i]+'\n')
        


