/*
現在の時間/1440が0ならば日曜,1ならば月曜
360<=現在の時間%1440<=1080ならばDay
0<=現在の時間%1440<=360 または 1080<=現在の時間%1440ならばnight
 */

import java.util.Scanner;
import java.math.BigDecimal;

public class DemoDomestic2013_B{
    static double EPS=1e-8;

    static final Scanner sc=new Scanner(System.in);
    final static String[] WEEK={"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
    static double n;
    static double p;
    static double m;
    static String week;
    static String time;

    public static void main(String[] args){

        while(true){
            int s=sc.nextInt();//s分後にn個の卵が孵化
            n=sc.nextDouble();//n個の卵
            int t=sc.nextInt();//t分後にステージ終了
            week=sc.next();//突然変異可能な曜日
            time=sc.next();//Dayは6:00~18:00, Nightは18:00~6:00
            p=sc.nextDouble();//
            m=sc.nextDouble();//フェイズ数
            if("None".equals(week))break;
            double ans=0.0;

            for(int i=0;i<10080;i++){
                int start=i;
                int c=0;

                for(int i2=0;i2<m;i2++){
                    if(start > 10080)start-=10080;
                    if(Wcheck(start) && Wcheck(start+s)){
                        int c1=start%1440;
                        int c2=(start+s)%1440;
                        if("All".equals(time)){
                            c++;
                        }else if("Day".equals(time)){
                            if(360<=c1 && c1<1080 && 360<=c2 && c2<1080){
                                c++;
                            }
                        }else{
                            if((c1>=1080 || c1<360) && (c2>=1080 || c2<360)){
                                c++;
                            }
                        }
                    }
                    start+=t;
                }
                ans=Math.max(ans, probab(c));
            }
            //BigDecimal a=new BigDecimal(ans);
            System.out.printf("%.10f\n",ans);
            
        }
    }


    static boolean Wcheck(int ctime){  //曜日チェック
        //System.out.println(ctime);
        int ch=ctime/1440;
        if(ch >= 7)ch-=7;
        if("All".equals(week))return true;
        if(ctime > 10080)return false;
        if(week.equals(WEEK[ch])){
            return true;
        }else{
            return false;
        }
    }
    
    static double probab(int c){
        if(c==0)return 0;
        double sum=(p-1.0)/p;
        for(int i=0;i<(int)n*c-1.0;i++){
            sum*=(p-1.0)/p;
        }
        return 1.0-sum;
    }
}