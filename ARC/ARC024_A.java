import java.util.Scanner;

public class ARC024_A {
    static final Scanner sc=new Scanner(System.in);
    public static void main(String[] args){
        int N=sc.nextInt();
        int M=sc.nextInt();
        int[] a=new int[N];
        int[] b=new int[M];
        
        for(int i=0;i<N;i++)a[i]=sc.nextInt();
        for(int i=0;i<M;i++)b[i]=sc.nextInt();
        
        int ans=0;
        for(int i=0;i<N;i++){
            for(int i2=0;i2<M;i2++){
                if(a[i]==b[i2]){
                    a[i]=-1;
                    b[i2]=-1;
                    ans++;
                    break;
                }
            }
        }
        System.out.println(ans);
    }
}
