import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class BeautifulStrings{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int lim=sc.nextInt();
        sc.nextLine();

        Pattern pt=Pattern.compile("[A-Z]");        

        for(int l=0;l<lim;l++){
            String str=sc.nextLine();
            str=str.toUpperCase();

            ArrayList<String> check=new ArrayList<String>();
            ArrayList<Integer> cnt=new ArrayList<Integer>();

            for(int i=0;i<str.length();i++){
                Matcher mc=pt.matcher(String.valueOf(str.charAt(i)));
                if(mc.matches()){
                
                    String a=String.valueOf(str.charAt(i));

                    if(check.contains(a)){
                    }else{
                        check.add(a);
                        cnt.add(str.length()-str.replaceAll(a, "").length());
                    }               
                }
            }
            int si=26;
            int sum=0;
            Collections.sort(cnt);

            for(int i=cnt.size()-1;i>=0;i--){
                sum+=si*cnt.get(i);
                si--;
            }
            System.out.println("Case #"+(l+1)+": "+sum);
        }
    }
}                   
