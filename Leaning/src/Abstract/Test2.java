package Abstract;
/*
        抽象方法：抽象方法表示没有实现的方法，没有方法体的方法。
               ex： public abstract void doSome();
            抽象方法特点是:
                    特点1:没有方法体，以分号结尾。
                    特点2:前面修饰符列表中有abstract关键字。

 */
public class Test2 {
    public static void main(String[] args) {

    }
}
abstract class MyClass{
    //抽象类中不一定有抽象方法，但抽象方法必须存在与抽象类中。
    public abstract void doSome();
    public void doOther(){}
}
class Class extends MyClass{
    //如果本类继承了一个抽象类，并且该抽象类存在抽象方法，则在本类中必须对其抽象方法重写。
    @Override
    public void doSome() {
    }
}
