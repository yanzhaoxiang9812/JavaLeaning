package thread;

public class ThreadTest6 {
    public static void main(String[] args) {
        Thread thread = new Thread(new MyThread6());
        thread.setName("MyThread6");
        thread.start();
        //  调用sleep方法
        try {
            thread.sleep(1000 * 5);
            /*  这里不会让thread线程去休眠。
                而是会让当前线程进入休眠。（main线程）
             */
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("JAVA");
    }
}
class MyThread6 implements Runnable{
    @Override
    public void run() {
        for (int i = 1 ; i < 20 ; i++){
            System.out.println(Thread.currentThread().getName() + "===》" + i);
        }
    }
}