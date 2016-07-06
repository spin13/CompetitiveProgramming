import java.util.Scanner;

public class ICPC2014_B {
    static Scanner sc=new Scanner(System.in);
    static int[][] map;
    static int N;
    public static void main(String[] args){

        int ans=0;
        while(true){
            ans=0;
            N=sc.nextInt();
            if(N==0)break;
            map=new int[N][5];
            for(int i=0;i<N;i++){
                for(int i2=0;i2<5;i2++){
                    map[i][i2]=sc.nextInt();
                }
            }
            
            for(int i=0;i<100;i++){
                ans+=five();
                ans+=four();
                ans+=three();
                for(int i2=0;i2<20;i2++)swapping();
            //enm();
            //System.out.println(ans);
            }
            System.out.println(ans);
        }
    }

    static int five(){
        int sum=0;
        for(int i=0;i<N;i++){
            if(map[i][0]==map[i][1]
                    && map[i][1]==map[i][2]
                            && map[i][2]==map[i][3]
                                    && map[i][3]==map[i][4]){
                sum+=(map[i][0]*5);
                map[i][0]=0;map[i][1]=0;map[i][2]=0;map[i][3]=0;map[i][4]=0;
            }

        }
        return sum;
    }
    
    static int four(){
        int sum=0;
        for(int i=0;i<N;i++){
            if(map[i][0]==map[i][1]
                    && map[i][1]==map[i][2]
                            && map[i][2]==map[i][3]){
                sum+=(map[i][0]*4);
                map[i][0]=0;map[i][1]=0;map[i][2]=0;map[i][3]=0;
                
            }else if(map[i][1]==map[i][2]
                    && map[i][2]==map[i][3]
                            && map[i][3]==map[i][4]){
                sum+=(map[i][1]*4);
                map[i][1]=0;map[i][2]=0;map[i][3]=0;map[i][4]=0;
            }
        }
        return sum;
    }
    
    static int three(){
        int sum=0;
        for(int i=0;i<N;i++){
            if(map[i][0]==map[i][1]
                    && map[i][1]==map[i][2]){
                sum+=(map[i][0]*3);
                map[i][0]=0;map[i][1]=0;map[i][2]=0;
                
            }else if(map[i][1]==map[i][2]
                    && map[i][2]==map[i][3]){
                sum+=(map[i][1]*3);
                map[i][1]=0;map[i][2]=0;map[i][3]=0;
                
            }else if(map[i][2]==map[i][3]
                    && map[i][3]==map[i][4]){
                sum+=(map[i][2]*3);
                map[i][2]=0;map[i][3]=0;map[i][4]=0;
            }
        }
        return sum;
    }
    
    
    static void swapping(){
        int tp=0;
        for(int i=0;i<N-1;i++){
            for(int i2=0;i2<5;i2++){
                if(map[i+1][i2]==0){
                    tp=map[i][i2];
                    map[i][i2]=0;
                    map[i+1][i2]=tp;
                }
            }
        }
    }
    
}
