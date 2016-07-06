import java.util.Scanner;
 
public class ARC006_A{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] E=new int[6];
        for(int i=0;i<6;i++){
            E[i]=sc.nextInt();
        }
        int bonus=sc.nextInt();
        boolean bflag=false;
        int[] L=new int[6];
        for(int i=0;i<6;i++){
            L[i]=sc.nextInt();
        }
 
        int cnt=0;
        for(int i=0;i<6;i++){
            for(int i2=0;i2<6;i2++){
                if(L[i]==E[i2])cnt++;
                if(L[i]==bonus)bflag=true;
            }
        }
 
        if(cnt<3){
            System.out.println(0);
        }else if(cnt==3){
            System.out.println(5);
        }else if(cnt==4){
            System.out.println(4);
        }else if(cnt==5){
            if(bflag){
                System.out.println(2);
            }else{
                System.out.println(3);
            }
        }else{
            System.out.println(1);
        }
    }
}