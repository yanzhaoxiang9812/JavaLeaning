package thread;
/*
        死锁
 */
public class DeadLock {
    public static void main(String[] args) {
        Object o1 = new Object();
        Object o2 = new Object();
        Thread t1 = new mt1(o1,o2);
        Thread t2 = new mt2(o1,o2);
        t1.start();
        t2.start();
    }
}
class mt1 extends Thread{
    Object o1;
    Object o2;

    public mt1(Object o1, Object o2) {
        this.o1 = o1;
        this.o2 = o2;
    }

    public void run(){
        synchronized (o1){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (o2){

            }
        }
    }
}
class  mt2  extends Thread{
    Object o1;
    Object o2;
    public mt2(Object o1, Object o2) {
        this.o1 = o1;
        this.o2 = o2;
    }
    public void run(){
        synchronized (o2){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (o1){

            }
        }
    }
}
