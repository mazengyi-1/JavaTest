package MazengyiJava;
//判断一个数是否为素数


import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int num;
        int count;
        int isprime =1;
        System.out.print("请输入一个正整数：");
        num=in.nextInt();
        if(num==2){
            System.out.println(num+"是一个素数。");
        }
        else{
            for (int i=2;i<num;i++){
                count=num%i;
                if(count==0){
                    //System.out.println(num+"不是一个素数。");
                    isprime =0;
                    break;
                }
            }
            if(isprime ==1){
                    System.out.println(num+"是一个素数。");
                }else {
                System.out.println(num+"不是一个素数。");

            }
            }
        }
    }
