package CommonClass.PackageClass;

/*
                Integer的构造方法
                    Integer(int)
                    Integer(String)

 */
public class IntegerTest3 {
    public static void main(String[] args) {
        Integer x = new Integer(100);
        Integer y = new Integer("123");
        System.out.println(x + "\n" + y);//100      123

        Double d = new Double(3.14);
        Double e = new Double("6.66");
        System.out.println(d + "\n" + e);//3.14     6.66
    }
}
