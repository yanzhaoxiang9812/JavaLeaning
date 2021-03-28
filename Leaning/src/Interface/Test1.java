package Interface;
/*
    接口：
        接口是一种引用数据类型。
        接口是完全抽象(或者说接口是特殊的抽象类)
        接口支持多继承。
        接口中有且仅有：‘常量’和‘抽象方法’。
        (常量的public static final可省略。抽象方法的publi abstract可省略。)
        接口中的所有元素都是public修饰的，都是‘公开’的。

        接口的基础语法：
            修饰符列表 interface 接口名{}

 */
public class Test1 {
    public static void main(String[] args) {

    }
}
//定义接口
interface I1{}
interface I2{}

//接口支持多继承。
interface I3 extends I1,I2{}
interface MyMath{

    //定义常量。
    public static final double PI = 3.1415926;
    //前面的public static final可省略。
    int INT = 100;

    //定义抽象方法。
    public abstract int sum(int a , int b);
    //前面的publi abstract可省略。
    int sub(int a , int b);

    //下面语句是错误的。接口中只存在抽象方法(抽象方法不能存在方法体)不存在其他方法。
    //int div(){}

}