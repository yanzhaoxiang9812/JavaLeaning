package Abstract;

public class Test3 {
    public static void main(String[] args) {
        Animal animal = new Bird();
        animal.move();
        Animal animal1 = new Dog();
        animal1.move();
        Animal animal2 = new Fish();
        animal2.move();
    }
}
abstract class Animal{
    public abstract void move();
}
class Bird extends Animal{
    //非抽象类继承抽象类必须将抽象方法实现
    @Override
    public void move() {
        System.out.println("鸟儿在飞翔");
    }
}
class Dog extends Animal{
    @Override
    public void move() {
        System.out.println("小狗在奔跑");
    }
}
class Fish extends Animal{
    @Override
    public void move() {
        System.out.println("小鱼在游泳");
    }
}