package Interface;
/*
    1，类和类之间叫做继承，类和接口之间叫做实现。
        继承使用extends关键字完成。
        实现使用implements关键字完成。
     ***如果类实现了接口，就必须实现该接口中所有的方法。***
    2，一个类可以实现多个接口，(这就弥补了单继承的缺点)

 */
public class Test2 {
    public static void main(String[] args) {
        A a = new C();
        a.a();
        B b = new C();
        b.b();
        Math math = new MathImp();
        System.out.println(math.sub(5,2));
        Math math1 = new MathImp();
        System.out.println(math1.sum(1,2));
    }
}
//特殊的抽象类，完全抽象的，叫做接口。
interface Math{
    double PI = 3.1415926;
    int sum(int a,int b);
    int sub(int a,int b);
}
class MathImp implements Math{

    //实现接口的抽象方法
    @Override
    public int sum(int a, int b) {
        return a + b;
    }
    @Override
    public int sub(int a, int b) {
        return a - b;
    }
}

interface A{
    void a();
}
interface B{
    void b();
}
//一个类可以实现多个接口
class C implements A,B{
    //实现各接口的抽象方法
    @Override
    public void a() {
        System.out.println("A接口a方法实现了");
    }
    @Override
    public void b() {
        System.out.println("B接口b方法实现了");
    }
}
