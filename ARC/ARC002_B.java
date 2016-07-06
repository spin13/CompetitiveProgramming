import java.util.Scanner;

class Func{
    public boolean uruu(int a){
        if(a%4==0 && !(a%100==0)){
            return true;
        }else{
            return false;
        }
    }

}


public class ARC002_B{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String[] st=str.split("/");
        int[] a=new int[3];
        for(int i=0;i<st.length;i++){
            a[i]=Integer.parseInt(st[i]);
        }


        if((double)a[0]/a[1]%a[2]==0.0){ //num=true
            System.out.println(str);
            System.exit(0);
        }



        Func fu=new Func();
        boolean flag;

        while(true){
            flag=fu.uruu(a[0]);

            if(flag){  //uruu
                int[] max={0,31,29,31,30,31,30,31,31,30,31,30,31};
                for(int i=0;a[2]<=max[a[1]];a[2]++){
                    if((double)a[0]/a[1]%a[2]==0.0){
                        String ans;
                        String temp;
                        ans=Integer.toString(a[0]);
                        temp=Integer.toString(a[1]);
                        if(temp.length()==1){
                            ans+="/"+"0"+temp;
                        }else{
                            ans+="/"+temp;
                        }
                        temp=Integer.toString(a[2]);
                        if(temp.length()==1){
                            ans+="/"+"0"+temp;
                        }else{
                            ans+="/"+temp;
                        }
                        System.out.println(ans);
                        System.exit(0);
                    }
                }

                a[2]=1; //next month
                if(a[1]>=12){
                    a[0]++;
                    a[1]=1;
                }else{
                    a[1]++;
                }

            }else{ //not uruu
                int[] max={0,31,28,31,30,31,30,31,31,30,31,30,31};
                for(int i=0;a[2]<=max[a[1]];a[2]++){
                    if((double)a[0]/a[1]%a[2]==0.0){
                        String ans;
                        String temp;
                        ans=Integer.toString(a[0]);
                        temp=Integer.toString(a[1]);
                        if(temp.length()==1){
                            ans+="/"+"0"+temp;
                        }else{
                            ans+="/"+temp;
                        }
                        temp=Integer.toString(a[2]);
                        if(temp.length()==1){
                            ans+="/"+"0"+temp;
                        }else{
                            ans+="/"+temp;
                        }
                        System.out.println(ans);
                        System.exit(0);
                    }
                }

                a[2]=1; //next month
                if(a[1]>=12){
                    a[0]++;
                    a[1]=1;
                }else{
                    a[1]++;
                }
            }
        }
    }
}