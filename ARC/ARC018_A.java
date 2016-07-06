import java.util.Scanner;
public class ARC018_A {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args){
        double H=Math.pow(sc.nextDouble()/100.0,2);
        double B=sc.nextDouble();
        System.out.println(B*H);
    }
}
