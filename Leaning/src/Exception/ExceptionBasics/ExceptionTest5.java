package Exception.ExceptionBasics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
/*
    处理异常的第一种方式:
        在方法声明的位置上使用throws关键字抛出，谁调用我这个方法，我就抛给谁。
        抛给调用者来处理。这种处理异常的态度:上报。
    处理异常的第二种方式:
        使用try..catch语句对异常进行捕捉。
        这个异常不会上报，自己把这个事儿处理了。

 */
public class ExceptionTest5 {
    //一般不建议在main方法上使用throws，因为这个异常如果真正的发生了，一定会抛给JVWN。JVM只有终止。
    //一般main方法中异常处理使用try..catch。
    public static void main(String[] args){
        System.out.println("main begin");
        try {//尝试调用m1
            m1();
        } catch (FileNotFoundException e) {
            //catch捕捉
            System.out.println("file not found ");
        }
        System.out.println("main oevr");
    }

    private static void m1() throws FileNotFoundException {
        System.out.println("m1 begin");
        m2();
        System.out.println("m1 oevr");
    }
    private static void m2() throws FileNotFoundException {
        System.out.println("m2 begin");
        m3();
        System.out.println("m2 oevr");
    }

    private static void m3() throws FileNotFoundException {
        //创建一个输入流对象，参数为文件路径。
        /*
        编译报错的原因是什么?
            第一:这里调用了一个构造方法:FileInputStream(String name)
            第二:这个构造方法的声明位置上有: throws FiLeNotFoundException
            第三∶通过类的继承结构看到:FileNotFoundException父类是IOException,
            IOException的父类是Exception最终得知，FileNotFoundException是编译
            时异常。则必须在编写程序阶段处理。
        */
        //处理方法：在m3方法声明位置上使用throws FileNotFoundException继续上抛，
        // m3,m2,m1,main全都必须使用该方法上抛.或者使用try..catch捕捉。
        new FileInputStream("E:\\JavaLeaning\\Leaning\\src\\Test.txt");
    }
}
