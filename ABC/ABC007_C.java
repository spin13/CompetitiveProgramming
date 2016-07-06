/*
 * Accepted
 */

import java.util.Arrays;
import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class ABC007_C {
    static Scanner sc=new Scanner(System.in);
    static int[] dx={0,0,1,-1};
    static int[] dy={1,-1,0,0};
    static int INF=50;
    
    public static void main(String[] args){
        int R=sc.nextInt();//y
        int C=sc.nextInt();//x
        int sy=sc.nextInt()-1, sx=sc.nextInt()-1;
        int gy=sc.nextInt()-1, gx=sc.nextInt()-1;
        char[][] map=new char[R][C];
        int[][] ans=new int[R][C];
        for(int i=0;i<ans.length;i++)Arrays.fill(ans[i], INF);
        ans[sy][sx]=0;
        for(int i=0;i<R;i++){
            String s=sc.next();
            map[i]=s.toCharArray();
        }
        
        Queue<Integer> qx=new LinkedList<Integer>();
        Queue<Integer> qy=new LinkedList<Integer>();
        qx.add(sx);qy.add(sy);
        
        int px,py;
        
        while(!qx.isEmpty()){
            px=qx.poll();py=qy.poll();
            //if(px==gx && py==gy)break;
            for(int i=0;i<4;i++){
                int mx=px+dx[i];
                int my=py+dy[i];
                if(map[my][mx]=='#')continue;
                if(ans[my][mx]==INF){
                    qx.add(mx);
                    qy.add(my);
                    ans[my][mx]=ans[py][px]+1;
                }
            }
        }
        
        System.out.println(ans[gy][gx]);        
    }
}
