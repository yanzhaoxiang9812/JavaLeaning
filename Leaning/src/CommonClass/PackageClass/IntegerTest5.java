package CommonClass.PackageClass;
/*
在java5之后，引入了一种新特性，自动装箱和自动拆箱
        自动装箱:基本数据类型自动转换成包装类。
        自动拆箱︰包装类自动转换成基本数据类型。
有了自动拆箱之后，Number类中的方法就用不着了.

 */
public class IntegerTest5 {
    public static void main(String[] args) {
        //自动装箱
        // int类型-自动转换为-> Integer
        Integer x = 100;//等同与Integer x = new Interge(100);

        //自动拆箱
        //Integer类型-自动转换为-> int
        int y = x;

        Integer z = 999;//等同与Integer z = new Interge(999);
        System.out.println(z + 1);//1000
        //自动把z转换为int类型

        Integer a = 1000;//等同与Integer a = new Interge(1000);
        Integer b = 1000;//等同与Integer b = new Interge(1000);
        System.out.println(a == b);//false
        //a,b是一个引用.a,b还是保存了一个对象的内存地址。
        //  故：“==” 不会触发自动拆箱机制。(只有+-*/等运算的时候才会)
    }
}
