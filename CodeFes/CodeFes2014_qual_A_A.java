import java.util.Scanner;
import java.util.Collections;
import java.util.Arrays;

public class CodeFes2014_qual_A_A {
    static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // B-Aで重複する部分があるのでAを-1しておく
        int A = sc.nextInt()-1;
        int B = sc.nextInt();
        System.out.println(neo_count_leap_year(B) - neo_count_leap_year(A));
    }

    // 1年ずつ増やしていってうるう年を数える方法
    // TLEします
    static int count_leap_year(int n){
        int ret = 0;
        for(int i=4; i<=n; i++){
            if(i%400 == 0){
                ret++;
            // 4で割り切れてかつ100で割り切れない
            } else if(i%4 == 0 && i%100 !=0){
                ret++;
            }
        }
        return ret;
    }

    // 4年ずつ増やしていってうるう年を数える方法
    // ギリギリ間に合う
    static int count_leap_year_four(int n){
        int ret = 0;
        for(int i=4; i<=n; i+=4){
            if(i%400 == 0){
                ret++;
            // 4で割り切れてかつ100で割り切れない
            } else if(i%4 == 0 && i%100 !=0){
                ret++;
            }
        }
        return ret;
    }

    static int neo_count_leap_year(int n){
        // n/4 4で割った数はうるう年
        // n/100 ただし100で割り切れる年はうるう年じゃないので引く
        // n/400 ただし400で割り切れる場合はうるう年なので足す
        return n/4 - n/100 + n/400;
    }

    static void sort(int[] a, int b) {//arrays.sort 0で降順, それ以外で昇順
        if (b == 0) {
            Arrays.sort(a);
            int t = 0;
            int c = a.length - 1;
            for (int i = c; i >= c / 2 + 1; i--) {

                t = a[i];
                a[i] = a[c - i];
                a[c - i] = t;
            }
        } else {
            Arrays.sort(a);
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
