package Exception.MyException;

/*
    自定义异常类
        第一步:编写一个类继承Exception或者RuntimeException.
        第二步:提供两个构造方法，一个无参数的，一个带有string参数的。

 */

public class MyException1 extends Exception{
    public MyException1() {
    }
    public MyException1(String s) {
        super(s);
    }
}
