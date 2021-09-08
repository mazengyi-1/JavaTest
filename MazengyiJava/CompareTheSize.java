package MazengyiJava;

import java.util.Scanner;
//三个数字比较大小

public class CompareTheSize {
    public static void main(String[] args){
        double a,b,c,max;
        System.out.print("请输入三个数字：");
        Scanner in=new Scanner(System.in);
        a=in.nextDouble();
        b=in.nextDouble();
        c=in.nextDouble();
        if(a>b){
            max=a;
        }
        else {
            max=b;
        }
        if (max>c){max=max;}
        else {max=c;}
        System.out.println(max);
    }
}
