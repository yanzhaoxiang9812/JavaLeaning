package Super;
/*
    输出结果：
        1
        3
        6
        5
        4
      当一个构造方法第一行:既没有this()又没有super()的话，
        默认会有一个super();表示通过当前子类的构造方法调用父类的无参数构造方法。
 */
public class Test2 {
    public static void main(String [] ars){
        new E();
    }
}
class C{
    public C(){
        System.out.println("1");
    }
}
class D extends C{
    public D(){
        System.out.println("2");
    }
    public D(String s){
        //这里存在：super()； 故先执行C的无参构造方法
        System.out.println("3");
    }
}
class E extends D{
    public E(){
        this("s");
        System.out.println("4");
    }
    public E(String s){
        this(s,1);
        System.out.println("5");
    }
    public E(String s,int i){
        super(s);
        System.out.println("6");
    }
}
