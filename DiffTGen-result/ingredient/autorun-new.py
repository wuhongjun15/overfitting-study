import os
import subprocess

DiffTGen_dir = "/home/whj/dowork/DiffTGen"
#ingredient_dir = "/home/whj/dowork/ingredient/"
work_path = os.getcwd()+'/'
ingredient_dir = work_path
print("work_path: "+work_path)

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

def autorun():
    patches_path = work_path + "Patches"
    patch_list = findAllfile(patches_path,[])
    # 遍历所有个补丁
    for patchfile in patch_list:
        patch_name = patchfile.split('/')[-1]
        data = patch_name.split('-')
        
        if "plausible.patch" in data:
            patchNum = data[0][-1]+"-plausible"
        else:
            patchNum = data[0][-1]

        proj,id,tool = data[1],data[2],data[3].split('.')[0]
        if proj == "Closure" and id == "46":
            continue
        if proj == "Lang" and id == "63":
            continue
        # Only consider Chart and Closure
        if proj != "Chart" and proj != "Closure":
            continue


        if proj != "Closure" or id != "31" or tool != "Jaid" or patchNum != "1":
            continue

        error_dir = ingredient_dir+proj+'/'+id
        bug = proj+'_'+id+'_'+patchNum
        if os.path.exists(error_dir+"/"+tool+"/"+patchNum+"/runlog.txt"):
            print("%s-%s-%s-%s runlogs exists, jump it!"%(proj, id, tool, patchNum))
            continue
        print("/************ Begin to run %s_%s_%s_%s ! ************/"%(proj,id,tool,patchNum))
        script = "java -cp :"+DiffTGen_dir+"/lib/*:"+DiffTGen_dir+"/build testgen.Main "
        script = script + " -bugid "+bug
        script = script + " -repairtool "+tool
        script = script + " -difftgendpath "+DiffTGen_dir
        script = script + " -evosuitejpath "+DiffTGen_dir+"/lib/evosuite-1.0.6.jar"
        script = script + " -dependjpath "+error_dir+"/"+proj.lower()+id+".jar"
        script = script + " -outputdpath "+DiffTGen_dir+"/extra_output"
        script = script + " -inputfpath "+error_dir+"/"+tool+"/"+patchNum+"/delta.txt"
        script = script + " -oracleinputfpath "+error_dir+"/"+tool+"/"+patchNum+"/oracle.txt"
        script = script + " -evosuitetrials 30"
        script = script + " -evosuitetimeout 60"
        script = script + " -runparallel true"
        script = script + " -stopifoverfittingfound true "+"> "+error_dir+"/"+tool+"/"+patchNum+"/runlog.txt"

        # child = subprocess.Popen(script,shell=True)
        # child.wait()
        os.system("timeout 1800 "+script)
        print("/************ Run %s_%s_%s done !************\n\n"%(proj,id,tool))


if __name__ == '__main__':
    autorun()

