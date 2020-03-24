import os
import subprocess

DiffTGen_dir = "/home/whj/dowork/DiffTGen"
ingredient_dir = "/home/whj/dowork/ingredient/"
work_path = os.getcwd()+'/'
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
    # 遍历629个补丁
    for patchfile in patch_list:
        patch_name = patchfile.split('/')[-1]
        data = patch_name.split('-')
        proj,id,tool = data[1],data[2],data[3].split('.')[0]
        if proj == "Closure" and id == "46":
            continue
        if proj == "Lang" and id == "63":
            continue

        if ((proj == "Chart" and id == "19" and tool == "AVATAR") or \
        (proj == "Chart" and id == "19" and tool == "FixMiner") or \
        (proj == "Chart" and id == "19" and tool == "kPAR") or \
        (proj == "Chart" and id == "4" and tool == "AVATAR") or \
        (proj == "Chart" and id == "7" and tool == "SimFix") or \
        (proj == "Lang" and id == "7" and tool == "AVATAR") or \
        (proj == "Math" and id == "59" and tool == "AVATAR") or \
        (proj == "Math" and id == "59" and tool == "SimFix") or \
        (proj == "Math" and id == "89" and tool == "AVATAR") or \
        (proj == "Math" and id == "89" and tool == "kPAR") or \
        (proj == "Math" and id == "89" and tool == "TBar") or \
        (proj == "Math" and id == "75" and tool == "FixMiner") or \
        (proj == "Math" and id == "75" and tool == "kPAR") or \
        (proj == "Math" and id == "75" and tool == "SimFix") or \
        (proj == "Math" and id == "75" and tool == "TBar") or \
        (proj == "Lang" and id == "39" and tool == "SimFix") or \
        (proj == "Lang" and id == "58" and tool == "SimFix") or \
        (proj == "Lang" and id == "57" and tool == "TBar") or \
        (proj == "Lang" and id == "59" and tool == "TBar") or \
        (proj == "Math" and id == "79" and tool == "SimFix")) == False:
            continue

        error_dir = ingredient_dir+proj+'/'+id
        bug = proj+'_'+id
        if os.path.exists(error_dir+"/"+tool+"/"+"runlog.txt"):
            print("%s-%s-%s runlogs exists, jump it!"%(proj, id, tool))
            continue
        print("/************ Begin to run %s_%s_%s ! ************/"%(proj,id,tool))
        script = "java -cp :"+DiffTGen_dir+"/lib/*:"+DiffTGen_dir+"/build testgen.Main "
        script = script + " -bugid "+bug
        script = script + " -repairtool "+tool
        script = script + " -difftgendpath "+DiffTGen_dir
        script = script + " -evosuitejpath "+DiffTGen_dir+"/lib/evosuite-1.0.6.jar"
        script = script + " -dependjpath "+error_dir+"/"+proj.lower()+id+".jar"
        script = script + " -outputdpath "+DiffTGen_dir+"/output"
        script = script + " -inputfpath "+error_dir+"/"+tool+"/delta.txt"
        script = script + " -oracleinputfpath "+error_dir+"/"+tool+"/oracle.txt"
        script = script + " -evosuitetrials 30"
        script = script + " -evosuitetimeout 60"
        script = script + " -runparallel true"
        script = script + " -stopifoverfittingfound true "+"> "+error_dir+"/"+tool+"/"+"runlog.txt"

        # child = subprocess.Popen(script,shell=True)
        # child.wait()
        os.system("timeout 1800 "+script)
        print("/************ Run %s_%s_%s done !************\n\n"%(proj,id,tool))


if __name__ == '__main__':
    autorun()

