package Polymorphism;

public class Fish extends Animal{
    //对父类move（）重写
    public void move(){
        System.out.println("Fish's swmming");
    }
    //鱼除了move之外，还有特有的行为
    public void fishScales(){
        System.out.println("Fish have scales");
    }
}
