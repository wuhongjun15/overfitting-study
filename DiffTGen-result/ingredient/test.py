import os
import subprocess
for i in range(3):
    child = subprocess.Popen("ping -c4 www.baidu.com",shell=True)
    child.wait()
    print("~~!!!")
