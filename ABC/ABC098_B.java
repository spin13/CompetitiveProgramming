import java.util.Scanner;
import java.util.Collections;
import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;

public class ABC098_B {
    static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
		int N=sc.nextInt();
		String S=sc.next();
		ArrayList<String> list1 = new ArrayList<String>();
		ArrayList<String> list2 = new ArrayList<String>();
		int ans = 0;

		for(int i=1;i<N;i++){
			list1 = new ArrayList<String>();
			list2 = new ArrayList<String>();
			String str1 = S.substring(0, i);
			String str2 = S.substring(i, N);

			for(int i2 = 0;i2<str1.length();i2++){
				list1.add(CS(str1.charAt(i2)));
				
			}
			for(int i2 = 0;i2<str2.length();i2++){
				list2.add(CS(str2.charAt(i2)));
			}

			int cnt = 0;

			HashSet<String> set = new HashSet<String>(list1);
			list1 = new ArrayList<String>(set);
			set = new HashSet<String>(list2);
			list2 = new ArrayList<String>(set);
			for(String str: list1){
				if(list2.contains(str)) cnt++;
			}
			ans = Math.max(ans, cnt);
			
		}

		System.out.println(ans);
			
		
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
