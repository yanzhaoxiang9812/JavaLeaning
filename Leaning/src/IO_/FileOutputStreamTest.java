package IO_;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FileOutputStreamTest {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        try {
            //      这样的方式会把该文件清空再写入。如果不存在该文件名的文件，会新建。
            //fos = new FileOutputStream("E:\\JavaLeaning\\Leaning\\src\\IO_\\temp3");
            //      以下方式会再原文件最后追加写入。
            fos = new FileOutputStream("E:\\JavaLeaning\\Leaning\\src\\IO_\\temp3",true);
            //      写入数据。
            fos.write(97);
            //      以数组写入
            byte[] bytes = {98,99,100};
            fos.write(bytes);
            //      写入数组部分
            fos.write(bytes,0,1);
            
            String s = "我是大傻逼";
            byte[] bytes1 = s.getBytes(StandardCharsets.UTF_8);
            fos.write(bytes1);
            //      写完必须刷新
            fos.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
