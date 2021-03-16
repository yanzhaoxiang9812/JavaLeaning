package Method;
//M4练习的改进
import java.util.Scanner;

public class M4_2 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("输入数字");
        int n = s.nextInt();
        while(!isZhiShu(++n)){}
        System.out.println(n);
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
