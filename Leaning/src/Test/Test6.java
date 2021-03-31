package Test;
/*
4、编写Java程序模拟简单的计算器。
定义名为Number的类其中有两个整型数据成员n1和n2应声明为私有。
编写构造方法赋予n1和n2初始值再为该类定义加addition()、减subtration()、
乘multiplication()、除division()等
公有实例方分别对两个成员变量执行加、减、乘、除的运算。

在main方法中创建Number类的对象调用各个方法并显示计算结果

*/
public class Test6 {
    public static void main(String[] args) {
        Number n1 = new Number();
        System.out.println("计算结果为：" + n1.addition());
        System.out.println("计算结果为：" + n1.subtration());
        System.out.println("计算结果为：" + n1.multiplication());
        System.out.println("计算结果为：" + n1.division());
        System.out.println("================================");
        Number n2 = new Number(6,6);
        System.out.println("计算结果为：" + n2.addition());
        System.out.println("计算结果为：" + n2.subtration());
        System.out.println("计算结果为：" + n2.multiplication());
        System.out.println("计算结果为：" + n2.division());
    }
}
class Number{
    private int n1;
    private int n2;
    public Number() {
    }
    public Number(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }
    public int getN1() {
        return n1;
    }
    public void setN1(int n1) {
        this.n1 = n1;
    }
    public int getN2() {
        return n2;
    }
    public void setN2(int n2) {
        this.n2 = n2;
    }

    public int addition(){
        int jia = this.getN1()+this.getN2();
        return jia;
    }
    public int subtration(){
        int jian = this.getN1() + this.getN2();
        return jian;
    }
    public int multiplication(){
        int cheng = this.getN1() * this.getN2();
        return cheng;
    }
    public double division(){
        if(getN2() == 0){
            System.out.println("除数不能更改为零！");
            return 0;
        }else {
            double chu = this.getN1() / this.getN2();
            return chu;
        }

    }
}
