package Static_This;
/*
    写一个名为Account的类模拟账户。该类的属性和方法如下所示。
        该类包括的属性:账户id，余额balance，年利率annualInterestRate;
        包含的方法:各属性的set和get方法。取款方法withdraw()，存款方法deposit()
        写一个测试程序
        (1）创建一个customer类，名字叫Jane smith，他有一个账号为1000，余额为2000，年利率为1.23%
        (2)对Jane smith操作:
        打印Jane Smith的基本信息
        存入100元,再取出960元,再取出2000.



 */
public class Test3 {
    public static void main(String[]args){
        Account a1 = new Account("1000",2000,0.0123);
        Customer2 c1 = new Customer2("Jane smith",a1);
        c1.detail();
        c1.getAct().deposit(100);
        c1.getAct().withdraw(960);
        c1.getAct().withdraw(2000);
        c1.detail();
    }
}
//customer类
class Customer2{
    private String name;
    private Account act;
    public Customer2(){}
    public Customer2(String name,Account act){
        this.name = name;
        this.act = act;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Account getAct() {
        return act;
    }
    public void setAct(Account act) {
        this.act = act;
    }
    public void detail(){
        System.out.println("------------------------------");
        System.out.println( "当前用户：" + this.getName()+"\n" + "ID："+this.getAct().getId() +"\n"+ "余额：" + this.getAct().getBalance() +"\n"+ "年利率：" +this.getAct().getAnnualInterestRate());
        System.out.println("------------------------------");
    }
}
//Account类
class Account{
    private String id;
    private double balance;
    private double annualInterestRate;
    public Account(){}//无参构造方法
    public Account(String id,double balance,double annualInterestRate){//有参构造方法
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }
    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }
    public void withdraw(double money){//取款方法withdraw()
        if( money > this.getBalance()){
            System.out.println("余额不足");
            return;
        }
        this.setBalance(this.getBalance() - money);
        System.out.println("取款" + money + "元成功" +  "\n" +"当前账户余额为：" + getBalance());
    }
    public void deposit(double money){//存款方法deposit()
        this.setBalance(this.getBalance() + money);
        System.out.println( money + "元存款成功"+ "\n" + "当前账户余额为：" + getBalance());
    }
}