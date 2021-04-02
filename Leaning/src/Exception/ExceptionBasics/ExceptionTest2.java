package Exception.ExceptionBasics;
/*
        异常在java中以类的形式存在，每一个异常类都可以创建异常对象。
        每出现异常都会创建一个异常对象。

        异常可分为编译时异常和运行时异常：
         ！！！这两种异常都是发生在运行阶段的！！！

            所有Exception的直接子类，都叫做编译时异常。编译时异常是在编译阶段发生的吗?不是。
            编译时异常是表示必须在编写程序的时候预先对这种异常进行处理，如果不处理编译器报错。
            编译时异常又被称为受检异常，还有做受控异常。编译时异常发生概率较高。

            所有的RuntimeException及子类都属于运行时异常。运行时异常在编写程序阶段，你可以
            选择处理，也可以不处理。运行时异常发生概率较低。运行时异常还有另外一些名字:未受检
            异常，或者非受控异常。运行时异常一般发生的概率比较低。

 */
public class ExceptionTest2 {
    public static void main(String[] args) {
        //通过异常类”实例化异常对象”
        NumberFormatException numberFormatException = new NumberFormatException("数字格式化异常");
        System.out.println(numberFormatException);//java.lang.NumberFormatException: 数字格式化异常

        //通过"异常类”创建早常对象”
        NullPointerException npe = new NullPointerException("空指针异常发生了!");
        System.out.println(npe);// java.Lang.NulLLPointerException:空指针异常发生了!

        int a = 10;
        int b = 0;
        int c = a / b;//实际上jvm在此处会new一个异常类对象：ArithmeticException（/ by zero）
        //并且jvm将异常对象抛出，打印到控制台上。
        System.out.println(a + "/" + b + "=" + c);
        //出现异常ArithmeticException
    }
}
