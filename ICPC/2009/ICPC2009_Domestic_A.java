import java.util.Scanner;

public class Domestic2009_A{
    static final Scanner sc=new Scanner(System.in);
    static int[] dx={-1,0,1,0};
    static int[] dy={0,1,0,-1};

    public static void main(String[] args){
        
        while(true){
            int N=sc.nextInt();
            if(N==0)break;
            if(N==1){
                System.out.println(1+" "+1);
                continue;
            }
            int[] x=new int[200];
            int[] y=new int[200];

            for(int i=0;i<N-1;i++){
                int ni=sc.nextInt();
                int di=sc.nextInt();
                x[i+1]+=x[ni]+dx[di];
                y[i+1]+=y[ni]+dy[di];
            }
            int ax=0,ix=0,ay=0,iy=0;
            for(int i=0;i<N;i++){
                ax=Math.max(ax, x[i]);
                ix=Math.min(ix, x[i]);
                ay=Math.max(ay, y[i]);
                iy=Math.min(iy, y[i]);
            }
            System.out.println((ax-ix+1) +" "+ (ay-iy+1));
        }
    }
}