package MazengyiJava;

import java.util.Scanner;

public class MeanValue2 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.print("请输入需要求多少位的平均数：");
        int n;
        n=in.nextInt();
        int[] numbers=new int[n];
        double sum=0;


        System.out.print("请输入各项数据：");
        for (int i=0;i<n;i++){
            numbers[i]=in.nextInt();
            sum=sum+numbers[i];

        }
        double mv=sum/n;
        System.out.print("这组数的平均数为："+mv);
        System.out.print("其中大于等于该平均数的有：");
        for (int i=0;i<n;i++){
            if(numbers[i]>=mv){
                System.out.print(" "+numbers[i]);
            }
        }



    }
}
/*for(i=0;i<100;i++)
sum+=grade[i];
最好是：
for(i=0;i<grade.length;++i)
sum+=grade[i];
 */
