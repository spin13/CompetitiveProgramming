import java.util.Scanner;

public class ARC013_A{
    private static final Scanner sc=new Scanner(System.in);
    
    public static void main(String[] args){
        int ans=0;
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int[] n=new int[3];
        for(int i=0;i<3;i++){
            n[i]=sc.nextInt();
        }
        
        for(int i=0;i<3;i++){
            for(int i2=0;i2<3;i2++){
                if(i==i2)continue;
                
                for(int i3=0;i3<3;i3++){
                    if(i==i2 || i==i3 || i2==i3)continue;
                    ans=Math.max(ans,(a/n[i])*(b/n[i2])*(c/n[i3]));
                }
            }
        }
        System.out.println(ans);
    }
}