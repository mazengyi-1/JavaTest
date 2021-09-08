package MazengyiJava;

import java.util.Scanner;

public class Find {
    public static void main(String[] args){
        System.out.print("请输入你要查找的数：");
        Scanner in=new Scanner(System.in);
        int n;
        int isPut=0;//表示不在数组内。
        n=in.nextInt();
        int[] arr={1,2,3,9,8,5,11,11};
        for (int i=0;i<arr.length;i++){
            if(n==arr[i]){
                System.out.println("该数在数组中的第"+(i+1)+"个。");
                isPut=1;
            }
        }
        if(isPut==0){
            System.out.print("该数不在该数组内。");
        }
    }
}
