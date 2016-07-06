/*
 * Accepted
 */

import java.util.Scanner;
import java.util.Collections;
import java.util.Arrays;
import java.util.ArrayList;

public class ARC031_B {
    static final Scanner sc = new Scanner(System.in);
    static char[][] map;
    static int is;
    static boolean flag;

    static int[] mx={-1,1,0,0};
    static int[] my={0,0,-1,1};
    static int x=10;
    static int y=10;
    static char[][] tmp;

    public static void main(String[] args) {
        map=new char[10][10];
        int cnt=0;
        for(int i=0;i<10;i++){
            map[i]=sc.next().toCharArray();
        }
        //map[5][4]='o';
        for(int i=0;i<10;i++){
            for(int i2=0;i2<10;i2++){
                if(map[i][i2]=='o')is++;
            }
        }
        
        tmp=new char[10][10];
        for(int i=0;i<10;i++){
            for(int i2=0;i2<10;i2++){

                for(int ii=0;ii<10;ii++){
                    for(int ii2=0;ii2<10;ii2++){
                        tmp[ii][ii2]=map[ii][ii2];
                    }
                }
                
                if(tmp[i][i2]=='o')continue;
                tmp[i][i2]='o';
                dfs(i,i2);
                //out();
                //System.out.println();
                if(check()){
                    System.out.println("YES");
                    System.exit(0);
                }
            }
        }
        System.out.println("NO");
    }

    static int dfs(int sy, int sx){
        if(sy>=y || sx>=x || sy<0 || sx<0)return 0;
        if(tmp[sy][sx]=='x')return 0;
        if(tmp[sy][sx]=='o'){
            tmp[sy][sx]='x';
        }

        for(int i=0;i<my.length;i++){
            dfs(sy+my[i], sx+mx[i]);
        }
        return 0;
    }
    
    static boolean check(){
        for(int i=0;i<10;i++){
            for(int i2=0;i2<10;i2++){
                if(tmp[i][i2]=='o')return false;
            }
        }
        return true;
    }

    static void out(){
        for(int i=0;i<10;i++){
            for(int i2=0;i2<10;i2++){
                System.out.print(tmp[i][i2]);
            }
            System.out.println();
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