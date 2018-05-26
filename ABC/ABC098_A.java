
import java.util.Scanner;
import java.util.Collections;
import java.util.Arrays;


public class ABC098_A {
    static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
		int A = sc.nextInt();
		int B = sc.nextInt();
		System.out.println(Math.max(Math.max(A+B, A-B) , A*B));
    }

    static void sort(int[] a, int b) {//arrays.sort 0�ō~��, ����ȊO�ŏ���
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
