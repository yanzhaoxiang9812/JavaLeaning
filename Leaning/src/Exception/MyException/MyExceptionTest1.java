package Exception.MyException;

public class MyExceptionTest1 {
    public static void main(String[] args) {
        MyException1 m1 = new MyException1("MyException");
        //打印异常堆栈信息。
        m1.printStackTrace();

        //获取异常简单描叙信息
        System.out.println(m1);

        MyException2 m2 = new MyException2("MyException2");
        //打印异常堆栈信息。
        m2.printStackTrace();

        //获取异常简单描叙信息
        System.out.println(m2);
    }
}
