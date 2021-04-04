package Generic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
                    不使用泛型。
         */
public class GenericTest1 {
    public static void main(String[] args) {

        //  创建集合
        List l1 = new ArrayList();

        //  创建对象
        Cat c1 = new Cat();
        Bird b1 = new Bird();

        //将对象添加到集合l1中
        l1.add(c1);
        l1.add(b1);

        //              遍历集合，
        //      需求：取出每个Animal对象并调用move（）
        Iterator i1 = l1.iterator();
        while (i1.hasNext()){
            Object o = i1.next();
            if( o instanceof Animal){
               Animal animal = (Animal) o;
               animal.move();
               //   Animals move !!
                //  Animals move !!
            }

        }

    }
}
class Animal{
    public void move(){
        System.out.println("Animals move !!");
    }
}
class Cat extends Animal{
    public void cathMouse(){
        System.out.println("猫在吃鱼");
    }
}
class Bird extends Animal{
    public void fly(){
        System.out.println("鸟儿在飞");
    }
}