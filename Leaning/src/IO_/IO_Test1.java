package IO_;
/*
            IO：输入输出
                Input输入   Output输出

 流的分类：
    按照方向分类：
        往内存中去，叫做输入/读（Input/Reader）
        从内存中出，叫做输出/写（Output/Writer）
    按照读取数据方式分类：
        字节流：
            按字节读取，一次读取一个字节包括任何类型的文件。
        字符流：
            按字符读取，一次读取一个字符，仅支持普通文本文件。

    JAVA四大抽象类：
        java.io.InputStream         字节输入流
        java.io.OutputStream        字节输出流
        java.io.Reader              字符输入流
        java.io.Writer              字符输出流
            这四个抽象类都实现了java.io.Closeable接口，都是可关闭的。
            所有‘输出流‘都实现了java.io.Flushable接口，都有flush()方法。作用为刷新。
        *类名以Stream结尾为字节流，以Reader/Writer结尾为字符流*

                ***流在使用完毕后切记关闭***


文件专属:
            java.io.FileInputstream
            java.io.Fileoutputstream
            java.io.FileReader
            java.io.FileWriter
转换流:（将字节流转换成字符流)
            java.io.InputstreanReader
            java.io.outputstreanwrite
缓冲流专属:
            java.io.BufferedReader
            java.io.Bufferedwriter
            java.io.BufferedInputstream
            java.io.Bufferedoutputstream
数据流专属:
            java.io.DataInputstream
            java.io.Dataoutputstream
标准输出流:
            java.io.Printwriter
            java.io.Printstream
对象专属流:
            java.io.objectInputstream
            java.io.0bjectoutputstream

 */
public class IO_Test1 {
    public static void main(String[] args) {

    }
}
