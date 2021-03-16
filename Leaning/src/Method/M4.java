package Method;
/*
    输入一个数n，判断比n大的最小的指数。
        列入输入2，输出3
  */

import java.util.Scanner;

public class M4 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("请输入数字：");
        int n = s.nextInt();
        while(true){
            n++;
            //此时判断i++是否为质数
            boolean b = isZhiShu(n);
            if(b){
                System.out.println(n);
                break;
            }

        }


    }
    //判断质数的方法
    public static boolean isZhiShu(int num){
        for(int i = 2; i < num; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }

}
