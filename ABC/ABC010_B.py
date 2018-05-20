N=int(input())
flowers=map(int, input().split())

# 1~9までなのでリストつくる
reduce=[0, 0, 1, 0, 1, 2, 3, 0, 1, 0]

ans=0
for i in flowers:
	ans+=reduce[i]
print(ans)
    