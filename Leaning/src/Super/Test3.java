package Super;


/*
    在恰到的时间使用super():
            49行
 */
public class Test3 {
    public static void main(String [] args){
        CreditAccount1 creditAccount1 = new CreditAccount1();
        System.out.println(creditAccount1.getCredit()+"     " + creditAccount1.getBalance() + "     " + creditAccount1.getActno()    );
        CreditAccount1 creditAccount2 = new CreditAccount1("123",100,0.99);
        System.out.println(creditAccount2.getCredit()+"     " + creditAccount2.getBalance() + "     " + creditAccount2.getActno()    );

    }
}
//父类
class Account1{//银行账户类
    private String actno;
    private double balance;
    //无参构造方法
    public Account1(){}
    //有参构造方法
    public Account1(String actno, double balance) {
        this.actno = actno;
        this.balance = balance;
    }
    public String getActno() {
        return actno;
    }
    public void setActno(String actno) {
        this.actno = actno;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
}
//’子类‘
class CreditAccount1 extends Account1 {//信用卡类
    private double credit;//信誉度，子类特有的属性
    //无参构造方法
    public CreditAccount1(){}
    //有参构造方法
    public CreditAccount1(String actno,double balance,double credit){
        //这里实际存在super();调用父类的构造方法，
        super(actno,balance);
        //通过上行代码可以’父‘类型’特征‘赋值
        this.credit = credit;
    }
    public double getCredit() {
        return credit;
    }
    public void setCredit(double credit) {
        this.credit = credit;
    }
}