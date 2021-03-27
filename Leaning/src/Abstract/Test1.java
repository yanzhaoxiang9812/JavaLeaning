package Abstract;
/*
        类-->对象：实例化
        对象-->类：抽象
    抽象类：类和类中存在共同特征，将这些共同特征提取出来形成了抽象类。(引用数据类型)
        类实际上是不存在的，所以抽象类不可以实例化。
        抽象类的作用是用来被子类继承的。
    抽象类的定义：
        [修饰符列表] abstract class 类名{
            类体;
        }
 */
public class Test1 {
    public static void main(String[] args) {
        //new A();
        //抽象类A 不能实例化。
        A1 a1 = new A1();
    }
}
abstract class A{
    public A() {
    }
    //抽象类虽然不能实例化，但是存在构造方法，供子类使用。
}
class A1 extends A{

}