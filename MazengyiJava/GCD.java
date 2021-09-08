package MazengyiJava;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int a;
        int b;
        int Minab =0;
        int gcd=1;
        System.out.print("请输入a和b两个数：");
        a=in.nextInt();
        b=in.nextInt();
        Minab =Math.min(a,b);
        System.out.print("两个数的公约数有：");
        for (int i=1;i<=Minab;i++)
        {
            if(a%i==0 && b%i==0){
                gcd=i;
                System.out.print(gcd+" ");
            }
        }
        /*辗转相除法
        while(b!=0){
            int r=a%b;
            a=b;
            b=r;
        }*/
        System.out.println();
        System.out.println("两个数的最大公约数为："+gcd);

    }
}
