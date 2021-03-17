package Method;
/*
    用方法递归实现1+n的和
 */
import java.util.Scanner;

public class Recursion_Test {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("请输入：");
        int n = s.nextInt();
        int h = sum(n);
        System.out.println(h);
    }
    public static int sum(int n ){
        if(n == 1){return 1; }
        return n + sum(n - 1);
    }
}
