import java.util.Scanner;
 
public class ARC003_A{
    private static String str;
    private static int[] a=new int[5];
 
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        str=sc.next();
 
        a[0]=str.length()-str.replaceAll("A", "").length();
        a[1]=str.length()-str.replaceAll("B", "").length();
        a[2]=str.length()-str.replaceAll("C", "").length();
        a[3]=str.length()-str.replaceAll("D", "").length();
        a[4]=str.length()-str.replaceAll("F", "").length();
 
        double d=(a[0]*4)+(a[1]*3)+(a[2]*2)+a[3];
        System.out.println(d/(double)N);
    }
}