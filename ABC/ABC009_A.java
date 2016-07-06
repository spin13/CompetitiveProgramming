/*
 * Accepted
 */

import java.util.Scanner;

public class ABC009_A {
    static Scanner sc=new Scanner(System.in);
    
    public static void main(String[] args){
        int N=sc.nextInt();
        System.out.println(N%2==0 ? N/2 : N/2+1);
    }
}
