package Super;
/*
        super.和this.大部分情况下是可以省略的
            super.什么情况不能省略？
                父类和子类有同名属性或方法，并且要在子类中访问父类的该属性或方法，不能省略。

         this.xx：   当前对象的xx属性或方法。
         super.xx：  当前对象的父类型特征的xx属性或方法。
         super不是引用。super也不保存内存地址，super也不指向任何对象。
         super只是代表当前对象内部的那一块父类型的特征。

 */
public class Test4 {
    public static void main(String [] ars){
        Vip vip = new Vip("张三");
        vip.shoppin();
    }
}
class Customer{
    String name;
    public Customer() {
    }
    public Customer(String name) {
        super();
        this.name = name;
    }
}
class Vip extends Customer{
    String name;
    public Vip(){}
    public Vip(String name) {
        super(name);
        //this.name = null
    }
    public void shoppin(){
        System.out.println(this.name + "正在购物");
        System.out.println(super.name + "正在购物");
        //上行代码 super.name是指向父类ustomer的name的
        System.out.println(this.name + "正在购物");
    }
}