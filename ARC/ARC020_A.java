import java.util.Scanner;
public class ARC020_A {
    static Scanner sc=new Scanner(System.in);
    
    public static void main(String[] args){
        int a=Math.abs(sc.nextInt());
        int b=Math.abs(sc.nextInt());
        if(a==b)System.out.println("Draw");
        else if(a>b)System.out.println("Bug");
        else System.out.println("Ant");
    }

}
