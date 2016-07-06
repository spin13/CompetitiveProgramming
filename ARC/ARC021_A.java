/*
 * Accepted
 */

import java.util.Scanner;
public class ARC021_A {
    static Scanner sc=new Scanner(System.in);
    static int[] mx={-1,1,0,0};
    static int[] my={0,0,-1,1};
    static int[][] a=new int[6][6];
    public static void main(String[] args){
        
        for(int i=1;i<=4;i++){
            for(int i2=1;i2<=4;i2++){
                a[i][i2]=sc.nextInt();
            }
        }
        
        boolean f=false;
        
        for(int i=1;i<=4;i++){
            for(int i2=1;i2<=4;i2++){
                for(int i3=0;i3<4;i3++){
                    if(a[i][i2]==a[i+my[i3]][i2+mx[i3]])f=true;
                }
                
            }

        }
        System.out.println(f ? "CONTINUE" : "GAMEOVER");
        
    }
    

}
