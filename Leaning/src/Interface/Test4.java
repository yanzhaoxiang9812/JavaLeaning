package Interface;
/*
            接口的作用：解耦合。
                面向接口编程，可以降低程序的耦合度，提高程序的扩展力。
                符合ocP开发原则。接口的使用离不开多态机制。(接口+多态才可以达到降低耦合度。)
                任何一个接口都有调用者和实现者。
                接口可以将调用者和实现者解耦合。
                调用者面向接口调用。实现者面向接口编写实现。
            抽象类与接口的区别：
                抽象类是半抽象的。接口是完全抽象的。抽象类中有构造方法。接口中没有构造方法。
                接口和接口之间支持多继承。类和类之间只能单继承。
                一个类可以同时实现多个接口。
                一个抽象类兕能继承一个类（单继承)。
                接口中只允许出现常量和抽象方法。



 */
public class Test4 {
    public static void main(String[] args) {
        CaiDan cooker1 = new ChinaCooker();
        Customer c =new Customer(cooker1);
        c.order();
        CaiDan cooker2 = new AmericCooker();
        Customer c1 = new Customer(cooker2);
        c1.order();
    }
}
interface CaiDan{
    void xiHongShiChaoDan();
    void yuXiangRouSi();

}
//顾客手中有餐单。
//Customer has a CaiDan
class Customer{
    private CaiDan CaiDan;
    //点菜方法
    public void order(){
        CaiDan.xiHongShiChaoDan();
        CaiDan.yuXiangRouSi();
    }
    public Customer() {
    }
    public Customer(CaiDan CaiDan) {
        this.CaiDan = CaiDan;
    }

    public CaiDan getCaiDan() {
        return CaiDan;
    }
    public void setZhongCanCaiDan(CaiDan CaiDan) {
        this.CaiDan = CaiDan;
    }
}
//厨师是菜单接口的实现者。
class ChinaCooker implements CaiDan{
    @Override
    public void xiHongShiChaoDan() {
        System.out.println("中餐厨师 西红柿炒鸡蛋");
    }
    @Override
    public void yuXiangRouSi() {
        System.out.println("中餐厨师 鱼香肉丝");
    }
}
class AmericCooker implements CaiDan{
    @Override
    public void xiHongShiChaoDan() {
        System.out.println("西餐厨师 西红柿炒鸡蛋");
    }
    @Override
    public void yuXiangRouSi() {
        System.out.println("西餐厨师 鱼香肉丝");
    }
}
