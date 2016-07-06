/*
 * Accepted
 */

import java.util.Scanner;
public class ABC003_B {
    static Scanner sc=new Scanner(System.in);
    static char[] l={'a','t','c','o','d','e','r'};
    
    public static void main(String[] args){
        String s=sc.next();
        String t=sc.next();
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='@'){
                for(int i2=0;i2<l.length;i2++){
                    if(t.charAt(i)==l[i2] || t.charAt(i)=='@')break;
                    if(i2>=l.length-1){
                        System.out.println("You will lose");
                        System.exit(0);
                    }
                }
            }else if(t.charAt(i)=='@'){
                for(int i2=0;i2<l.length;i2++){
                    if(s.charAt(i)==l[i2] || s.charAt(i)=='@')break;
                    if(i2>=l.length-1){
                        System.out.println("You will lose");
                        System.exit(0);
                    }
                }
            }else if(s.charAt(i)!=t.charAt(i)){
                System.out.println("You will lose");
                System.exit(0);
            }
        }
        System.out.println("You can win");
    }
        
}
