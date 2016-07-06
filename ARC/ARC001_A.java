import java.util.Scanner;
 
public class ARC001_A{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
 
        int lim=sc.nextInt();
 
        int[] cnt=new int[5];
 
        String str=sc.next();
 
        for(int i=1;i<=4;i++){
            //System.out.println(str.charAt(i));
            for(int i2=0;i2<lim;i2++){
                if(Integer.parseInt(String.valueOf(str.charAt(i2)))==i)cnt[i]++;
            }
        }
        java.util.Arrays.sort(cnt);
        System.out.println(cnt[cnt.length-1]+" "+cnt[1]);
    }
}