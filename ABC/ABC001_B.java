/*
 * Accepted
 */

import java.util.Scanner;
public class ABC001_B {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args){
        int m=sc.nextInt();
        if(m<100){
            System.out.println("00");
        }else if(100<=m && m<=5000){
            if(m<1000){
                System.out.println(0+""+m/100);
            }else{
                System.out.println(m/100);
            }
        }else if(6000<=m && m<=30000){
            System.out.println(m/1000+50);
        }else if(35000<=m && m<=70000){
            System.out.println((((m/1000)-30)/5)+80);
        }else{
            System.out.println(89);
        }
    }
}
