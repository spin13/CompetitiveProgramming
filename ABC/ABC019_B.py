S = input()

ans = ''

i = 0
while(i < len(S)):
    current_character = S[i]
    # 現在の文字をansに追加
    ans += current_character
    count=0

    # 同じ文字である限りループ
    while(i < len(S)and current_character == S[i]):
        count+=1
        i+=1
    # ansにcountを追加する
    ans+=str(count)

print(ans)
    