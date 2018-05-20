
S=input()
N=int(input())

for i in range(N):
    # 左端と右端
    l, r = map(int, input().split())

	# 先頭から;文字
    prefix = S[:l-1]
    # l,rの部分をreverseする [::-1]でreverse
    reversed_string = S[l-1:r][::-1]
    # 後ろからr文字
    suffix = S[r:]

    S = prefix + reversed_string + suffix

print(S)

