S = input()

I = False
C = False
T = False

for i in list(S):
    # Tを探す
    if I and C:
        if i == 'T' or i == 't': T = True
    # Cを探す
    elif I:
        if i == 'C' or i == 'c': C = True
    # Iを探す
    else:
        if i == 'I' or i == 'i': I = True

# 全部存在すればYES
if I and C and T:
    print('YES')
else:
    print('NO')

