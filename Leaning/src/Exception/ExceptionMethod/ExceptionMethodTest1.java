package Exception.ExceptionMethod;

/*
    异常对象有两个非常重要的方法:
            获取异常简单的描述信息:
                String msg = exception.getNessage();
            打印异常追踪的堆栈信息:(最好用这种方式)
                exception.printStackTrace();

 */

public class ExceptionMethodTest1 {
    public static void main(String[] args) {

        //获取异常简单的描述信息
        NullPointerException e = new NullPointerException("空指针异常");
        String msg = e.getMessage();
        System.out.println(msg);
        //空指针异常


        //打印异常追踪的堆栈信息(java后台打印异常堆栈追踪信息的时候，采用了异步线程的方式打印的。)
        e.printStackTrace();//
        // java.lang.NullPointerException: 空指针异常
        //at Exception.ExceptionMethod.ExceptionMethodTest1.main

    }
}
