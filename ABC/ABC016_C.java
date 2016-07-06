import java.util.Scanner;
import java.util.Collections;
import java.util.Arrays;
import java.util.ArrayList;
 
public class Main {
    static final Scanner sc = new Scanner(System.in);
 
    public static void main(String[] args) {
        int N=sc.nextInt(), M=sc.nextInt();
        boolean[][] f=new boolean[N+1][N+1];
        for(int i=0;i<M;i++){
            int a=sc.nextInt(), b=sc.nextInt();
            f[a][b]=true;
            f[b][a]=true;
        }
        /*
 *      for(int i=1;i<f.length;i++){
 *                  for(int i2=1;i2<f.length;i2++){
 *                                  System.out.print(f[i][i2]+" ");
 *                                              }
 *                                                          System.out.println();
 *                                                                  }
 *                                                                          */
        boolean[][] ans=new boolean[N+1][N+1];
        for(int i=1;i<f.length;i++){
            for(int i2=1;i2<f.length;i2++){
                if(f[i][i2]){
                    for(int i3=1;i3<f.length;i3++){
                        if(i==i3 || i2==i3 || i==i2)continue;
                        if(f[i2][i3] && !(f[i][i3])){
                            ans[i][i3]=true;
                        }
                    }
                }
            }
        }
        int[] cnt=new int[N+1];
        for(int i=1;i<f.length;i++){
            for(int i2=1;i2<f.length;i2++){
                if(ans[i][i2])cnt[i]++;
            }
        }
        
        for(int i=1;i<cnt.length;i++)System.out.println(cnt[i]);
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
