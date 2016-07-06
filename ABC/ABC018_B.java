import java.util.Scanner;
import java.util.Collections;
import java.util.Arrays;
import java.util.ArrayList;
 
public class Main {
    static final Scanner sc = new Scanner(System.in);
 
    public static void main(String[] args) {
        StringBuilder s=new StringBuilder();
        s.append(sc.next());
        int N=sc.nextInt();
        String[] tmp=new String[2];
        String tmp2;
        String gl;
        for(int i=0;i<N;i++){
            int start=sc.nextInt(), end=sc.nextInt();
            tmp[0]=s.substring(0,start-1);
            tmp[1]=s.substring(end, s.length());
            tmp2=s.substring(start-1,end);
            s.delete(0, s.length());
            s.append(tmp2);
            s.reverse();
            gl=tmp[0]+s.toString()+tmp[1];
            s.delete(0, s.length());
            s.append(gl);
        }
        System.out.println(s);
    }
 
    static int SI(String a) {
        return Integer.parseInt(a);
    }
 
    static char SC(String a) {
        return a.charAt(0);
    }
 
    static double SD(String a) {
        return new Double(a).doubleValue();
    }
 
    static String CS(char a) {
        return String.valueOf(a);
    }
 
    static int DI(double a) {
        return new Double(a).intValue();
    }
 
    static String DS(double a) {
        return Double.toString(a);
    }
 
    static int LI(long a) {
        return new Long(a).intValue();
    }
 
    static char LC(long a) {
        return Long.toString(a).charAt(0);
    }
 
    static double LD(long a) {
        return new Long(a).doubleValue();
    }
 
    static long IL(int a) {
        return new Integer(a).longValue();
    }
 
    static double ID(int a) {
        return new Integer(a).doubleValue();
    }
 
    static char IC(int a) {
        return Integer.toString(a).charAt(0);
    }
 
    static String IS(int a) {
        return Integer.toString(a);
    }
 
}
