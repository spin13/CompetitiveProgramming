import java.util.Scanner;

public class ARC007_B{
    static final Scanner sc=new Scanner(System.in);
    
    public static void main(String[] args){
        int N=sc.nextInt(), M=sc.nextInt();
        int[] disk=new int[N+1];
        for(int i=1;i<=N;i++)disk[i]=i;
        int t1=0, t2=0;
        for(int i=0;i<M;i++){
            t2=t1;
            t1=sc.nextInt();
            disk[search(disk, t1)]=t2;
        }
        
        for(int i=1;i<disk.length;i++)System.out.println(disk[i]);
    }
    
    static int search(int[] a, int t){
        for(int i=1;i<a.length;i++)if(a[i]==t)return i;
        return 0;
    }
}