import java.util.Scanner;

public class Domestic2004_B{
    private static final Scanner sc=new Scanner(System.in);
    static int[] mx={1,-1,0,0};
    static int[] my={0,0,1,-1};
    static char[][] map;
    static int cnt=0;
    static int x;
    static int y;

    static String[] getMap(){
        String[] m=new String[y];
        for(int i=0;i<y;i++){
            m[i]=sc.next();
        }
        return m;
    }


    static void putMap(String[] m){
        for(int i=0;i<y;i++){
            for(int i2=0;i2<x;i2++){
                map[i][i2]=m[i].charAt(i2);
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
            String[] m=getMap();
            putMap(m);

            int[] start=sstart();
            int sx=start[1];
            int sy=start[0];

            dfs(sy,sx);
            System.out.println(cnt+1);
        }
    }


    static int dfs(int sy, int sx){
        if(sy>=y || sx>=x || sy<0 || sx<0)return 0;
        if(map[sy][sx]=='#')return 0;
        if(map[sy][sx]=='.'){
            cnt++;
            map[sy][sx]='#';
        }
        for(int i=0;i<4;i++){
            dfs(sy+my[i], sx+mx[i]); 
        }
        return cnt;
    }

}

