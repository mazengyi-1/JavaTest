package MazengyiJava;

import java.util.Scanner;

public class Add {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n;
        double fn=0;
        double Fn=0;
        System.out.print("请输入一个正整数：");
        n=in.nextInt();
        for (double i=1;i<=n;i++){
            fn=fn+1/i;
        }//fn=1+1/2 + 1/3 + 1/4 +...+1/n;
        for (double i=1;i<=n;i++){
            Fn=Fn+(1/i)*(Math.pow(-1,i-1));
        }//Fn=1 - 1/2 + 1/3 -1/4+...+1/n;
        System.out.printf("%.2f",fn);//printf按照一定的格式输出，"%.2f"保留两位小数。
        System.out.println();
        System.out.printf("%.2f",Fn);
    }
}
