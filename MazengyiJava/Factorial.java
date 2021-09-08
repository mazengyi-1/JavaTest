package MazengyiJava;

import java.util.Scanner;
//求一个数的阶乘
public class Factorial {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int num=0;

        int sum=1;
        System.out.print("请输入一个整数：");
        num=in.nextInt();
        if (num==0){
            System.out.println("这个数的阶乘为："+sum);
        }
        else {
        for (int i=1;i<=num;i++){
            sum=sum*i;
        }
        System.out.println("这个数的阶乘为："+sum);
        }
    }
}
