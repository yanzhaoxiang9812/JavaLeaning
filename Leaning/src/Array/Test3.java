package Array;
/*
                引用数据类型的数组
对于数组来说，实际上只能存储java对象的内存地址”。数组中存储的每个元素是"引用”。

 */
public class Test3 {
    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new A();
        A [] as = {a1,a2};
        for (int i = 0 ; i < as.length ; i++ ){
            as[i].move();
        }


        A[] as1 = {new Bird(),new Fish()};
        for (int i = 0 ; i < as1.length ; i++ ){
            //调用子类特有方法。必须向下转型
            if(as1[i] instanceof Bird){
                Bird bird = (Bird) as1[i];
                bird.fly();
            }else if(as1[i] instanceof Fish){
                Fish fish =(Fish) as1[i];
                fish.swmming();
            }
        }

        //调用子类特有方法。必须向下转型


    }
}
class A{
    public void move (){
        System.out.println("A moving");
    }
}
class Bird extends A{
    public void move (){
        System.out.println("Bird flying");
    }
    public void fly(){
        System.out.println("鸟儿飞翔");
    }
}
class Fish extends A{
    public void move (){
        System.out.println("Fish swmming");
    }
    public void swmming(){
        System.out.println("鱼儿游泳");
    }
}

