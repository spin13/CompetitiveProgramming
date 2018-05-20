# グラフ上をループで簡単に動けるように
# 上 下 右 左  の順
#(0, -1) 動くとグラフ上では上
mx = [0, 0, 1, -1]
my = [-1, 1, 0, 0]

def main():
    A=[]
    # 番兵
    # 配列外参照対策にグラフの周りに置くようにダミーを配置
    A.append([3000, 3000, 3000, 3000, 3000, 3000])
    A.append([3000] + list(map(int, input().split())) + [3000])
    A.append([3000] + list(map(int, input().split())) + [3000])
    A.append([3000] + list(map(int, input().split())) + [3000])
    A.append([3000] + list(map(int, input().split())) + [3000])
    A.append([3000, 3000, 3000, 3000, 3000, 3000])

    flag = False


    # ダミーの番兵は探索しないように1~4をループ
    for y in range(1, 5):
        for x in range(1, 5):
            if search(A, x, y):  flag = True

    print('CONTINUE' if flag else 'GAMEOVER')

def search(graph, x, y):
    for i in range(4):
        # グラフの現在地点から上下左右が同じ数字かどうか
        if graph[y][x] == graph[y+my[i]][x+mx[i]]:
            return True
    return False

main()


