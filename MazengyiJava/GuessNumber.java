package MazengyiJava;

import java.util.Scanner;
//猜数字
public class GuessNumber {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int Pnum=0;
        int Cnum=0;
        int sum=0;
        Cnum = (int) (Math.random()*101);
        System.out.println("计算机已经选好数字了，您开始猜吧！");
        while (true){
            Pnum=in.nextInt();
            sum++;
            if(Pnum>Cnum){
                System.out.println("您输入的数字过大，请重新输入：");
            }
            else if(Pnum<Cnum){
                System.out.println("您输入的数字过小，请重新输入：");
            }
            else {
                System.out.println("恭喜您猜中了！");
                break;
            }
        }
        System.out.println("您一共猜了"+sum+"次。");
        if(sum==1){
            System.out.print("天才啊！不愧是你！");
        }else if(sum>=7){
            System.out.print("你可真是个笨比！");
        }
    }
}
