/*
 * Accepted
 */

import java.util.Arrays;
import java.util.Scanner;

public class ABC001_D {
    static Scanner sc=new Scanner(System.in);
    
    public static void main(String[] args){
        int n=sc.nextInt();
        int[][] time=new int[n][2];
        boolean[] ans=new boolean[24*60+6]; 
        String s;
        for(int i=0;i<n;i++){
            s=sc.next();
            time[i][0]=(SI(s.split("-")[0])/100*60) + SI(s.split("-")[0].substring(2,4));
            time[i][0]-=time[i][0]%5;
            time[i][1]=(SI(s.split("-")[1])/100*60) + SI(s.split("-")[1].substring(2,4));
            if(time[i][1]%5!=0)time[i][1]+=5-(time[i][1]%5);
        }
        
        for(int i=0;i<n;i++){
            for(int i2=time[i][0];i2<=time[i][1];i2++){
                ans[i2]=true;
            }
        }
        
        for(int i=0;i<24*60+1;i+=5){
            if(ans[i]){
                System.out.print(String.format("%1$02d", i/60)+""+String.format("%1$02d", i%60)+"-");
                while(ans[i])i++;
                i--;
                System.out.println(String.format("%1$02d", (i)/60)+""+String.format("%1$02d", (i)%60));
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