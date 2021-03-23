package Extends;
//这样的代码太过臃肿，可以用继承来解决，
public class Test1 {
        public static void main(String[]args){
            Account act = new Account("123",100);
            System.out.println(act.getActno() + "，余额：" + act.getBalance());
            CreditAccount ca = new CreditAccount("345",-100,0.99);
            System.out.println(ca.getActno() + "，余额：" + ca.getBalance() + "，信誉度："+ ca.getCredit());
        }
}
class Account{//银行账户类
    private String actno;
    private double balance;
    public Account(){}
    public Account(String actno, double balance) {
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
class CreditAccount{//信用卡类
    private String actno;
    private double balance;
    private double credit;//信誉度
    public CreditAccount(){}
    public CreditAccount(String actno, double balance, double credit) {
        this.actno = actno;
        this.balance = balance;
        this.credit = credit;
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
    public double getCredit() {
        return credit;
    }
    public void setCredit(double credit) {
        this.credit = credit;
    }
}

