package MazengyiJava;

import java.util.Scanner;
//输出前n个素数
public class PrimeNum3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;
        System.out.print("请输入需要前多少个素数：");
        num = in.nextInt();
        int sum = 0;
        System.out.print("前" + num + "位素数为：");

            for (int i=2; sum<num; i++) {
                int isprime = 1;
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        isprime = 0;
                        break;
                    }
                }
                if (isprime == 1) {
                    sum++;
                    System.out.print(" " + i);
                }
          //  sum+=1;
            }
        }
}
