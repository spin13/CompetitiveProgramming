import java.util.Scanner;
import java.util.ArrayList;

public class ARC014_B{
    private static final Scanner sc=new Scanner(System.in);
    
    public static void main(String[] args){
        int n=sc.nextInt();
        ArrayList<String> list=new ArrayList<String>();
        ArrayList<Integer> ans=new ArrayList<Integer>();
        
        list.add(sc.next());
        for(int i=1;i<n;i++){
            String str=sc.next();
            if(list.contains(str)){
                ans.add(i);
            }
            int l=(list.get(i-1).length())-1;
            char a=list.get(i-1).charAt(l);
            char b=str.charAt(0);
            if(a!=b){
                ans.add(i);
            }
            list.add(str);
        }
        
        if(ans.size()==0){
            System.out.println("DRAW");
        }else if(ans.get(0)%2==0){
            System.out.println("LOSE");
        }else{
            System.out.println("WIN");
        }
    }
}
