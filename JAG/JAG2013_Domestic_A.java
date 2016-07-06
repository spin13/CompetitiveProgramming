import java.util.Scanner;
public class DemoDomestic2013_A{
    static Scanner sc=new Scanner(System.in);

    static char alpa(int a){
        return (char)(a+96);
    }
    static char alpA(int a){
        return (char)(a+64);
    }

    static int num(char a){
        if('a' <= a && 'z' >= a){
            return a-'a'+1;
        }else{
            return a-'A'+1;
        }
    }

    public static void main(String[] args){
        char[] alp=new char[52];
        for(int i2=0;i2<26;i2++){
            alp[i2]=alpa(i2+1);
        }
        for(int i=26;i<52;i++){
            alp[i]=alpA(i-25);
        }
        while(true){
            int n=sc.nextInt();
            if(n==0)break;
            int[] k=new int[n];
            for(int i=0;i<n;i++){
                int a=sc.nextInt();
                if(a > 52)a=a%52;
                k[i]=a;
            }
            String s=sc.next();
            int i2=0;
            for(int i=0;i<s.length();i++){
                int a=num(s.charAt(i));
                if('a' <= s.charAt(i) && 'z' >= s.charAt(i)){
                    int t=a-k[i2]-1;
                    if(t < 0)t=52+t;
                    System.out.print(alp[t]);
                    //System.out.println(a);
                }else{
                    int t=a+26-k[i2]-1;
                    if(t < 0)t=52+t;
                    System.out.print(alp[t]);
                }
                i2++;
                if(i2==n)i2=0;
            }
            System.out.println();
        }
    }
}
