package thread;
/*
        sleep(long millis)方法（静态方法）
            是当前线程进入休眠状态。
 */
public class ThreadTest5 {
    public static void main(String[] args) {
        /*
        try {
            //  五秒后执行main方法
            Thread.sleep(1000 * 5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Java nb");
         */

        //  创建线程对象
        MyThread5 myThread5 = new MyThread5();
        //  修改线程名称
        myThread5.setName("MyThread5");
        //  启动线程
        myThread5.start();

    }
}
class MyThread5 extends Thread{
    public void run(){
        for (int i = 1 ; i <= 10 ; i++){
            System.out.println(Thread.currentThread().getName() + "--------->" + i);
            try {
                //  每秒输出一个
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}