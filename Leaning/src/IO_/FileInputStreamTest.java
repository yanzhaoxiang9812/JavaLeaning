package IO_;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;


/*
        FileInputStream字节输入流，任何类型文件都可以输入。

 */
public class FileInputStreamTest {
    public static void main(String[] args) {
        FileInputStream fis = null;
        //    创建文件字节输入流对象
        try {
            fis = new FileInputStream("E:\\JavaLeaning\\Leaning\\src\\IO_\\temp1");
            //      读  .read()。每次读取一个字节，读不到则返回-1.
            /*
            System.out.println(fis.read());//   49
            System.out.println(fis.read());//   50
            System.out.println(fis.read());//   51
            System.out.println(fis.read());//   -1
             */

            //  可以是用这样的方式读。
            /*
            int temp = 0;
            while ((temp = fis.read()) != -1){
                System.out.println(temp);//     49,50,51
            }
             */

            //      往byte数组中读。一次最多读数组的长度个字节。
            byte[] bytes = new byte[3];
            int temp = 0 ;
            while ((temp = fis.read(bytes)) != -1){
                //      把byte数组转换成字符串
                System.out.print(new String(bytes,0,temp));
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }//     在finally语句块中确保流一定关闭。
        catch (IOException e) {
            e.printStackTrace();
        } finally {
                //      如果流不为空，则关闭流。
                if (fis != null){
                    try {
                        fis.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
        }
    }
}
