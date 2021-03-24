package Polymorphism;

public class Bird extends Animal{
    //对父类move（）重写
    public void move(){
        System.out.println("Bird's flying");
    }
    public void Sing(){
        System.out.println("Bird's Sing");
    }
}
