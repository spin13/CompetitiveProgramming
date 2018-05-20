A, B, C=map(int, input().split())

# どちらでもある
if A+B==C and A-B==C:
    print('?')
elif A+B!=C and A-B!=C:
    print('!')
elif A+B==C:
    print('+')
else:
    print('-')