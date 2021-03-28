/*
    package:
        package是java中包机制。包机制的作用是为了方便程序的管理。
        不同功能的类分别存放在不同的包下。(按照功能划分的，不同的软件包具有不同的功能。)
        package是一个关键字，后面加包名。例如:package com.bjpowernode . javase.chapter17;
        注意:package语句只允许出现在java源代码的第一行。

    import:
        import什么时候使用?
            A类中使用B类。
            A和B类都在同一个包下。不需要import.A和B类不在同一个包下。需要使用import.
        import怎么用?
            import语句只能出现在package语句之下，class声明语句之上。

 */
package Package_Import;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        //下行代码使用了不属于本类的Scanner，故必须在包名之下class声明语句之上导入。
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入：" );
        int i = scanner.nextInt();
        System.out.println(  "输入了"+i);
    }
}

