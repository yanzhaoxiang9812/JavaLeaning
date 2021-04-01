package CommonClass.PackageClass;

/*
八种包装类中其中6个都是数字对应的包装类，他们的父类都是Number，可以先研究一下Number中公共的方法;Number是一个抽象类，无法实例化对象。
    Number类中有这样的方法:
        byte byteValue()以 byte形式返回指定的数值。
        abstract double doubleValue()    以double形式返回指定的数值。
        abstract float fLoatValue()      以fLoat形式返回指定的数值。
        abstract int intValue()          以int形式返回指定的数值。
        abstract Long longValue()        以long形式返回指定的数值。
        short shortValue()               以short形式返回指定的数值。
        ****这些方法其实所有的数字包装类的子类都有，这些方法是负责拆箱的****


 */

public class IntegerTest2 {
    public static void main(String[] args) {
        //123这个基本数据类型，进行构造方法的包装达到了︰基本数据类型向引用数据类型的转换。
        /*基本数据类型-(转换为)->引用数据类型（装箱)*/
        Integer i = new Integer(123);

        //将引用数据类型--(转换为)-〉基本数据类型
        /*基本数据类型-(转换为)->引用数据类型（装箱)*/
        float f = i.floatValue();
        System.out.println(f);//123.0

        int i1 = i.intValue();
        System.out.println(i1);//123

    }
}
