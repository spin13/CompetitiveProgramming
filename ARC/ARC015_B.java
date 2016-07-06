import java.util.Scanner;
public class ARC015_B {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args){
        int[] ans=new int[6];
        int N=sc.nextInt();
        double M=0.0;
        double m=0.0;
        for(int i=0;i<N;i++){
            M=sc.nextDouble();
            m=sc.nextDouble();
            
            if(M>=35.0){
                ans[0]++;
            }else if(M>=30.0 && M<35.0){
                ans[1]++;
            }else if(M>=25.0 && M<30.0){
                ans[2]++;
            }
            
            if(m>=25.0)ans[3]++;
            if(m<0.0 && M>=0.0)ans[4]++;
            if(M<0.0)ans[5]++;
        }
        
        for(int i=0;i<=4;i++)System.out.print(ans[i]+" ");
        System.out.println(ans[5]);
    }
}
