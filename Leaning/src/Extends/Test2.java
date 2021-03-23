package Extends;
/*
    Test1中的代码臃肿问题可用继承来解决，如下


        继承：
            基本作用：子类继承父类，代码可以得到复用。
            主要作用：有了继承功能，才可以方法覆盖和多态机制。

 继承的相关特性:
    1，B类继承A类,则称A类为超类(superclass)、父类,基类,B类则称为子类(subclass)、派生类、扩展类。
    2，java中的继承只支持单继承，不支持多继承，C++中支持多继承，这也是 java体现简单性的一点，换句话说，java中不允许这样写代码: class B extends A.C{}。
    3，虽然 java中不支持多继承，但有的时候会产生间接继承的效果，例如: class C extends B，class B extends A，也就是说，C直接继承B，其实C还间接继承A。
    4，java中规定，子类继承父类，除‘构造方法’不能继承外，剩下‘所有内容’都可以继承，但私有的属性无法再子类中直接访问。
    5，java中的类没有显示的继承任何类，则默认继承Object类，Object类是java语言提供的根类（老祖宗类)，也就是说，一个对象与生俱来就有Object类型中所有的特征。
    6，继承也存在一些缺点，例如:CreditAccount类继承Account类会导致它们之间的耦合度非常高，Account类发生改变之后会马上影响到CreditAccount类。

*/
public class Test2 {
    public static void main(String[]args){
        Account1 act = new Account1("123",100);
        System.out.println(act.getActno() + "，余额：" + act.getBalance());
        CreditAccount1 ca = new CreditAccount1(0.99);
        System.out.println(ca.getActno() + "，余额：" + ca.getBalance() + "，信誉度："+ ca.getCredit());
        //上面的访问Account1中属性是因为CreditAccount1子类继承了Account1父类，包括其中的get，set方法，
        //所以这里是通过get，set方法访问Account1中的私有变量
    }
}
//‘父类’
class Account1{//银行账户类
    private String actno;
    private double balance;
    public Account1(){}
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
class CreditAccount1 extends Account{//信用卡类
    //private String actno;
    //private double balance;
    private double credit;//信誉度
    public CreditAccount1(double credit){
        this.credit = credit;
    }
    /*
    public CreditAccount1(String actno, double balance, double credit) {
        this.actno = actno;
        this.balance = balance;
        this.credit = credit;
    }
     */
    public double getCredit() {
        return credit;
    }
    public void setCredit(double credit) {
        this.credit = credit;
    }
}

