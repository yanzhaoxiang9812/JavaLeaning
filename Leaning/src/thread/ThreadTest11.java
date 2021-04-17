package thread;
/*
            合并线程
 */
public class ThreadTest11 {
    public static void main(String[] args) {
        //  匿名内部类创建线程
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1 ; i <= 100 ; i++){
                    System.out.println(Thread.currentThread().getName() + "-->" + i);
                }
            }
        });
        System.out.println("main 开始");
        t.setName("t");
        t.start();
        //  合并线程        t合并到当前线程中，当前线程(main线程)受阻塞，t线程执行直到结束。
        try {
            t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("main 结束");
    }
}
