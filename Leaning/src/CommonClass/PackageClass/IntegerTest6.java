package CommonClass.PackageClass;

public class IntegerTest6 {
    public static void main(String[] args) {
        Integer a = 128;
        Integer b = 128;
        System.out.println(a == b);//false

        Integer x = 127;
        Integer y = 127;
        System.out.println(x == y);//true

        /*
        java中为了提高程序的执行效率，将[-128到127]之间所有的包装对象提前创建好，放
        到了一个方法区的“整数型常量池”当中了，目的是只要用这个区间的数据不需要再new了，
        直接从整数型常量池当中取出来。

         */

    }
}
