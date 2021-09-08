package MazengyiJava;
//输出指定范围内的素数


import java.util.Scanner;

public class PrimeNum2 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int num;
        //int inprime=1;
        System.out.print("请输入需要查找的最大范围：");
        num=in.nextInt();
      if (num==2){
            System.out.println("素数有"+" "+2);
        }else {
            System.out.print("素数有:2");
        for (int i=3;i<=num;i++){
            int isprime =1;
            for (int j=2;j<i;j++){
                if(i%j==0){
                    isprime =0;
                    break;
                }
            }
            if(isprime ==1){
                System.out.print(" "+i);
            }
        }
        }
    }
}
