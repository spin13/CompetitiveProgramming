import java.util.Scanner;

public class ARC014_A{
    private static final Scanner sc=new Scanner(System.in);
    
    public static void main(String[] args){
        int n=sc.nextInt();
        if(n%2==0){
            System.out.println("Blue");
        }else{
            System.out.println("Red");
        }
    }
}