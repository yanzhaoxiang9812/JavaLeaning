package Super;
/*
    super:
        super能出现在实例方法和构造方法中。super的语法是:"super."、"super ()"
        super不能使用在静态方法中。
        super.大部分情况下是可以省略的。
        super.什么时候不能省略呢?? ? ? ? ? ? ?
        super()只能出现在构造方法第一行，通过当前的构造方法去调用父类"中的构造方法，
        super()的目的是:创建子类对象的时候，先初始化父类型特征。

 */
public class Test1 {
    public static void main(String [] args){
        new B();
        //  输出结果： A类的无参数构造方法 B类的无参数构造方法
        //  ？？？？为什么呢？？？？

    }
}
class A{
    public A(){
        //这里实际存在一条语句：super();
        System.out.println("A类的无参数构造方法");
    }
    public A(int i){
        //这里实际存在一条语句：super();
        System.out.println("A类的有参数构造方法int");
    }
}
class B extends A{
    public B(){
        //super();这里实际上是存在前面的super();
        /*当一个构造方法第一行:既没有this()又没有super()的话，
        默认会有一个super() ;
        表示通过当前子类的构造方法调用父类的无参数构造方法。
        所以必须保证父类的无参数构造方法是存在的。
         */
        //super();  这行语句与下行语句发生错误，super();必须是构造方法的第一行。
        // 并且 this()和super()不能共存。
        //super(100);//这是实际上是调用了父类的有参构造方法
        /*
                输出结果：
                    A类的有参数构造方法int
                    B类的无参数构造方法
         */
        this("111");
        /*
            输出结果：
            A类的无参数构造方法
            B类的有参构造方法String
            B类的无参数构造方法

            无论如何，都会执行父类的构造方法。
         */
        System.out.println("B类的无参数构造方法");
    }
    public B(String name){
        //这里实际存在一条语句：super();
        System.out.println("B类的有参构造方法String");
    }
}