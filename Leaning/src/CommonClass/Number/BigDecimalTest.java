package CommonClass.Number;

import java.math.BigDecimal;

/*
            超高精度BigDecimal 属于大数据，精度极高。
            不属于基本数据类型，属于java对象（引用数据类型)

 */
public class BigDecimalTest {
    public static void main(String[] args) {
        BigDecimal bigDecimal = new BigDecimal(100);//精度极高的100
        BigDecimal bigDecimal1 = new BigDecimal(200);

        //bigDecimal + bigDecimal1
        System.out.println(bigDecimal.add(bigDecimal1));
    }
}
