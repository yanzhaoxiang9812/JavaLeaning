package thread;
/*
        .yield()让位方法
 */
public class ThreadTest10 {
    public static void main(String[] args) {
        //  匿名内部类创建线程
            Thread t = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i = 1 ; i <= 10000 ; i++){
                        if (i % 100 == 0){
                            Thread.yield();//   当前线程暂停让位
                        }
                        System.out.println(Thread.currentThread().getName() + "-->" + i);
                    }
                }
            });
            t.setName("t线程");
            t.start();
            for (int i = 1 ; i <= 10000 ; i++){
                System.out.println(Thread.currentThread().getName() + "-->" + i);
            }
    }
}
