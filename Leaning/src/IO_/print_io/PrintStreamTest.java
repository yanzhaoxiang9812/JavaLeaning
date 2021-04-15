package IO_.print_io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

/*
    PrintStream:标准字节输出流，默认输出至控制台。

 */
public class PrintStreamTest {
    public static void main(String[] args) {
        //      默认输出至控制台
        System.out.println("JAVA nb");//    集合写
        //      分开写
        PrintStream ps = System.out;
        ps.println("wow");
        //      标准输出流不需要close()关闭。
        //      改变标准输出流方向,指向temp6
        try {
            PrintStream ps2 = new PrintStream(new FileOutputStream("E:\\JavaLeaning\\Leaning\\src\\IO_\\temp_file\\temp6"));
            System.setOut(ps2);
            System.out.println("JAVA");
            System.out.println("NB");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
