package thread;
/*
        实现线程的第二种方式：
            编写一个类，实现Runnable接口。

 */
public class ThreadTest2 {
    public static void main(String[] args) {
        /*
        //  创建一个可运行的对象
        MyThread3 myThread3 = new MyThread3();
        //  将该对象封装成一个线程对象。
        Thread thread = new Thread(myThread3);
         */

        //  合并上面的代码
        Thread thread = new Thread(new MyThread3());
        //  启动线程
        thread.start();
        for (int i = 0 ; i < 100 ; i++){
            System.out.println("main----->"  + i);
        }
    }
}
class MyThread3 implements Runnable{
    @Override
    public void run() {
        for (int i = 0 ; i < 100 ; i++){
            System.out.println("MyThread3----->"  + i);
        }
    }
}
