/*
 * Accepted
 */

import java.util.Scanner;

public class ABC001_C {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args){
        double dig=sc.nextDouble();
        double dis=sc.nextDouble()/60.0;
        String dir;
        dis = new Double(String.format("%.1f", dis));
        
        if(dig<112.5)dir="N";
        else if(dig<337.5)dir="NNE";
        else if(dig<562.5)dir="NE";
        else if(dig<787.5)dir="ENE";
        else if(dig<1012.5)dir="E";
        else if(dig<1237.5)dir="ESE";
        else if(dig<1462.5)dir="SE";
        else if(dig<1687.5)dir="SSE";
        else if(dig<1912.5)dir="S";
        else if(dig<2137.5)dir="SSW";
        else if(dig<2362.5)dir="SW";
        else if(dig<2587.5)dir="WSW";
        else if(dig<2812.5)dir="W";
        else if(dig<3037.5)dir="WNW";
        else if(dig<3262.5)dir="NW";
        else if(dig<3487.5)dir="NNW";
        else dir="N";
        
        int w;
        if(dis<=0.2)w=0;
        else if(dis<=1.5)w=1;
        else if(dis<=3.3)w=2;
        else if(dis<=5.4)w=3;
        else if(dis<=7.9)w=4;
        else if(dis<=10.7)w=5;
        else if(dis<=13.8)w=6;
        else if(dis<=17.1)w=7;
        else if(dis<=20.7)w=8;
        else if(dis<=24.4)w=9;
        else if(dis<=28.4)w=10;
        else if(dis<=32.6)w=11;
        else w = 12;
        
        if(w==0)dir="C";
        
        System.out.println(dir+" "+w);
    }
}
