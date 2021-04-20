package wait_notify;

public class Test2 {
    public static void main(String[] args) {
        //  创建数字对象
        num n = new num();
        //  创建输出奇数的线程
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    synchronized (n) {
                        if (n.i % 2 == 0) {
                            //  如果是偶数，wait
                            try {
                                n.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                        System.out.println(Thread.currentThread().getName() + "输出：" + n.i);
                        n.i++;
                        n.notify();
                    }
                }
            }
        });
        t1.setName("输出奇数线程");
        //  创建输出偶数线程
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    synchronized (n) {
                        if (n.i % 2 != 0) {
                            //  如果是奇数数，wait
                            try {
                                n.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                        System.out.println(Thread.currentThread().getName() + "输出:" + n.i);
                        n.i++;
                        n.notify();
                    }
                }
            }
        });
        t2.setName("输出偶数线程");
        t1.start();
        t2.start();
    }
}
class num {
    int i = 1;
}
