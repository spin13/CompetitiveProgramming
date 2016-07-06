import java.util.Scanner;
import java.util.ArrayList;
 
public class ARC011_B{
    static int N;
    static String w;
    static String code="zrbcdwtjfqlvsxpmhkngZRBCDWTJFQLVSXPMHKNG";
    static int temp;
 
    static String ans="";
 
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<Integer>();
 
        N=sc.nextInt();
 
        for(int i=0;i<N;i++){
            int count=0;
            boolean flag=false;
            w=sc.next();
            for(int i2=0;i2<w.length();i2++){
                temp=code.indexOf(w.charAt(i2));
                if(temp >= 20)temp-=20;
                if(temp != -1){
                    flag=true;
                    ans+=Integer.toString(temp/2);
                }
            }
            if(flag)ans+=" ";
            if(i==N-1)break;
        }
 
        int count=ans.length();
        for(int i=0;i<ans.length();i++){
            if(ans.indexOf(" ",count)==0)count--;
        }
        for(int i=0;i<count-1;i++){
 
        System.out.print(ans.charAt(i));
        }
        System.out.println("");
 
    }
}