/*
 * Accepted
 */

import java.util.Scanner;
public class ABC004_B {
    static Scanner sc=new Scanner(System.in);
    
    public static void main(String[] args){
        char[][] a=new char[4][4];
        
        for(int i=0;i<4;i++){
            for(int i2=0;i2<4;i2++){
                a[i][i2]=sc.next().charAt(0);
            }
        }
        
        for(int i=3;i>=0;i--){
            for(int i2=3;i2>=0;i2--){
                System.out.print(a[i][i2]);
                if(i2>0)System.out.print(" ");
            }
            System.out.println();
        }
    }
}
