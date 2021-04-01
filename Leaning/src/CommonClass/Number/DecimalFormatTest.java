package CommonClass.Number;

import java.text.DecimalFormat;

//          关于数字的格式化DecimalFormat
public class DecimalFormatTest {
    public static void main(String[] args) {
        /*
                数字格式
                    #   代表任意数字
                    ,   代表千分位
                    .   代表小数点
                    0   代表不够补0
         */
        java.text.DecimalFormat decimalFormat = new java.text.DecimalFormat("###,###.##");//参数为数字格式。
        //"###,##.##"表示加入千分位，保留两位小数。
        System.out.println(decimalFormat.format(12345.666));//12,345.67

        java.text.DecimalFormat decimalFormat1 = new java.text.DecimalFormat("###,###.0000");
        System.out.println(decimalFormat1.format(12345.666));//12,345.6660
    }
}
