package MazengyiJava;

import java.util.Scanner;

public class MeanValue {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("请输入一组数据以-1结束：");
        int num=0;
        int add=0;
        int sum=0;
        while (true){
            num=in.nextInt();
            if(num==-1){
                break;
            }
            add+=num;
            sum++;
        }
        if(sum>0){
            System.out.println("这组数的平均数是："+((double)(add/sum)));
        }
        else {
            System.out.println("请您至少输入一个整数。");

        }
    }
}
