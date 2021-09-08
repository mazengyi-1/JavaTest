package MazengyiJava;

import java.util.Scanner;

public class TheTicketMachine {
    public static void main(String[] args){

        int balance=0;
        while (true){
            System.out.print("请投币：");
            int amount=0;
            Scanner in=new Scanner(System.in);
            amount=in.nextInt();
            balance=balance+amount;
            if(balance>=10){
            System.out.println("********************************");
            System.out.println("********JAVA车站扬帆起航**********");
            System.out.println("*******  您的票价为10元    *******");
            System.out.println("********************************");
            System.out.println("为您找零："+(balance-10)+"元");
            balance=0;
            }
            else {
                System.out.println("你的金额不足够购买车票！");
                System.out.println("请额外投"+(10-balance)+"元！");
        }
       }



    }
}
