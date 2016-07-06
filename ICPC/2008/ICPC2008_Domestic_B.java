import java.util.Scanner;
import java.util.ArrayList;

public class Domestic2008_B{
    static final Scanner sc=new Scanner(System.in);
    static ArrayList<Integer> mon=new ArrayList<Integer>(); //åéójìyójêî
    public static void main(String[] args){
        monNum();
        ArrayList<Integer> monPrime=monPri(mon);
        while(true){
            ArrayList<Integer> ans=new ArrayList<Integer>();
            int n=sc.nextInt();
            if(n==1)break;
            for(int i=1;i<monPrime.size();i++){
                if(monPrime.get(i)==0)continue;
                if(n%monPrime.get(i) == 0)ans.add(monPrime.get(i));
            }
            System.out.print(n+":");

            if(ans.size() > 1){
                for(int i=0;i<ans.size()-1;i++){
                    System.out.print(" "+ans.get(i));
                }
            }
            System.out.println(" "+ans.get(ans.size()-1));
        }



    }
    static void monNum(){
        for(int i=0;i<45000;i++){
            mon.add(7*i+1);
            mon.add(7*i+6);
        }
    }

    static ArrayList<Integer> monPri(ArrayList<Integer> list){//åéójìyójëfêî
        for(int i=1;i<list.size();i++){
            if(list.get(i)==0)continue;
            int tmp=list.get(i);
            if(tmp*tmp > 300000)break;
            for(int i2=i+1;i2<list.size();i2++){
                //System.out.println(i2+" "+tmp);
                if(list.get(i2)%tmp == 0)list.set(i2,0);
            }
        }
        return list;
    }

    static ArrayList<Integer> getPrime(ArrayList<Boolean> a){
        ArrayList<Integer> t=new ArrayList<Integer>();
        for(int i=0;i<a.size();i++){
            if(a.get(i)){
                t.add(i);
            }
        }
        return t;
    }
}
