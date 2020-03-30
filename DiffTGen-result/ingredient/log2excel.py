# -*- coding:utf-8 -*-
import os
import xlrd
import xlwt
import re

class Patch:
    def __init__(self, proj, id, tool, num, category = None):
        self.proj = proj
        self.id = id
        self.tool = tool
        self.num = num
        self.category = category
    def set_category(self, category):
        self.category = category


class Patch_time:
    def __init__(self, Target_time = '0', Method_time = '0', Total_time = '0', Case_time = '0'):
        self.Target_time = Target_time
        self.Method_time = Method_time
        self.Total_time = Total_time
        self.Case_time = Case_time

    def set_Target_time(self, Target_time):
        self.Target_time = Target_time
    def set_Method_time(self, Method_time):
        self.Method_time = Method_time
    def set_Total_time(self, Total_time):
        self.Total_time = Total_time
    def set_Case_time(self, Case_time):
        self.Case_time = Case_time


class Log:
    def __init__(self, patch = None, time = None, result = "N", logfile = ''):
        self.patch = patch
        self.time = time
        self.result = result
        self.logfile = logfile
        # if logfile != '':
        #     setlog()
    def setlog(self):
        logfile = self.logfile
        if not os.path.exists(logfile):
            print("%s haven't created!!"%logfile)
            return False
        
        with open(logfile) as logs:
            logs = logs.readlines()
            if logs == []:
                print("\nERROR!!!, %s内容为空,即将删除\n"%logfile)
                return False

            #get proj,id, tool, patchNum from log; 
            bugid = logs[0].split(": ")[-1].strip()
            tool = logs[1].split(": ")[-1].strip()
            # print("bugid: %s\n"%bugid)
            proj, id, Num = bugid.split('_')
            self.patch = Patch(proj, id, tool, Num) 

            self.time = Patch_time() 
            for log in logs:
                if "Test Target Generation execution time" in log:
                    self.time.set_Target_time(log.split(": ")[-1].strip())

                elif "Test Method Generation execution time" in log:
                    self.time.set_Method_time(log.split(": ")[-1].strip())

                elif "Total execution time" in log:
                    self.time.set_Total_time(log.split(": ")[-1].strip())

                elif "Test Case Generation execution time" in log:
                    self.time.set_Case_time(log.split(": ")[-1].strip())

        #created case successful
        if  self.time.Case_time != "0":
            self.result = "Y"
        else:
            self.result = "N"

        #compile failed
        if self.time.Target_time == "0":
            return False
        return True


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
    #get patch's path
    work_path = os.getcwd()+'/'
    patches_path = work_path + "Patches"
    patch_list = findAllfile(patches_path,[])

    #creat xslx
    excel = xlwt.Workbook(encoding='utf-8')
    sheet = excel.add_sheet('sheet1', cell_overwrite_ok=True)
    # 设置样式
    style = xlwt.XFStyle()  # 初始化样式
    font = xlwt.Font()  # 创建字体
    font.name = u'微软雅黑'  # 字体类型
    font.colour_index = 0   # 字体颜色
    font.underline = True  # 下划线
    font.italic = True   # 斜体
    font.height = 240    # 字体大小   200等于excel字体大小中的10
    style.font = font   # 设定样式

    sheet.write(0, 0, 'Dcorrect',style)
    sheet.write(0, 6, 'Doverfitting', style)
    #生成表头
    for i in range(2):
        sheet.write(1, 0+i*6, 'Patch-ID',style)
        sheet.write(1, 1+i*6, 'result',style)
        sheet.write(1, 2+i*6, 'Test target',style)
        sheet.write(1, 3+i*6, 'Test Method',style)
        sheet.write(1, 4+i*6, 'Test Total',style)
        sheet.write(1, 5+i*6, 'Test Case',style)

    # 遍历所有补丁
    Row = {"Dcorrect":2, "Doverfitting":2}
    Column = {"Dcorrect":0, "Doverfitting":1}
    for patchfile in patch_list:

        #according patch to find corresponding runlog path
        patch_name = patchfile.split('/')[-1]
        data = patch_name.split('-')
        if "plausible.patch" in data:
            patchNum = data[0][-1]+"-plausible"
        else:
            patchNum = data[0][-1]
        proj,id,tool = data[1],data[2],data[3].split('.')[0]        
        runlog_dir = work_path+proj+'/'+id+"/"+tool+"/"+patchNum+"/"+"runlog.txt"

        log = Log(logfile = runlog_dir)
        if log.setlog() == False:
            continue

        #get type(Dcorrect or Doverfitting) from patchfile path
        category = re.findall('Patches/([a-zA-z]*)', patchfile)[0]# use re to find either Doccorrect or Doverfitting
        log.patch.set_category(category)

        patch = log.patch
        time = log.time
        row = Row[patch.category]
        column = Column[patch.category]
        sheet.write(row, 0+column*6, "patch"+patch.num+'-'+patch.proj+'-'+patch.id+'-'+patch.tool, style)
        sheet.write(row, 1+column*6, log.result, style)
        sheet.write(row, 2+column*6, time.Target_time, style)
        sheet.write(row, 3+column*6, time.Method_time, style)
        sheet.write(row, 4+column*6, time.Total_time, style)
        sheet.write(row, 5+column*6, time.Case_time, style)
        Row[log.patch.category] = row+1
    excel.save(os.getcwd() + '//' + 'result_template.xlsx')

