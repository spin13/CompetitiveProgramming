/*
 * Accepted
 */

import java.util.Scanner;
import java.util.Collections;
import java.util.Arrays;
import java.util.ArrayList;
public class ABC039_C {
    static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String[] ans={"Do", "Re", "Mi", "Fa", "So", "La", "Si"};
        String a="WBWBWWBWBWBWWBWBWWBWBWBWWBWBWWBWBWBWWBWBWWBWBWBWWBWBWWBWBWBWWBWBWWBWBWBW";
        
        String s=sc.next();
        int cnt=0;
        for(int i=0;i<20;i++){
            if(a.charAt(i)=='B')cnt++;
            if(a.substring(i, i+20).equals(s)){
                System.out.println(ans[i-cnt]);
                break;
            }
        }

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
    static int CI(char a) {
        return Integer.parseInt(String.valueOf(a));
    }

}