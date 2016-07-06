import java.util.Scanner;
import java.util.Collections;
import java.util.Arrays;
import java.util.ArrayList;
public class ABC039_D {
    static final Scanner sc = new Scanner(System.in);

    static int[] dx={1, 1,  1, 0, 0, -1, -1, -1};
    static int[] dy={0, 1, -1, 1, -1, 0,  1, -1};

    static int H,W;

    public static void main(String[] args) {
        H=sc.nextInt(); 
        W=sc.nextInt();
        char[][] S=new char[H+2][W+2];

        char[][] tmp;
        String z;
        for(int i=1;i<=H;i++){
            z=sc.next();

            for(int i2=1;i2<=W;i2++){
                S[i][i2]=z.charAt(i2-1);
            }
        }

        for(int i=0;i<H+2;i++){
            S[i][0]='#';
            S[i][W+1]='#';
        }
        for(int i=0;i<W+2;i++){
            S[0][i]='#';
            S[H+1][i]='#';
        }

        //disp(S);


        char[][] ans=new char[H][W];

        tmp=S;

        for(int i=1;i<H+1;i++){
            for(int i2=1;i2<W+1;i2++){
                boolean flag=false;
                if(tmp[i][i2]=='#'){
                    flag=search(tmp, i, i2);
                }


                if(flag){
                    ans[i-1][i2-1]='#';
                }


            }
        }

        if(check(S, ans)){
            System.out.println("possible");
            for(int i=0;i<H;i++){
                for(int i2=0;i2<W;i2++){
                    if(ans[i][i2]=='#'){
                        System.out.print('#');
                    }else{
                        System.out.print('.');
                    }
                }
                System.out.println();
            }
        }else{
            System.out.println("impossible");
        }

    }

    static boolean search(char[][] tmp, int y, int x){
        for(int i=0;i<8;i++){
            for(int i2=0;i2<8;i2++){
                if(tmp[y+dy[i]][x+dx[i2]] == '.')return false;
            }
        }
        return true;
    }

    static void disp(char[][] t){
        for(int i=0;i<t.length;i++){
            for(int i2=0;i2<t[i].length;i2++){
                System.out.print(t[i][i2]);
            }
            System.out.println();
        }
    }


    static boolean check(char[][] tmp, char[][] ans){
        for(int i=0;i<H;i++){
            for(int i2=0;i2<W;i2++){
                if(ans[i][i2]=='#'){

                    for(int i3=0;i3<8;i3++){
                        for(int i4=0;i4<8;i4++){
                            tmp[i+1+dy[i3]][i2+1+dx[i4]]='.';
                        }
                    }
                }
            }
        }

        for(int i=1;i<=H;i++){
            for(int i2=1;i2<=W;i2++){
                if(tmp[i][i2]=='#')return false;
            }
        }

        return true;

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