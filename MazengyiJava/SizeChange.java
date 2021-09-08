package MazengyiJava;

import java.util.Scanner;

public class SizeChange {
    public static void main(String[] args){
        System.out.print("请输入一个字母：");
        Scanner in=new Scanner(System.in);
        String sc=in.next();
        char a;
        //System.out.println((int)'a'+" "+(int) 'A');

        a=sc.charAt(0);
        if ((int)(a)>=97){
            System.out.print("这个数的大写为"+(char)(a+('A'-'a')));
        }else {
            System.out.print("这个数的小写为"+(char)(a+('a'-'A')));
        }
    }
}
