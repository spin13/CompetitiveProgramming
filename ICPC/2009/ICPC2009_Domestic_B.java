import java.util.Scanner;

public class Domestic2009_B{
    private static final Scanner sc=new Scanner(System.in);
    
    static int[] mx={1,-1,0,0,-1,1,-1,1};
    static int[] my={0,0,1,-1,-1,-1,1,1};
    static int[][] map;
    static int cnt=0;
    static int x;
    static int y;

    static void putMap(){
        for(int i=0;i<y;i++){
            for(int i2=0;i2<x;i2++){
                map[i][i2]=sc.nextInt();
            }
        }
    }

    static int[] sstart(){
        int[] start=new int[2];
        for(int i=0;i<y;i++){
            for(int i2=0;i2<x;i2++){
                if(map[i][i2]==1){
                    start[0]=i;
                    start[1]=i2;
                    return start;
                }else if(i==(y-1) && i2==(x-1)){
                    start[0]=-1;
                    start[1]=-1;
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

            map=new int[y][x];
            putMap();
            
            

            while(true){
                int[] start=sstart();
                if(start[0]==-1 && start[1]==-1)break;
                int sx=start[1];
                int sy=start[0];    
                dfs(sy,sx);
                cnt++;
            }
            
            System.out.println(cnt);
        }
    }


    static int dfs(int sy, int sx){
        if(sy>=y || sx>=x || sy<0 || sx<0)return 0;
        if(map[sy][sx]==0)return 0;
        if(map[sy][sx]==1){
            map[sy][sx]=0;
        }

        for(int i=0;i<8;i++){
            dfs(sy+my[i], sx+mx[i]);
        }
        return 0;
    }
}

