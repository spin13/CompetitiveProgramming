/*
 * Accepted
 */

import java.util.Scanner;

public class ABC006_A {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args){
        int N=sc.nextInt();
        if(N%3==0 || Integer.toString(N).indexOf("3")!=-1)System.out.println("YES");
        else System.out.println("NO");
    }
}
