package Generic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
            泛型的优点：
                第一:集合中存储的元素类型统一了。
                第二:从集合中取出的元秦类型是泛型指定的类型，不需要进行大量的“向下转型”

            泛型的缺点：
                导致集合中存储的元素缺乏多样性!

 */

public class GenericTest2 {
    public static void main(String[] args) {
        //      使用泛型创建集合
        //      则个集合只能存储Animal类型对象。
        List<Animal2> list = new ArrayList<Animal2>();
        //      创建对象
        Cat2 cat2 = new Cat2();
        list.add(cat2);
        Bird2 bird2 = new Bird2();
        list.add(bird2);
        Iterator<Animal2> iterator = list.iterator();
        while (iterator.hasNext()){
            //      则这里不需要强制类型转换
            Animal2 animal2 = iterator.next();
            //  animal2.move();
            //   Animals move !!
            //   Animals move !!

            //     若还需要Animal中不同子类调用自身特有方法则必须还得强制类型转换
            if (animal2 instanceof Cat2){
                Cat2 cat21 = (Cat2) animal2;
                cat21.cathMouse();
            }if (animal2 instanceof Bird2){
                Bird2 bird21 = (Bird2) animal2;
                bird21.fly();
            }
            //猫在吃鱼
            //鸟儿在飞
        }


    }
}
class Animal2{
    public void move(){
        System.out.println("Animals move !!");
    }
}
class Cat2 extends Animal2{
    public void cathMouse(){
        System.out.println("猫在吃鱼");
    }
}
class Bird2 extends Animal2{
    public void fly(){
        System.out.println("鸟儿在飞");
    }
}
