package ZuoYe;

import java.util.Scanner;

/*
    猜数字游戏
        一个类A有一个实例变量v，从键盘接收一个正整数作为实例变量v的初始值。
        另外再定义一个类B，对A类的实例变量v进行猜测。
        如果大了则提示大了
        小了则提示小了
        等于则提示猜测成功

 */
public class ZuoYe1 {
    public static void main(String [] args){
        A a = new A(100);
        B b = new B(a);
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("输入：");
            b.cai(scanner.nextInt());
        }
    }
}
class A{
    private int v ;
    public A(){}
    public A(int v ){
        this.v = v;
    }
    public int getV() {
        return v;
    }
    public void setV(int v) {
        this.v = v;
    }
}
class B{

    private A a;
    public B(){}
    public B(A a) {
        this.a = a;
    }
    public void cai(int i){
        if(i == a.getV()){
            System.out.println("猜测成功");
            System.exit(0);
        }else if(i > a.getV()){
            System.out.println("猜小了");
        }else{
            System.out.println("猜大了");
        }
    }
    public A getA() {
        return a;
    }
    public void setA(A a) {
        this.a = a;
    }
}