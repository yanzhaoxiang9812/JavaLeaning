package CommonClass.StringClass;

public class StringMethod {
    public static void main(String[] args) {
        /*   String类的常用方法   */

        // 1.   char charAt(int index)
        //返回一个指定字符串指定位置的字符。
        char c = "中国人".charAt(1);
        System.out.println(c);//国

        //2.    int compareTo(String anotherString)
        //返回一个int，比较两个字符串大小，如果完全相同返回1，前小后大输出大于0的正整数，反之返回小于0的正整数。
        System.out.println("abc".compareTo("abc"));//0
        System.out.println("abc".compareTo("abcd"));//-1
        System.out.println("abc".compareTo("ab"));//1

        //3.    .boolean contains(CharSequence s)
        //判断前面的字符串中是否包含后面的子字符串。
        System.out.println("java".contains("va"));//true

        //4.    boolean endswith(String suffix)
        // 判断当前字符串是否以某个字符串结尾。
        System.out.println("yzx666".endsWith("666"));//true

        // 5    .boolean equals(object anObject)
        // 比较两个字符串必须使用equals方法，不能使用==”
        System.out.println("abe".equals("abe")); // true

        // 6    .boolean equalsIgnoreCase(String anotherString)
        // 判断两个字符串是否相等，并且同时忽略大小写。
        System.out.println("ABc".equals("abc")); //true

        // 7 .byte[] getBytes()//将字符串对象转换成字节数组
        byte[] bytes1 = "abcdef".getBytes();
        for (int i = 0; i < bytes1.length; i++) {
            System.out.println(bytes1[i]);
        }//97   98   99 100 101 102

        //8      .int indexOf (String str)
        //判断某个子字符串在当前字符串中第一次出现处的索引。
        System.out.println("zhongguorenniub".indexOf("n"));//3

        //9     .boolean isEmpty()//判断某个字符串是否为空。
        String s11 = "";
        String s12 = "a";
        System.out.println(s11.isEmpty() + "\n" + s12.isEmpty()); //ture    false

        // 10    . int length()
        //判断数组长度和判断字符串长度不一样
        //判断数组长度是Length属性，判断字符串长度是Lenh()方法。
        System.out.println("abc".length());// 3

        // 11   .int lastIndexOf(String str)
        //判断某个子字符串在当前字符串中最后一次出现的索引（下标)
        System.out.println("oraclejavac++javac#phpjavapython".lastIndexOf("java"));//22

        //12    . String replace(CharSequence target，CharSequence replacement)
        // String的父接口就是:CharSequence
        String newString = "http://www.baidu.com".replace("http://", "https://");
        System.out.println(newString);//https://www.baidu.com

        //13     .String[ ] split(String regex)
        // 拆分字符串
        String[] ymd = "1980-10-11".split("-");
        //将"1998-12-12"以"-"分隔符进行拆分。
        for (int i = 0; i < ymd.length; i++) {
            System.out.println(ymd[i]);
        }//1998     12      12

        //14    .boolean startswith(String prefix)//判断某个字符串是否以某个子字符串开始。
        System.out.println("http://www.baidu.com".startsWith("http")); //ture
        System.out.println("http://www.baidu.com".startsWith("https")); // false

        //15   .String substring(int beginIndex)//截取字符串
        System.out.println("http://www.baidu.com".substring(7)); //www.baidu.com

        //16   .String substring(int beginIndex， int endIndex)
        System.out.println("http://www.baidu.com" .substring(7,10));//www

        //17   char[ ] toCharArray( )
        // 将字符串转换成char数组
        char[] chars1 = "我是中国人".toCharArray();
        for (int i = 0 ; i < chars1.length; i++){
            System.out.println(chars1[i]);
        }//我    是   中   国   人

        // 18   String toLowerCase()
        // 转换为小写。
        System.out.println("ABCDefKXyz".toLowerCase());//abcdefkxyz

        //19    String toUppercase();
        System.out.println("ABCDefKXyz".toUpperCase());//ABCDEFKXYZ

        //20    .string trim( );
        // 去除字符串前后空白
        System.out.println("      hello             world     ".trim());//hello             world

        //21    . string中只有一个方法是静态的，不需要new对象
        // 这个方法叫做vaLueOf
        //作用:将非字符串转换成字符串
        String s13 = String.valueOf(true);
        System.out.println(s13);//true（这里的true是字符串）


    }
}
