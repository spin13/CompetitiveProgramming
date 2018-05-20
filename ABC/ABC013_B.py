a=int(input())
b=int(input())

print(min(
    abs(a-b),
    (9-a)+b+1,
    (9-b)+a+1
))