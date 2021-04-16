package thread;
/*
            实现线程的第一种方式：
                编写一个类，继承Thread,重写run方法。
 */
public class ThreadTest1 {
    public static void main(String[] args) {
        //  新建分支线程对象
        MyThread1 myThread1 = new MyThread1();
        //  启动线程
        myThread1.start();
        //      start()方法的作用是：启动一个分支线程，在JVM中开辟一个新的栈空间。
        MyThread2 myThread2 = new MyThread2();
        myThread2.start();
        for (int i = 0 ; i < 1000 ; i++){
            System.out.println("main---->" + i);
        }
    }
}
class MyThread1 extends Thread{
    public void run(){
        for (int i = 0 ; i < 1000 ; i++){
            System.out.println("MyThread1---->" + i);
        }
    }
}
class MyThread2 extends Thread{
    public void run(){
        for (int i = 0 ; i < 1000 ; i++){
            System.out.println("MyThread2---->" + i);
        }
    }
}