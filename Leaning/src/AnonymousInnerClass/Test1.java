package AnonymousInnerClass;
/*
    1，内部类：在类的内部再定义新的类。
    2，内部类分类：
        静态内部类，类似静态变量
        实例内部类，类似实例变量
        局部内部类，类似局部变量
    3，
 */
public class Test1 {
    //Inner1类在Test1类的内部，故称为实例内部类。
    class Inner1{
    }
    //Inner2在Test1类的内部，且被static修饰，故称为静态内部类。
    static class Inner2{
    }
    public void doSome(){
        ////Inner3类在Test1类的内部，且是局部的，故称为局部内部类。
        class Inner3{
        }
    }

    public static void main(String[] args) {
        //可以不用实现接口Compute，可以这样写。
        Math math = new Math();
        math.mathSum(new Compute() {
            @Override
            public int sum(int a, int b) {
                return a + b;
            }
        },200,200);
        //这样的代码就叫做 匿名内部类。

        new Math().mathSum(new Compute() {
            @Override
            public int sum(int a, int b) {
                return a + b;
            }
        },200,300);
    }
}

//负责计算的接口
interface Compute{
    //抽象方法
    int sum ( int a, int b);
}
//数学类
class Math{
    //求和方法，调用了接口Compute的求和抽象方法
    public void mathSum(Compute compute,int a ,int b){
        System.out.println(compute.sum(a,b));
    }
}

