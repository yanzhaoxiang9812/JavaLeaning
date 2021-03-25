package Super;
/*
        使用super调用父类方法
 */
public class Test5 {
    public static void main(String [] args){
        Cat cat = new Cat();
        cat.yiDong();
    }
}
class Animal{
    public void move(){
        System.out.println("Animal move");
    }
}
class Cat extends Animal{
    public void move(){
        System.out.println("Cat move");
    }
    public void yiDong(){
        this.move();
        move();
        super.move();
        //这里通过‘super.’调用了父类的move()方法。
    }
}
/*
    super.属性名       【访问父类的属性】
    super.方法名(实参)  【访问父类的方法】
    super(实参)        【调用父类的构造方法】

 */
