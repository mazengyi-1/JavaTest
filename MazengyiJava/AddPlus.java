package MazengyiJava;

import java.util.Scanner;

public class AddPlus {
    public static int Addplus(int a,int b){
        int Addplus=0;
        for (int i=a;i<=b;i++){
            Addplus+=i;
        }
       return Addplus;
    }
    public static void main(String[] args){
        System.out.print("请输入两个数:");
        Scanner in=new Scanner(System.in);
        int a,b;
        a=in.nextInt();
        b=in.nextInt();
        System.out.println(a+"到"+b+"之间所有整数和为："+Addplus(a,b));
    }
}
