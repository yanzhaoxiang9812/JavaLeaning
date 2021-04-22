package reflect;
/*
            Class.forName("className");
                这个代码会进行对className类的类加载。

                若只希望执行某个类的静态代码块，可以使用Class.forName("className");
 */
public class Test5 {
    public static void main(String[] args) {
        try {
            Class.forName("reflect.MyClass");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
class MyClass{
    static {
        System.out.println("MyClass 的静态代码块执行");
    }
}