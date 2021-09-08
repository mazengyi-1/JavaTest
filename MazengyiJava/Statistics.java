package MazengyiJava;

import java.util.Scanner;

public class Statistics {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int[] num=new int[10];
        int n0=0;
        int n1=0;
        int n2=0;
        int n3=0;
        int n4=0;
        int n5=0;
        int n6=0;
        int n7=0;
        int n8=0;int n9=0;
        System.out.print("请输入投票情况（0-9）：");
        for(int i=0;i<num.length;i++){
            num[i]=in.nextInt();
            if(num[i]==-1){
                break;
            }
        }
        for (int i=0;i<num.length;i++){
            if(num[i]==0){
                n0++;
            }
            else  if(num[i]==1){
                n1++;
            }
            else  if(num[i]==2){
                n2++;
            }else  if(num[i]==3){
                n3++;
            }else  if(num[i]==4){
                n4++;
            }else  if(num[i]==5){
                n5++;
            }else  if(num[i]==6){
                n6++;
            }else  if(num[i]==7){
                n7++;
            }else  if(num[i]==8){
                n8++;
            }else  if(num[i]==9){
                n9++;
            }
        }
        System.out.print("0号的票数为："+n0);
        System.out.println();
        System.out.print("1号的票数为："+n1);
        System.out.println();
        System.out.print("2号的票数为："+n2);
        System.out.println();
        System.out.print("3号的票数为："+n3);
        System.out.println();
        System.out.print("4号的票数为："+n4);
        System.out.println();
        System.out.print("5号的票数为："+n5);
        System.out.println();
        System.out.print("6号的票数为："+n6);
        System.out.println();
        System.out.print("7号的票数为："+n7);
        System.out.println();
        System.out.print("8号的票数为："+n8);
        System.out.println();
        System.out.print("9号的票数为："+n9);
        System.out.println();
    }
}
//较为巧妙的方法
/*int x;
int[] numbers=new int[10];
x=in.nextInt();
while(x!=-1)
{
if(x>=0&&X<9){
numbers[x]++;}

}
x=in.nextInt();
for(int i=0;i<numbers.length;i++){
System.out.println(i+"的票数为："+numbers[i]);}
 */
