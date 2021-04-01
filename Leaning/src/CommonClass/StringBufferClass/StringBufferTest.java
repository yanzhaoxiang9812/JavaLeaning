package CommonClass.StringBufferClass;

/*
因为java中的字符串是不可变的，每一次拼接都会产生新字符串。这样会占用大量的方法区内存。造成内存空间的浪费。
    String s = "abc";
    s += "helLo";
    就以上两行代码，就导致在方法区字符串常量池当中创建了3个对象:I
        "abc"   "hello" "abchelLo"

     故引出了StringBuffre类，和StringBuilder该类可以对字符串进行拼接操作。
        StringBuffer底层实际上是一个byte[]数组;
        往StringBuffer中放字符串，实际上是放到byte数组当中了。
        StringBuffer的初始化容量是16.




 */

public class StringBufferTest {
    public static void main(String[] args) {
        ////创建一个初始化容量为16个byte[] 数组。(字符串缓冲区对象)
        StringBuffer stringBuffer = new StringBuffer("666");
        stringBuffer.append("a");
        stringBuffer.append("b");
        stringBuffer.append("c");
        stringBuffer.append("d");
        System.out.println(stringBuffer);//666abcd

        stringBuffer.append(100);
        stringBuffer.append(3.13);
        stringBuffer.append(true);
        stringBuffer.append(100l);
        System.out.println(stringBuffer);//666abcd1003.13true100
        //append方法底层在进行追加的时候，如果byte数组满了，会自动扩容。（数组拷贝）

        //指定初始化容量的SstringBuffer对象（字符串缓冲区对象)
        StringBuffer stringBuffer1 = new StringBuffer(100);
        stringBuffer1.append("abc");
        stringBuffer1.append("ddd");
        stringBuffer1.append("fff");
        stringBuffer1.append("ggg");
        stringBuffer1.append(666);
        System.out.println(stringBuffer1);//abcdddfffggg666




    }

}
