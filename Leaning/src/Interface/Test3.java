package Interface;
/*
    继承和实现都存在
        extends和implements可以共存，extends在前，implements在后.

 */
public class Test3 {
    public static void main(String[] args) {
        //创建对象
        Flyble flyble = new Dog();//多态
        flyble.fly();
        Flyble flyble1 = new Pig();
        flyble1.fly();
        Flyble flyble2 = new Fish();
        flyble2.fly();
    }
}
//父类 动物类
class Animal{

}
//可飞翔的接口
interface Flyble{
    //接口通常提取的是行为动作。
    void fly();
}
//动物类 子类  狗类
//Flyble是一个接口，通过接口给到 狗类，让狗可以飞。
class Dog extends Animal implements Flyble{
    @Override
    public void fly() {
        System.out.println("狗狗在飞翔");
    }
}
//蛇类，不让飞。则不实现Flyable接口。
class Snake extends Animal{

}
//让谁飞，谁实现Flyable接口。
class Pig extends Animal implements Flyble {
    @Override
    public void fly() {
        System.out.println("猪猪在飞翔");
    }
}
//鱼类
class Fish implements Flyble{
    @Override
    public void fly() {
        System.out.println("鱼儿在飞翔");
    }
}
