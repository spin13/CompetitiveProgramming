import java.util.Scanner;
import java.util.Collections;
import java.util.Arrays;

public class WUPC_2_B {
    static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int N = sc.nextInt();
        // 配列外参照するのが面倒なので.....をてきとうにつけておく
        // charのほうが参照が楽なのでchar配列に
        char[] S = (sc.next() + ".....").toCharArray();

        int ans = 0;
        int i=0;

        // 進む回数に上限はないので 水たまりのないマスがあればどんどんそこに進んで良い
        // i は現在位置を表す
        while(i<N){
            // 1~3歩先のどれかが水たまりでないマスならそこへ向かう
            // iをそのマスにして移動したことにする
            if('.' == S[i+1]){
                i = i+1;
            } else if('.' == S[i+2]){
                i = i+2;
            } else if('.' == S[i+3]){
                i = i+3;
            
            // 1~3歩のどこも水たまりなら，最も遠くの水たまりを踏む
            }else{
                ans++;
                i = i+3;
            }
        }

        System.out.println(ans);
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
