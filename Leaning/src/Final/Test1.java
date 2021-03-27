package Final;
/*
    final修饰的‘变量’只能赋值一次。
    final修饰的‘方法’无法覆盖。
    final修饰的‘类’不能被继承(重写)。
    fianl修饰的‘引用’只能指向一个对象， 并只能永远指向该对象（但该对象内部的属性时可变的。）
    final修饰的‘实例变量’必须手动赋值，要么在声明实例变量时直接赋值，要么在构造方法中对其赋值。(fianl修饰的实例变量一般添加static关键字)
        static final 修饰的变量称为“常量”。(常量一般全部大写，且常量一般都是公开的)
 */
public class Test1 {
    public static void main(String[] args) {
        final int i;
        i = 100;
        //i =200;//此行出现错误，fianl修饰的变量只能赋值一次
        final E e = new E(1);
        System.out.println(e.getI());
        //e = new E(2); 此行出现错误，fianl修饰的引用只能指向一个对象， 并只能永远指向该对象
        //实际上 引用 也是一种变量。
        e.i = 2;//final修饰的引用只能指向一个对象，但该对象内部的属性时可变的。
        System.out.println(e.getI());
        //new F()的过程中，调用了F类的构造方法，对没有赋值且final修饰的y实例变量进行赋值。
        F f = new F();
        System.out.println(f.getY());
    }
}
final class A{

}
//class B extends A{}//此行出现错误，fianl修饰的类不能被继承
class C{
    public final void Method(){

    }
}
class D extends C{
  //   public void Method(){}   此行出现错误，fianl修饰的方法不能被覆盖(重写)
}
class E{
    int i ;
    public E() {
    }
    public E(int i) {
        this.i = i;
    }
    public int getI() {
        return i;
    }
    public void setI(int i) {
        this.i = i;
    }
}
class F{
    //实例变量
  //final int i;  此行代码是错误的。final修饰的实例变量必须在声明变量的时候赋值。
    //声明实例变量时如果没有赋值，系统会给与赋默认值。
    //但是final修饰的实例变量，并且在声明变量的时候如果不给予赋值，
    // 该变量始终为默认值，该变量也就没有存在的意义了。
    final int y;

    public int getY() {
        return y;
    }

    public F(){
        this.y = 2;
    }
    //实例变量是在创建对象时，调用构造方法过程中赋值的，这样的代码是正确的。
    //实例变量必须手动赋值，要么在声明实例变量时直接赋值，要么在构造方法中对其赋值。
}

