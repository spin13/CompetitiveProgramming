/*
 * Accepted
 */

import java.util.Scanner;
import java.util.Collections;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

public class ABC008_B {
    static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        HashMap<String, Integer> map=new HashMap<String, Integer>();
        int n=sc.nextInt();
        String s;
        for(int i=0;i<n;i++){
            s=sc.next();
            if(map.containsKey(s))map.put(s, map.get(s)+1);
            else map.put(s, 0);
        }
        int a=n;
        Iterator it = map.keySet().iterator();
        while(true){
            if(map.containsValue(a))break;
            a--;
        }
        
        while(it.hasNext()){
            s=(String)it.next();
            //System.out.println(s);
            if(map.get(s)==a){
                System.out.println(s);
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

}