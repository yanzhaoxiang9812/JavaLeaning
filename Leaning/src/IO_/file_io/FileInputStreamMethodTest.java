package IO_.file_io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
        FileInputStream类的常用方法
            int available()         返回流当中剩余的没有读到的字节数量
            Long skip(Long n)       跳过几个字节不读。

 */
public class FileInputStreamMethodTest {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("E:\\JavaLeaning\\Leaning\\src\\IO_\\temp2");

            //  fis.available()方法
            System.out.println("还剩多少字节没有读："  + fis.available());
            //  还剩多少字节没有读：90

            //  读一个字节
            int i = fis.read();
            System.out.println("还剩多少字节没有读："  + fis.available());
            //  还剩多少字节没有读：89

            //      available()方法的实际作用
            byte[] bytes = new byte[fis.available()];
            //      不用循环，直接读一次。
            int readCount = fis.read(bytes);
            System.out.println(new String(bytes));

            //      Long skip(Long n)       跳过几个字节不读。
            fis.skip(4);
            System.out.println(fis.read());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }
}
