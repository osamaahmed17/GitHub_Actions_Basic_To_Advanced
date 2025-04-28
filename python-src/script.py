from datetime import datetime
import argparse


now = datetime.now()
print("This is the time now", now.strftime("%Y-%m-%d %H:%M:%S"))

parser = argparse.ArgumentParser(description="Process some inputs.")
parser.add_argument('--input1', type=str, required=True, help='First input')
parser.add_argument('--input2', type=str, required=True, help='Second input')
    
args = parser.parse_args()
    
print("time now" +now.strftime("%Y-%m-%d %H:%M:%S")+ args.input1)
print("Itime now" +now.strftime("%Y-%m-%d %H:%M:%S")+args.input2)