import java.util.Scanner;

public class ARC022_A {
    static Scanner sc=new Scanner(System.in);
    
    public static void main(String[] args){
        String s=sc.next().toUpperCase();
        int a=0;
        boolean f=true;
        if((a=s.indexOf("I",0)) == -1)f=false;
        if((a=s.indexOf("C",a)) == -1)f=false;
        if((a=s.indexOf("T",a)) == -1)f=false;
        System.out.println(f? "YES" : "NO");
    }
}
