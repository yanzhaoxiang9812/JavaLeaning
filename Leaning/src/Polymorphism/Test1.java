package Polymorphism;
/*
    多态：多种形态，多种状态。
        多态的基础语法：
               1、学习多态基础语法之前，我们需要普及两个概念:
                    第一个:向上转型(子--->父)
                    第二个:向下转型(父--->子)子类特有的方法才需要向下转型
                    注意:
                        java中允许向上转型，也允许向下转型。
            **********无论是向上转型，还是向下转型，两种类型之间‘必须有继承关系’，没有继承关系编译器会报错。***************
      2、多态指的是:
            父类型引用指向子类型对象。包括编译阶段和运行阶段。编译阶段:绑定父类的方法。
            运行阶段:动态绑定子类型对象的方法-多种形态。


 */
public class Test1 {
    public static void main(String [] args){
        Animal a1 = new Animal();
        a1.move();
        Fish f1 = new Fish();
        f1.move();
        Bird b1 = new Bird();
        b1.move();
        /*  代码可以下面这样写吗？
             Animal a2 = new Fish();
                1、Animal和cat之间有继承关系吗?有的。
                2、Animal是父类，cat是子类。
                3、cat is a Animal，这句话能不能说通?能。
             支持这样的语法：父类型的引用允许指向一个子类型的对象
                a2是一个父类型的引用，允许指向new Fish()子类型的对象。
        */
        Animal a2 = new Fish();//被称为‘向上转型’，子转向父
        Animal a3 = new Bird();
        a2.move();// 输出结果为：   Fish's swmming        ？？？
        a3.move();// 输出结果为：   Bird's flying         ？？？
        /*
            分析a2.move();
                java程序分为编译阶段和运行阶段。
                     编译阶段:
                        对于编译器来说，编译器只知道a2的类型是Animal,
                        所以编译器在检查语法的时候,会去Animal.class字节码文件中找move()方法，找到了，绑定上move()方法
                        ，编译通过，静态绑定成功。(编译阶段属于静态绑定。)
                     运行阶段:
                        运行阶段的时候，实际上在堆内存中创建的java对象是
                        fish对象，所以move的时候，真正参与move的对象是一条鱼，所以运行阶段会动态执行fish对象的move()方法。
                        这个过程属于运行阶段绑定。(运行阶段绑定属于动态绑定。>
        多态表示多种形态:
            编译的时候一种形态。
            运行的时候另一种形态。

         */
//========================================================================================================
        Animal a5 = new Fish();//底层对象是一条鱼
        //  a5.fishScales();    这条语句不能通过编译
        //在编译阶段编译器知道a5的类型是Animal，并没有在Animal类中找到fishScales()方法。

        /*  那么怎么调用fishScales()方法？
                那么就必须使用“向下转型”
         */
        Fish f2 = (Fish)a5;
        f2.fishScales();//   输出：Fish have scales
//=====================================================
        //下面的代码可以通过编译，但再运行阶段出现错误
        /*Animal a6 = new Bird();
        Fish f3 = (Fish)a6;
        f3.fishScales(); */
        /* 输出结果出现错误如下：
            Exception in thread "main" java.lang.ClassCastException: Polymorphism.Bird cannot be cast to Polymorphism.Fish
	        at Polymorphism.Test1.main(Test1.java:65)*/
        /*怎么避免ClassCastException错误的发生呢？
            *instanceof*
                第一: instanceof可以在运行阶段动态判断引用指向的对象的类型.
                第二: instanceof的语法:
                        (引用 instanceof 类型)
                第三: instanceof运算符的运算结果只能是: true/false
                第四:f是一个引用，f变量保存了内存地址指向了堆中的对象。
                假设（f instanceof fish)为true表示:
                    f引用指向的堆内存中的Java对象是一个Fish
                假设(f instanceof fish)为false表示:
                    f引用指向的堆内存中的Java对象是不一个Fish
                    *
                    程序员要养成一个好习惯:
                            任何时候，任何地点，对类型进行向下转型时，
                            一定要使用instanceof运算符进行判断。
                            这样可以很好的避免:classCastException
         */
        Animal a6 = new Bird();
        System.out.println(a6 instanceof Fish);
        //  输出结果为：false，则a6并不是一个Fish类型的对象
        if(a6 instanceof Fish){//如果是a6是一条鱼
            Fish f3 = (Fish)a6;//再进行强制类型转换
            f3.fishScales();
        }

    }
}
