package Static_This;
/*
    1、使用static关键字可以定义:静态代码块(特殊的时机：类加载时机)
    2、什么是静态代码块，语法是什么?
        static {
        java语句;
        java语句;
        ........
        }
    3、static静态代码块在什么时候执行呢?
        类加载时执行。并且只执行一次。
        静态代码块有这样的特征/特点。
    4、注意:静态代码块在类加载时执行，并且在main方法执行之前执行.
    5、静态代码块一般是按照自上而下的顺序执行。

 */
public class Static4 {
    static {//静态代码块
        System.out.println("A");
    }
    static {//静态代码块
        System.out.println("B");
    }
    public static void main(String[]args){//程序入口
        System.out.println("=============");
    }
    static {//静态代码块
        System.out.println("C");
    }/*

    输出结果如下：
    A
    B
    C
    =============

    */
}
