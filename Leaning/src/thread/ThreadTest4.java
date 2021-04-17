package thread;
/*
        获取当前线程
            .currentThread();
        获取线程名字
            .getName();
        修改线程对象名称
            .setName();
 */
public class ThreadTest4 {
    public static void main(String[] args) {
        //  获取当前线程名称(main)
        //这行代码出现在哪里，就获取的当前线程对象。
        System.out.println(Thread.currentThread().getName());//main

        //  创建分支线程对象
        MyThread4 myThread4 = new MyThread4();
        //  获取分支线程名称。
        System.out.println(myThread4.getName());//Thread-0(默认名称)
        //  修改分支线程名称
        myThread4.setName("java");
        System.out.println(myThread4.getName());//java
        //  启动分支线程
        myThread4.start();
    }
}
class MyThread4 extends Thread{
    public void run(){
        System.out.println("==========");
    }
}