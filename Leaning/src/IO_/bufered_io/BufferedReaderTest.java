package IO_.bufered_io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
    BufferedReader:
        带有缓冲区的字符输入流，该流不需要自定义char数组或byte数组，该流自带缓冲。
 */
public class BufferedReaderTest {
    public static void main(String[] args)  {
        FileReader fr = null;
        try {
            fr = new FileReader("E:\\JavaLeaning\\Leaning\\src\\IO_\\temp_file\\temp");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        BufferedReader br = new BufferedReader(fr);
        //     该流构造方法需传入一个Reader。
        /*  当一个流的构造方法中需要一个流的时候，这个被传入的流被称为：节点流
            外部负责包装的流被称为：包装流。或处理流。

            则 这里的BufferedReader是包装流，FileReader是节点流

         */
        /*      .readLine(),读一行     */
        /*
        String first = br.readLine();//    读第一行
        System.out.println(first);
        String second = br.readLine();//    读第二行
        System.out.println(second);
         */

        //      读出所有行。
        String s = null;
        while (true){
            try {
                if (!((s = br.readLine()) != null)) break;
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println(s);
        }
        try {
            br.close();//    包装流关闭只需要关闭最外部流。
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
