package MazengyiJava;

import java.util.Scanner;

public class HowTall {
    public static void main(String[] args){
        System.out.println("这位美国佬你多高？");
        Scanner tall=new Scanner(System.in);
        int USAchi=0;
        double USAcun=0;
        System.out.println("我的身高是"+(USAchi= tall.nextInt())+"英尺"+(USAcun= tall.nextDouble())+"英寸");
        //USAchi= tall.nextInt();System.out.println("英尺");
        //USAcun= tall.nextInt();System.out.println("英寸");
        double Pub=0;
        Pub=(USAchi+USAcun/12)*0.3048*100;
        System.out.println("你在中国的身高是"+(int)Pub+"cm");
        int a=10;
        a=(int)(30/3.0);
        double b=-20.0;
        System.out.println(a*-b);//单目运算
        System.out.println((5==5.0));
        double c=1.0;
        double d=0.1+0.1+0.1+0.1+0.1+0.1+0.1+0.1+0.1+0.1;
        System.out.println(c==d);
        System.out.println(d);
        System.out.println(Math.abs(c-d)<1e-6);


    }
}
