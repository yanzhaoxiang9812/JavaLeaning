package Override;
/*
    什么时候我们会考虑使用"方法覆盖"呢?
        子类继承父类之后，当继承过来的方法无法满足当前子类的业务需求时，
        子类有权利对这个方法进行重新编写，有必要进行"方法覆盖”。方法覆盖又叫‘方法重写’

     当我们代码怎么编写的时候，在代码级别上构成了方法覆盖呢?
            条件一:两个类必须要有继承关系。
            条件二:重写之后的方法和之前的方法具有:
                 相同的返回值类型、
                 相同的方法名、
                 相同的形式参数列表。
            条件三:访问权限不能更低，可以更高。
            条件四:重写之后的方法不能比之前的方法抛出更多的异常，可以更少。|

      注意：
            注意1:方法覆盖只是针对于方法，和属性无关。
            注意2:私有方法无法覆盖。
            注意3:构造方法不能被继承，所以构造方法也不能被覆盖。
            注意4:方法覆盖只嫌针对于实例方法，静态方法覆盖没有意义。

 */
public class Override2 {
    public static void main(String[]args){
        Bird1 b1 = new Bird1();
        b1.move();
        Fish1 f1 = new Fish1();
        f1.move();
    }
}
class Animal1{//Animal1是Bird和Fish的父类，它两个都包含Animal1类中的move（）方法，
    public void move(){
        System.out.println("动物在移动");
    }
}
class Bird1 extends Animal1{
    //因为Bird类是Animal的子类，自身也可以调用父类的move方法，
    //但此处对move方法进行了方法重写，所以把父类的move方法覆盖掉了。
    public void move(){
        System.out.println("鸟儿在飞翔");
    }
}
class Fish1 extends Animal1{
    public void move(){
        System.out.println("鱼儿在游动");
    }
}