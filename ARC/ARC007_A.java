import java.util.Scanner;
 
public class ARC007_A{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        StringBuilder bu=new StringBuilder();
 
        String X=sc.next();
 
        bu.append(sc.next());
 
        while(bu.indexOf(X)>-1){
            bu.deleteCharAt(bu.indexOf(X));
        }
        //if(bu.length()==0)System.out.print("\r");
        System.out.println(bu);
        
    }
}