package CommonClass.StringClass;

/*
关于Java JDK中内置的一个类:java.Lang .String
        1、String表示字符串类型，属于引用数据类型，不属于基本数据类型。
        2、在java中随便使用双引号括起来的都是string对象。例如 : "abc ", " def", "heLLo world!"，这是3个String对象。
        3、java中规定，双引号括起来的字符串，是不可变的，也就是说"abc"自出生到最终死亡，不可变，不能变成""abcd"，也不能变成"ab"
        4、在JDK当中双引号括起来的字符串，例如: "abc""def"都是直接存储在方法区'的"字符串常量池"当中的。因为字符串在实际的开发中
          使用太频繁。为了执行效率，所以把字符串放到了方法区的字符串常量池当中。
*/

public class StringClass {
    public static void main(String[] args) {

        String string = "java";
        System.out.println(string);
        //String类已经重写了toString方法，不再输出对象的内存地址

        String s = "yzx";
        //s保存的不是"yzx",而是"yzx"字符串对象的内存地址。

        s = "ym";
        //字符串不可变是指双引号里面的内容不可变，但是s是一个引用，该引用指向的字符串对象是可以改变的。


        String s1 = "abc";
        String s2 = "abc";
        System.out.println(s1 == s2);
        //输出为：true.
        //"abc"在方法区的字符串常量池中，并没有新建"abc"对象，s1,s2指向的都是"abc"字符串对象的内存地址，
        //"abc"字符串对象的内存地址是相同的，故s1==s2.

        String s3 = new String("edf");
        String s4 = new String("edf");
        System.out.println(s3 == s4);
        //输出为：false
        //因为这里的new了s3 s4并在推内存中创建了对象，这两个对象在推内存中指向方法区的字符串常量池的
        //“edf”,虽然这两个对象的内存地址是相同的，但是两个对象的引用内存地址在栈中是不同的，故输出false。

        // ***故比较字符串应该用equlas方法***
        System.out.println(s3.equals(s4));
        //输出：true
        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s3));


        String s5 = new String("a");
        String s6 = new String("a");
        /*这里创建了3个对象：
                方法区字符串常量池中一个"a"
                堆内存中两个String对象。
         */

        //####关于String类的构造方法####
        /*
         *关于String类中的构造方法。[
         *第一个:String s = new String("");
         *第二个:String s = "";最常用
         *第三个:String s = new String(char数组);
         *第四个;String s = new String(char数组,起始下标,长度);
         *第五个:String s = new String(byte数组);
         *第大个:String s = new String(byte数组,起始下标,长度)
         */


        byte[] bytes = {97, 98, 99};
        String s7 = new String(bytes);
        System.out.println(s7);//输出了:abc

        //String(字节数组，数组元素起始下标，长度)
        String s8 = new String(bytes, 1, 2);
        System.out.println(s8);//bc

        char[] chars = {'我', '是', '中', '国', '人'};
        String s9 = new String(chars);
        System.out.println(s9);//我是中国人
        String s10 = new String(chars, 2, 3);
        System.out.println(s10);//中国人



    }
}