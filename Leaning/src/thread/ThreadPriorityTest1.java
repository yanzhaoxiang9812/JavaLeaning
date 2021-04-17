package thread;
/*
        线程优先级
            设置线程优先级：.setPriority()方法
            获取线程优先级：.getPriority()方法
 */
public class ThreadPriorityTest1 {
    public static void main(String[] args) {
        //  当前main线程的优先级
        System.out.println(Thread.currentThread().getName() + " 线程默认优先级为："
                + Thread.currentThread().getPriority());
        //  匿名内部类创建线程
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                //  获取线程优先级
                System.out.println("thread 线程优先级：" + Thread.currentThread().getPriority());// 5
                for (int i = 0 ; i <  10000 ; i++){
                    System.out.println(Thread.currentThread().getName() + "-->" + i);
                }
            }
        });
        thread.setName("thread");
        thread.start();
        //  设置thread线程优先级
        thread.setPriority(10);

        //  设置main线程优先级
        Thread.currentThread().setPriority(1);
        System.out.println(Thread.currentThread().getName() + " 线程当前优先级为："
                + Thread.currentThread().getPriority());
        for (int i = 0 ; i <  10000 ; i++){
            System.out.println(Thread.currentThread().getName() + "-->" + i);
        }

        //  thread线程优先级大于main线程优先级
        //  输出结果中thread线程先执行完
    }
}
