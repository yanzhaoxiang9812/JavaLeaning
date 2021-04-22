package reflect;

import java.util.Date;

/*
            获取Class实例
                    一:  Class c = Class.forName("完整类名带包名"");
                    二:  CLass c =对象.getClass();
                    三:  Class c =任何类型.cLass;

 */
public class Test2 {
    public static void main(String[] args) throws ClassNotFoundException {
        /*
        获取Class实例方法一：
            CLass.forName()
                1、静态方法
                2、方法的参数是一个字符串。3、字符串需要的是一个完整类名。
                4、完整类名必须带有包名。java.Lang包也不能省略。
         */
        Class c1 = Class.forName("java.lang.String");
        //  则这里c1对象指向了"java.lang.String"字节码文件。可通过c1对象对"java.lang.String"操作。

        /*
        获取Class实例方法二：
            JAVA中任意对象都带有：get.Class()方法。
         */
        String a = "JAVA nb";
        Class c2 = a.getClass();
        System.out.println(c1 == c2);//true
        //  c1指向了"java.lang.String"字节码文件。a是属于String类型的。故c1 c2内存地址是相同的。

        /*
        获取Class实例方法三：
              java语言中任何一种类型，包括基本数据类型，它都有.class属性。
         */
        Class s = String.class;//   s代表String类型
        Class d = Date.class;
        Class i = int.class;//  i代表int类型
        Class b = boolean.class;
    }
}
