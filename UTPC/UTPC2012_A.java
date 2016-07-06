import java.util.Scanner;

public class UTPC2012_A{
  public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        String st=sc.nextLine();

        String[] a=st.split("/");

        String m=a[1]+""+a[2];

        String[] yy=new String[4];
        String[] mm=new String[4];

                
        int i=0;

        while(i<4){
            yy[i]=String.valueOf(a[0].charAt(i));
            mm[i]=String.valueOf(m.charAt(i));  
            i++;
        }

        int sum=0; //ans

        i=0;
        int i2=0;
        while(i<4){
            while(i2<4){
                if(yy[i].equals(mm[i2])){
                    sum+=1;
                    mm[i2]=null;
                    yy[i]="a";
                }
                i2++;
            }
            i2=0;
            i++;
        }
        
        if(sum==4){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
}