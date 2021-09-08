package MazengyiJava;

import java.util.Scanner;

public class GameJing {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int Size=3;
        int isR=0;
        int isF=0;//用于判断是否无人胜利
        int[][] pan=new int[Size][Size];
        System.out.println("请输入棋盘布局：");
        for (int i=0;i<Size;i++){
            for(int j=0;j<Size;j++){
                pan[i][j]=in.nextInt();
            }
        }
        //判断横向是否一样；
        for (int i=0;i<Size;i++){
            for (int j=0;j<Size;j++){
                isR+=pan[i][j];
            }
            if(isR==3*pan[i][0])
            {
                System.out.print("获胜的是a"+pan[i][0]);
                isF=1;
                break;
            }
        }//判断纵向是否一致
        for (int j=0;j<Size;j++){
            for (int i=0;i<Size;i++){
                    isR+=pan[i][j];
                }
                if(isR==3*pan[0][j])
                {
                    System.out.print("获胜的是b"+pan[j][0]);
                    isF=1;
                    break;
                }

        }
        //判断对角线是否一致
        for (int i=0;i<Size;i++){
            isR+=pan[i][i];
            if(isR==3*pan[0][0]){
                System.out.print("获胜的是c"+pan[0][0]);
                isF=1;
            }
        }
        //判断反对角线是否一致
        for (int i=0;i<Size;i++){
            for (int j=0;j<Size;j++){
                if(i+j==Size-1){
                    isR+=pan[i][j];
                }
            }
            if(isR==3*pan[0][2]){
                System.out.print("获胜的是d"+pan[0][2]);
                isF=1;
            }
        }
        if (isF==0){
            System.out.print("没有胜利者！");
        }


    }
}
