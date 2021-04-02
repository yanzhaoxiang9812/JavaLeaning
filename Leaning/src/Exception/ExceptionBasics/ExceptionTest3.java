package Exception.ExceptionBasics;
/*
Java语言中对异常的处理包括两种方式:
    第一种方式:在方法声明的位置上，使用throws关键字,抛给上一级。
    第二种方式:使用try ..catch语句进行异常的捕捉。

    注意: Java中异常发生之后如果一直上抛，最终抛给了main方法，main方法继续
        向上抛，抛给了调用者JVM，JVM知道这个异常发生，只有一个结果。终止java
        程序的执行。|

 */
public class ExceptionTest3 {
    public static void main (String[] args){

        /*调用doSmone()方法
        因为doSome()方法声明位置上有: throws ClassNotFoundException
        我们在调用doSome()方法的时候必须对这种异常进行预先的处理。
        如果不处理，编译器就报错。
         */
        // doSome();    此处代码编译不能通过。
        //java: 未报告的异常错误java.lang.ClassNotFoundException; 必须对其进行捕获或声明以便抛出

        /*原因是:
           因为doSome()方法声明位置上使用了 :throws ClassNotFoundException
           而CLassNotFoundException是编译时异常。必须编写代码时处理，没有处理编
           译器报错。*/


    }
    /**
     * doSome方法在方法声明的位置上使用了:throws ClassNotFoundException
     *这个代码表示doSome()方法在执行过程中，有可能会出现CLassNotFoundException异常。
     *叫做类没找到异常。这个异常直接父类是:Exception,所以CLassNotFoundException属于编译时异常。
     * @throws ClassNotFoundException
     */
    public static void doSome() throws ClassNotFoundException{
        System.out.println("doSome");
    }
}
