package CommonClass.PackageClass;

/*
                Integer的常用方法
 */

import java.util.Scanner;

public class IntegerTest7 {
    public static void main(String[] args) {
        //手动装箱
        Integer x = new Integer(1000);
        Integer x1 = new Integer("123");
        //手动拆箱
        int y = x.intValue();
        System.out.println(y);//1000
        int y1 = x1.intValue();
        System.out.println(y1);//123

        //Integer a = new Integer("中文");//编译可以通过。但运行出现异常
        //System.out.println(a);//NumberFormatException


        //static int parseInt(String s)
        //静态方法，传参string ，返回int
         int retValue1 = Integer.parseInt("123");
        System.out.println(retValue1 + 100);//223

        double retValue2 = Double.parseDouble(  "3.14");
        System.out.println(retValue2 + 1);//4.140000000000001（精度问题)
        float retValue3 = Float.parseFloat("1.0");
        System.out.println(retValue3 + 1); //2.0


    }
}
