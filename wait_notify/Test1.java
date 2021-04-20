package wait_notify;

import java.util.ArrayList;
import java.util.List;
/*
            wait(); notify();
                实现 生产者和消费者模式。
 */
public class Test1 {
    public static void main(String[] args) {
        //  创建仓库
        List list = new ArrayList();

        //  创建生产者线程
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                //  一直生产
                while (true){
                    synchronized (list){//  加锁
                        if (list.size() > 0 ){
                            try {
                                //  如果仓库大于0 表示已满，不再生产，进入等待并且释放锁，
                                list.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                        //  仓库非满，生产。
                        list.add(new Object());
                        System.out.println(Thread.currentThread().getName() +
                                "生产了： " + list.get(0));
                        //  唤醒消费者线程。
                        list.notify();
                    }
                }
            }
        });
        t1.setName("生产者线程");

        //  创建消费者线程
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                //  一直消费
                while (true){
                    synchronized (list){//  加锁
                        if (list.size() == 0 ){
                            try {
                                //  如果仓库等于0 表示仓库空，不再消费，进入等待并且释放锁
                                list.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                        //  仓库非空，可消费
                        System.out.println(Thread.currentThread().getName() +
                                "消费了： " + list.remove(0));
                        //  唤醒生产者。
                        list.notify();
                    }
                }
            }
        });
        t2.setName("消费者线程");
        t1.start();
        t2.start();
    }
}