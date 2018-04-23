import java.util.Scanner;
import java.util.Collections;
import java.util.Arrays;

public class WUPC_2_B_2 {
    static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int N = sc.nextInt();

        // . で分割して配列に格納する
        // XX, X, XXXX, X  みたいな感じで格納される
        String[] map = sc.next().split("\\.");

        int ans = 0;
        for(int i=0;i<map.length;i++){
            // 分割された各要素に対して，越えられない数の水たまり(一度に3以上連続しているもの)がいくつあるか
            // XXX    -> 1
            // XXXX   -> 1
            // XXXXXX -> 2  3歩ずつ進んでも2回みずたまりを踏んでしまう
            ans += map[i].length() / 3;
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
