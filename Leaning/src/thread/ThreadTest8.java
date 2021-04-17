package thread;
/*
        强行终止线程
 */
public class ThreadTest8 {
    public static void main(String[] args) {
        Thread thread = new Thread(new MyThread8());
        thread.setName("MyThread 8");
        thread.start();
        try {
            Thread.sleep(1000 * 5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //  五秒强行终止thread线程。
        thread.stop();//    不建议始终该方法。容易丢失数据。
    }
}
class MyThread8 implements Runnable{
    @Override
    public void run() {
        for (int i = 1 ; i <= 10 ; i++){
            System.out.println(Thread.currentThread().getName() + "--->" + i);
            try {
                //  每秒打印一个i
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
