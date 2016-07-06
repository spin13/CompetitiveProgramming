import java.util.Scanner;
 
public class Main {
    static Scanner sc=new Scanner(System.in);
    
    public static void main(String[] args){
        int N=sc.nextInt();
        int c=N;
        int s=0;
        for(int i=0;i<N;i++){
            int a=sc.nextInt();
            if(a==0)c--;
            s+=a;
        }
        System.out.println((int)Math.ceil((double)s/(double)c));
    }
}
