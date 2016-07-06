import java.util.Arrays;
import java.util.Scanner;
public class ARC019_A {
    static Scanner sc=new Scanner(System.in);
    static String[] l={"O","D","I","Z","S","B"};
    static String[] c={"0","0","1","2","5","8"};
    public static void main(String[] args){
        String s=sc.next();
        for(int i=0;i<l.length;i++)s=s.replace(l[i],c[i]);
        System.out.println(s);
    }

}
