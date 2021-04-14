package IO_.switch_io;

import java.io.*;
/*
        转换流：
            InputStreamReader
            OutputStreamWriter
            把字节流转换为字符流。
 */
public class InputStreamReaderTest {
    public static void main(String[] args) {
        try {
            //  下列代码是一个字节流
            FileInputStream fis = new FileInputStream("E:\\JavaLeaning\\Leaning\\src\\IO_\\temp_file\\temp");
            //      通过转换流，把字节流转换为字符流
            InputStreamReader isr = new InputStreamReader(fis);//   传入需要转换的流
            BufferedReader br = new BufferedReader(isr);
            //  这个构造方法只能传入字符流，不能传入字节流。

            /*
                这里的fis相对与isr是节点流，isr相对于br是节点流
             */
            //      关闭最外层流
            String s = null;
            while ((s = br.readLine()) != null){
                System.out.println(s);
            }
            br.close();
            //      流的创建也可以这样写！！！
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(
                    new FileInputStream("E:\\JavaLeaning\\Leaning\\src\\IO_\\temp_file\\temp")));
            String s1 = null;
            while ((s1 = bufferedReader.readLine()) != null){
                System.out.println(s1);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
