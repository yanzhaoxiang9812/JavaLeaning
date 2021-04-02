package Exception.TryCatch;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
    深入try..catch
        1、catch后面的小括号中的类型可以是具体的异常类到，也可以是该异常类型的父类型。
        2、catch可以写多个。建议catch的时候，精确的一个一个处理。这样有利于程序的调试。
        3、catch写多个的时候，从上到下，必须遵守从小到大。

 */
public class TryCatch {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("E:\\JavaLeaning\\Leaning\\src\\Test1.txt");
            System.out.println("以上出现异常，这里不运行。");
        }catch (FileNotFoundException e){
            /*这里的catch (FileNotFoundException e)
            实际是在出现异常时，创建了一个FileNotFoundException类型对象，该对象引用为e
            则：FileNotFoundException也可以写为该异常类的父类。
             */
            System.out.println("File Not Found");
        }
        System.out.println("可执行。。。。。");
        //输出：File Not Found         可执行。。。。。

        try {
            FileInputStream fis2 = new FileInputStream("E:\\JavaLeaning\\Leaning\\src\\Test1.txt");
            fis2.read();
            //这里的fis调用read()读方法出现异常。
            //catch 可以写多个。
            System.out.println("以上出现异常，这里不运行。");
        }catch (FileNotFoundException e){
            System.out.println("File Not Found");
        }catch (IOException e){
            System.out.println("read is wrong");
        }

        //Jdk8 新特性：可在catch参数中写多个异常类型使用逻辑运算符” | “ 。
        try {
            FileInputStream fis3 = new FileInputStream("E:\\JavaLeaning\\Leaning\\src\\Test1.txt");
            System.out.println(100/0);
        }catch (FileNotFoundException | ArithmeticException | NullPointerException e){
            System.out.println("File Not Found ？    数学异常？");
        }
    }
}
