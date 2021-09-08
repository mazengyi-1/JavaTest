package MazengyiJava;

import java.util.Scanner;

public class HowMany {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int Test=0;
        System.out.print("请输入一个数：");
        Test=in.nextInt();
        int sum=0;

        //正整数利用for循环
//        for (int i=0;Test>0;i++)
//        {
//            Test=Test/10;
//            sum++;
//        }


        //正整数利用while循环
//        while (Test>0){
//            Test=Test/10;
//            sum++;
//        }


        do {
            Test=Test/10;
            sum=sum+1;

        }while (Test>0);
        System.out.println("这是一个"+sum+"位数。");
    }
}
