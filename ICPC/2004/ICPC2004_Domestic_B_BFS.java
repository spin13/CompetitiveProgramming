import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class Domestic2004_B_BFS{
    private static final Scanner sc=new Scanner(System.in);
    static int[] mx={1,-1,0,0};
    static int[] my={0,0,1,-1};
    static int cnt;
    static char[][] map;
    static int x,y;
    static Queue<Integer> qx=new LinkedList<Integer>();
    static Queue<Integer> qy=new LinkedList<Integer>();

    static void putMap(int y, int x){
        for(int i=0;i<y;i++){
            String s=sc.next();
            for(int i2=0;i2<x;i2++){
                map[i][i2]=s.charAt(i2);
            }
        }
    }

    static int[] sstart(){
        int[] start=new int[2];
        for(int i=0;i<y;i++){
            for(int i2=0;i2<x;i2++){
                if(map[i][i2]=='@'){
                    start[0]=i;
                    start[1]=i2;
                    return start;
                }
            }
        }
        return start;   //start[0]‚ÍyŽ², [1]‚ÍxŽ²
    }

    public static void main(String[] args){

        while(true){
            cnt=0;
            x=sc.nextInt();y=sc.nextInt();
            if(x==0 && y==0)break;
            map=new char[y][x];
            putMap(y,x);
            int[] start=sstart();
            int sx=start[1];
            int sy=start[0];
            Queue<Integer> qx=new LinkedList<Integer>();
            Queue<Integer> qy=new LinkedList<Integer>();

            qx.add(sx);
            qy.add(sy);
            bfs(qy,qx);
             
            System.out.println(cnt+1);
             
        }
    }
    static int bfs(Queue<Integer> qy, Queue<Integer> qx){
        while(!qx.isEmpty()){
            int ty=qy.poll();
            int tx=qx.poll();

            for(int i=0;i<4;i++){
                int nexty=ty+my[i];
                int nextx=tx+mx[i];
                
                if(0<=nexty && 0<=nextx && y>nexty && x>nextx){
                    if(map[nexty][nextx] == '.'){
                        cnt++;
                        map[nexty][nextx]='#';
                        qy.add(nexty);
                        qx.add(nextx);
                    }
                }
            }
        }
        return cnt;
    }
}