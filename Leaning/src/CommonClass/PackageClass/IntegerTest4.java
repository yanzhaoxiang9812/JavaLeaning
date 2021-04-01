package CommonClass.PackageClass;

public class IntegerTest4 {
    public static void main(String[] args) {
        //通过访问包装类的常量，来获取最大值和最小值
        System.out.println("byte的最大值:" + Byte.MAX_VALUE);
        System.out.println("byte的最小值:"+ Byte.MIN_VALUE);
        System.out.println("short的最大值:" + Short.MAX_VALUE);
        System.out.println("short的最小值:"+ Short.MIN_VALUE);
        System.out.println("int的最大值:" + Integer.MAX_VALUE);
        System.out.println("int的最小值:" + Integer.MIN_VALUE);
        System.out.println("Long的最大值:" +Long.MAX_VALUE);
        System.out.println("long的最小值:"+ Long.MIN_VALUE);
        System.out.println("float的最大值:" +Float.MAX_VALUE);
        System.out.println("float的最小值:"+ Float.MIN_VALUE);
        System.out.println("double的最大值:" +Double.MAX_VALUE);
        System.out.println("double的最小值:"+ Double.MIN_VALUE);
        /*
        byte的最大值:127
        byte的最小值:-128
        short的最大值:32767
        short的最小值:-32768
        int的最大值:2147483647
        int的最小值:-2147483648
        Long的最大值:9223372036854775807
        long的最小值:-9223372036854775808
        float的最大值:3.4028235E38
        float的最小值:1.4E-45
        double的最大值:1.7976931348623157E308
        double的最小值:4.9E-324
         */
    }
}
