package IO_.file_io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
/*
        拷贝文件原理：
            一边读，一边把读到的内容写去入到新文件中。
 */
public class FileCopyTest {
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream("D:\\QQ缓存\\963614893\\FileRecv\\MobileFile\\good.mp4");
            fos = new FileOutputStream("E:\\JavaLeaning\\Leaning\\src\\IO_\\good.mp4");
            //  创建一个byte数组
            byte[] bytes = new byte[1024 * 1024];//     一次最多读写1mb
            int readCount = 0;
            while ((readCount = fis.read(bytes)) != -1){
                fos.write(bytes,0,readCount);
            }
            fos.flush();//  刷新
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
