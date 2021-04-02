package Exception.ExceptionBasics;
/*
什么是异常，java提供异常处理机制有什么用?
        以下程序执行过程中发生了不正常的情况，而这种不正常的情况叫做∶异常
        java语言是很完善的语言，提供了异常的处理方式，以下程序执行过程中出现了不正常情况
        ，java把该异常信息打印输出到控制台，供程序员参考。程序员看到异常信息之后，可以对
        程序进行修改，让程序更加的健壮。

 */
public class ExceptionTest1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int c = a / b;
        System.out.println(a + "/" + b + "=" + c);
        //出现异常ArithmeticException

    }
}
