package CommonClass;
//String int Integer之间互相转换
public class Integer_int_String {
    public static void main(String[] args) {

        //String --> int
        int i1 = Integer.parseInt( "100");// i1是100数字
        System.out.println(i1 + 1); // 101

        // int --> String
        String s2 = i1 + "";// "100"字符串
        System.out.println(s2 + 1); // "1001"

        // String --> Integer
        Integer k = Integer.valueOf("123");
        // Integer --> String
        String e = String.valueOf(k);

        // int --> Integer
        //自动装箱
        Integer x = 1000;
        // Integer --> int
        // 自动拆箱
        int y = x;

    }
}
