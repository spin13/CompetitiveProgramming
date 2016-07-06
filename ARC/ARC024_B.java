import java.util.ArrayList;
import java.util.Scanner;

public class ARC024_B {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args){
        int N=sc.nextInt();
        int[] tree=new int[N*2];
        int sum=0;
        for(int i=0;i<N;i++){
            tree[i]=sc.nextInt();
            tree[i+N]=tree[i];
            sum+=tree[i];
        }
        if(sum==N || sum==0){
            System.out.println(-1);
            System.exit(0);
        }

        int ans=0;

        for(int i=0;i<tree.length-N+1;i++){
            int t=1;
            while(true){
                if(tree[i]==tree[i+1]){
                    t++;
                    i++;
                }else break;
            }
            ans=Math.max(ans, t);
        }
        System.out.println((ans+1)/2);
    }

}
