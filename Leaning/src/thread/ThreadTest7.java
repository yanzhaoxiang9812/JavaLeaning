package thread;
/*
        终止线程休眠方法  .interrupt()
 */
public class ThreadTest7 {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + "---->开始");
        Thread thread = new Thread(new MyThread7());
        thread.setName("MyThread");
        thread.start();
        // 五秒后终止thread线程的休眠
        try {
            Thread.sleep(1000 * 5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //  终止thread线程的休眠
        thread.interrupt();

        System.out.println(Thread.currentThread().getName() + "---->结束");
    }
}
class MyThread7 implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "----> 开始");
        //  这里只能try catch。子类不能抛出更多的异常
        try {
            //  睡眠一分钟
            Thread.sleep(1000 * 60);
        } catch (InterruptedException e) {
            //  e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "----> 结束");
    }
}
