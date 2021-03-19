package FengZhuang;
/*
        带有static访问
        没有static访问
            分别怎么调用？

 */
public class Static {
    public static void main(String[]args){
        //调用带有static的方法
        //类名.方法名
        Static.doSome1();

        //调用没有static的方法
        //引用.方法名
        //必须先执行下行代码才能的调用没有static的方法
        Static s = new Static();
        s.doSome2();


    }
    public static void doSome1(){//带有static
        System.out.println("doSome1");
    }
    public void doSome2(){//没有static.这个方法被称为‘实例方法’（对象方法）
        //实例变量=对象变量；实例方法=对象方法，实例相关都必须通过new访问
        System.out.println("doSome2");
    }
}
