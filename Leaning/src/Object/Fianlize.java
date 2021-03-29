package Object;
/*
1、在object类中的源代码:
    protected void finalize() throws Throwable { }
    GC:负责调用finalize()方法。

2、finalize()方法只有一个方法体，里面没有代码，而且这个方法是protected修饰的。
3、这个方法不需要程序员手动调用，JVM的垃圾回收器负贲调用这个方法。
    不像equals tostring,equals和tostring()方法是需要你写代码调用的。
    finalize()只需要重写，重写完将来自动会有程序来调用。
4、finalize()方法的执行时机:
        当一个java对象即将被垃圾回收器回收的时候，垃圾回收器负贲调用finalize()方法。
5、finalize()方法实际上是sun公司为java程序员准备的一个时机，垃圾销毁时机。
        如果希望在对象销毁时机执行一段代码的话，这段代码要写到finalize()方法当中。



 */
public class Fianlize {
    public static void main(String[] args) {
        //创建对象
        for(int i = 0;i < 1000;i++){
            Person p = new Person();
            p = null;
        }
        //java中的垃圾回收器不是轻易启动的,垃圾太少，或者时间没到,种种条件下,有可能启动，也有可能不启动。
        System.gc();//此行代码可以‘建议’启动垃圾回收。
    }
}
class Person{
    //重写fianlize方法
    protected void finalize()throws Throwable{
        System.out.println(this + "即将被销毁 ！");
    }
}

