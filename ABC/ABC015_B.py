import math

N=int(input())
A=map(int, input().split())

count=0
sum=0.0

for i in A:
    if i != 0:
        count+=1
        sum+=i

print(math.ceil(sum/count))