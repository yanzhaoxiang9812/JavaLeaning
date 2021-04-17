package thread;
/*
        合理的终止线程
 */
public class ThreadTest9 {
    public static void main(String[] args) {
        MyThread9 myThread9 = new MyThread9();
        Thread thread = new Thread(myThread9);
        thread.setName("MyThread 9");
        thread.start();
        try {
            Thread.sleep(1000 * 5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //  修改标记
        myThread9.b = false;
    }
}
class MyThread9 implements Runnable{
    //  写一个布尔标记
    boolean b = true;
    @Override
    public void run() {
        for (int i = 1 ; i <= 10 ; i++){
            if (b){ System.out.println(Thread.currentThread().getName() + "--->" + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }else{
                //  可以在这里对数据的保存
                return;//   终止线程
            }
        }
    }
}
