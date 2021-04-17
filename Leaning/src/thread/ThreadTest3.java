package thread;
/*
        实现线程的第三种方式：
            采用匿名内部类方式。
 */
public class ThreadTest3 {
    public static void main(String[] args) {
        //  匿名内部类创建线程对象。
        Thread thread = new Thread(new Runnable(){
            @Override
            public void run() {
                for (int i = 0 ; i < 100 ; i++){
                    System.out.println("thread----->" + i);
                }
            }
        });
        //  启动线程
        thread.start();
        for (int i = 0 ; i < 100 ; i++){
            System.out.println("main----->" + i);
        }
    }
}
