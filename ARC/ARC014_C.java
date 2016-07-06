import java.util.Scanner;

public class ARC014_C{
    private static final Scanner sc=new Scanner(System.in);
    
    public static void main(String[] args){
        int n=sc.nextInt();
        String str=sc.next();
        
        int r=str.length()-str.replaceAll("R", "").length();
        int g=str.length()-str.replaceAll("G", "").length();
        int b=str.length()-str.replaceAll("B", "").length();
        
        System.out.println((r%2)+(g%2)+(b%2));
    }
}