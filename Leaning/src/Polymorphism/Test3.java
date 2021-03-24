package Polymorphism;
/*
            ******************
            *****多态的作用*****         【降低程序的耦合度，提高程序扩展力】
            ******************

    编与程序模拟"主人"喂弄"龙物"的场景:
    * 提示1:
        主人类:Master宠物类:Pet
        宠物类子类:Dog、cat、Bird
    * 提示2:
        主人应该有喂养的方法: feed()宠物应该有吃的方法: eat()只要主人喂宠物，宠物就吃。
        要求:主人类中只提供一个喂养方法feed()，要求达到可以喂养各种类型的宠物。
        编写测试程序:
        创建主人对象创建各种宠物对象
        调用主人的喂养方法feed()，喂养不同的宠物，观察执行结果。
        通过该案例，理解多态在开发中的作用。
 */
public class Test3 {
    public static void main(String[]args){
        Master m1 = new Master();
        Dog d1 = new Dog();
        //主人m1喂狗d1
        m1.feed(d1);
        //产生新需求：主人养了宠物猫，
        //喂猫的方法需要再Master类添加
        Cat c1 = new Cat();
        m1.feed(c1);
        System.out.println("==============使用过多态后的程序=============");
        Master1 m11 = new Master1();
        Dog1 d11 = new Dog1();
        m11.feed(d11);
        Cat1 c11 = new Cat1();
        m11.feed(c11);
        Bird1 b11 = new Bird1();
        m11.feed(b11);

    }
}
//主人类
class Master{
    //主人 喂宠物狗方法
    public void feed(Dog dog){
        dog.eat();
    }
    //主人 喂宠物猫方法
    public void feed(Cat cat){
        cat.eat();
    }
}
//宠物 狗 类
class Dog{
    //狗的啃骨头方法
    public void eat(){
        System.out.println("狗狗喜欢啃骨头");
    }
}
//宠物 猫 类
class Cat{
    //猫 吃鱼 方法
    public void eat(){
        System.out.println("猫咪喜欢吃鱼");
    }
}
/*      public class Master{
        public void feed (Dog d) { }public void feed (Cat c){}
            以上的代码中表示:Master和Dog以及cat的关系很紧密（耦合度高)。导致扩展力很差。
        public class Master{
        public void feed(Pet pet) { }
            以上的代表中表示:Master和pog以及cat的关系就脱离了，
            Master关注的是pet类。这样Master和Dog以及cat的耦合度就降低了，提高了软件的扩展性。
 */
 /*
        思考:软件在扩展新需求过程当中，修改Master这个类有什么问题?
            一定要记住:软件在扩展过程当中，修改的越少越好。
            修改的越多，系统当前的稳定性就越差，未知的风险就越多。
            这里涉及到一个软件的开发原则:OCP(开闭原则)
                什么是开闭原则?
                    对扩展开放（你可以额外添加，没问题)，
                    对修改关闭（最好很少的修改现有程序)
                    在软件的扩展过程当中，修改的越少越好。
         */
        //修改Master类存在风险，在不修改Master类的情况下产生新需求，程序照常执行呢？
        //      *多态机制*
        //所以在Master类中的喂宠物方法中，不应该编写‘具体‘的宠物类型
        //可以在Master类中的喂宠物方法中，编写一个所有宠物的‘父类型’
//编写所有的宠物的父类
 class Pet{
     //宠物 eat的方法
     // 在Pet子类中对eat方法进行了重写。
     public void eat(){}
 }
 //之后让所有宠物继承父类Pet
 class Dog1 extends Pet{
     //狗的啃骨头方法
     public void eat(){
         System.out.println("狗狗喜欢啃骨头");
     }
 }
//宠物 猫 类
class Cat1 extends Pet{
    //猫 吃鱼 方法
    public void eat(){
        System.out.println("猫咪喜欢吃鱼");
    }
}
class Master1{
    //主人 喂宠物方法
    public void feed(Pet pet){
        pet.eat();
    }
}
/*假设新需求:主人养了一只鸟
        只需要编写鸟类并继承所有宠物的父类Pet，编写鸟儿特有的eat方法。
        **不需要修改Master**
 */
class Bird1 extends Pet{
    public void eat(){
        System.out.println("鸟儿喜欢吃小虫");
    }
}