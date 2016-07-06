import java.util.Scanner;
import java.util.ArrayList;
public class ARC010_A{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
 
        int N=sc.nextInt();
        int M=sc.nextInt();
        int A=sc.nextInt(); //charge lim
        int B=sc.nextInt(); //charge
        int flag=0;
        ArrayList<Integer> a=new ArrayList<Integer>();
        int num=0;
        for(int i=1;i<=M;i++){
            if(N<0){
                flag=1;
                a.add(i);
            }else if(N<=A){
                N+=B;
            }
            num=sc.nextInt();
            N=N-num;
            if(N<0){
                flag=1;
                a.add(i);
            }
 
        }
 
        if(flag==0){
            System.out.println("complete");
        }else if(flag==1){
            System.out.println(a.get(0));
        }
    }
}