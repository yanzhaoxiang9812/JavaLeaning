package thread.safeThread.safeTest1.safeTest2;
/*
        对safeTest1 中代码的线程同步操作
            方式一
                synchronized(共享对象){
                    同步代码块
                }
            方式二
                在对数据操作的方法上添加synchronized关键字
 */
public class Test2 {
        public static void main(String[] args) {
            MyBank myBank = new MyBank("java",10000);
            // 创建用户取款线程
            Thread t1 = new MyBankThread(myBank);
            Thread t2 = new MyBankThread(myBank);
            t1.setName("t1");
            t2.setName("t2");
            t1.start();
            t2.start();
        }
    }
    //账户类
    class MyBank{
        private  String acton;
        private  double balance;

        public MyBank(String acton, double balance) {
            this.acton = acton;
            this.balance = balance;
        }

        public String getActon() {
            return acton;
        }

        public void setActon(String acton) {
            this.acton = acton;
        }

        public double getBalance() {
            return balance;
        }

        public void setBalance(double balance) {
            this.balance = balance;
        }

        //  取款方法
        public void withdraw(double money){
            synchronized (this){
                //  取款前余额
                double before = this.balance;
                //  取款后余额
                double after = before - money;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //  更新余额
                this.balance = after;
            }

        }
    }
    class MyBankThread extends Thread{
        //  共享同一个账户
        private MyBank myBank;
        //  运行run方法表示取款操作
        public void run(){
            myBank.withdraw(5000);
            System.out.println(Thread.currentThread().getName() + "对账户" + myBank.getActon() + "取款"
                    + 5000 + "成功!" + "当前余额为：" + myBank.getBalance());

        }
        public MyBankThread(MyBank myBank) {
            this.myBank = myBank;
        }

    }
