package MazengyiJava;

import java.util.Scanner;
//倒叙一个正整数
public class IntegerDecomposition {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int num=0;
        int result=0;
        System.out.print("请输入一个正整数：");
        num=in.nextInt();
        int count=0;
       do {
            count=num%10;
            result=result*10+count;
            num=num/10;
        }while (num>0);
       System.out.println("这个整数的倒叙为："+result);
    }
}
