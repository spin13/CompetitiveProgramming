import java.util.Scanner;
 
public class ARC012_B{
    private static int N; //num
    private static double v1;
    private static double v2;
    private static double L; //starting distance
 
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();
        v1=sc.nextDouble();
        v2=sc.nextDouble();
        L=sc.nextDouble();
        double sum=0; //v1
        double sum2=0;//v2
 
 
        for(int i=0;i<N;i++){
            sum=L/v1;
            sum2=sum*v2;
            L=sum2;
        }
        System.out.println(L);
    }
}