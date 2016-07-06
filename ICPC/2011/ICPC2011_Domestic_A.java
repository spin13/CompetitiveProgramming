/*
http://icpc2011.ait.kyushu-u.ac.jp/icpc2011/contest/all_ja.html
*/

import java.util.Scanner;
import java.util.ArrayList;
public class A{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);


        ArrayList<Integer> list=new ArrayList<Integer>();
        int nn;
        while((nn=sc.nextInt())!=0){
            final int N=nn;
            boolean[] primes=new boolean[N*2+1]; 
            primes[1]=false;
            primes[2]=true;
            int k=0;
            int i=2;
            int i2=2;

            int s=2;
            while(i2<N*2){
                primes[i2]=true;;
                i2++;

            }

            while(i<=N*2){
                if(primes[i]==true){
                    k=i;
                    s=k;
                    while(k<N*2){
                        s=s+i;
                        if(s>N*2)break;
                        primes[s]=false;
                    }
                }
                i++;
            }
            int i3=2;
            int n=N+1;
            int i4=0;
            while(N<N*2){
                if(n>N*2)break;
                if(primes[n]==true){
                    i4++;
                }
                n++;

            }
            list.add(i4);
        }
        int i=0;
        while(i<list.size()){
            System.out.println(list.get(i));
            i++;
        }
    }
}