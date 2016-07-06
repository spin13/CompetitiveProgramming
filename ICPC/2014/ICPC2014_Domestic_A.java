import java.util.Scanner;
public class ICPC2014_A {
    static Scanner sc=new Scanner(System.in);
    
    public static void main(String[] args){
        
        while(true){
            int p1=sc.nextInt();
            int p2=sc.nextInt();
            int s=sc.nextInt();
            if(p1==0 && p2==0 && s==0)break;
            int ans=0;
            
            for(int i=1;i<=1000;i++){
                for(int i2=1;i2<=2000;i2++){
                    if((i*(100+p1)/100) + (i2*(100+p1)/100) == s){
                        ans=Math.max(ans, (i*(100+p2)/100) + (i2*(100+p2)/100));
                    }
                }
            }
            System.out.println(ans);
        }
    }

}
