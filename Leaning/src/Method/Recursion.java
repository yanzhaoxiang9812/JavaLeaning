package Method;

import java.util.Scanner;

/*
jvm运行的方式是以‘栈’方式运行的，栈的特点是先进后出，后进先出。

jvm：
  ' 栈' (先进后出，后进先出 )             堆内存                   方法区
 | doSome()调用doSome()  |       -----------------       -----------------
 |    "doSome begin     |       |               |       |               |
 |  doSome()调用doSome() |       |  存放对象实例   |       |               |
 |   "doSome begi       |       |               |       |   存放代码片段  |
 |                      |       |               |       |    xx.class   |
 | doSome()调用doSome()  |       |               |       |    xx.class   |
 |    "doSome begin"    |       |               |       |    xx.class   |
 |  ’main‘调用doSome();  |       |               |       |     code..... |
 |  "doSome begin"      |       |               |       |               |
 |                      |       |               |       |               |
 ————————————————————————       —————————————————       —————————————————

方法递归：
    方法自己调用自己就是方法递归
    递归归没有结束条件，则会发生栈内存溢出错误
    故：递归必须要有结束条件(也存在递归太深，栈内存不够也会发生栈内存溢出错误)
 */
public class Recursion {
    public static void main(String [] args){
        doSome();
    }
    public static void doSome(){
        System.out.println("doSome begin");
        //doSmoe();//自己调用自己  一直输出"doSome begin"
        System.out.println("doSome over");//这行代码永远执行不到
        //这个程序永无止境的输出"doSome begin"
    }

}
