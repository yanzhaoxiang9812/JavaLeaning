package CommonClass.PackageClass;

/*
1、java中为8种基本数据类型又对应准备了8种包装类型。8种包装类属于引用数据类型，父类是Object。
-------------------------------------------------------------
        基本数据类型          包装类型
        byte                java.Lang.Byte (父类Number)
        short               java.Lang.Short (父类Number)
        int                 java.Lang.Integer (父类Number)
        long                java.Lang.Long (父类Number)
        float               java.Lang.FLoat (父类Number)
        double              java.Lang.Double (父类Number)
        boolean             java.Lang.BooLean (父类object)
        char                java.Lang.Character (父类object)
-------------------------------------------------------------


 */

public class IntegerTest1 {
    public static void main(String[] args) {
        //有没有这种需求:调用doSome()方法的时候需要传一个数字进去。
        //但是数字属于基本数据类型，而doSome()方法参数的类型是object。
        //可见doSome()方法无法接收基本数据类型的数字。那怎么办呢﹖可以传一个数字对应的包装类进去。
        MyInt myInt = new MyInt(100);
        //doSome()方法虽然不能值接传100，但是可以传一个100对应的包装类型。
        doSome(myInt);//100
    }
    public static void doSome(Object obj) {
        System.out.println(obj);
    }


}
class MyInt{
    int i;
    public MyInt(int i) {
        this.i = i;
    }
    @Override
    public String toString() {
        return String.valueOf(i);
    }
}
