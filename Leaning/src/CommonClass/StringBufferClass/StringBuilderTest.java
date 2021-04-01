package CommonClass.StringBufferClass;

/*
    StringBuffer和StringBuilder的区别?
        StringBuffer中的方法都有:synchronized关键字修饰。表示stringBuffer在多线程环境下运行是安全的。
        StringBuilder中的方法都没有:synchronized关键字修饰，表示stringBuilder在多线程环境下运行是不安全的。

        StringBuffer是线程安全的。
        StringBuilder是非线程安全的。

 */
public class StringBuilderTest {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("y");
        stringBuilder.append("z");
        stringBuilder.append("x");
        stringBuilder.append(100);
        stringBuilder.append(true);
        stringBuilder.append(3.14);
        stringBuilder.append(100l);
        System.out.println(stringBuilder);//yzx100true3.14100
    }
}
