package IO_.file_io;

import java.io.FileWriter;
import java.io.IOException;

/*
        FileWriter:
            文件字符输出流，写
            只能输出普通文本
 */
public class FileWriterTest {
    public static void main(String[] args) {
        FileWriter fw = null;
        try {
            fw = new FileWriter("E:\\JavaLeaning\\Leaning\\src\\IO_\\temp4",true);
            char[] chars ={'J','A','V','A'};
            fw.write(chars);
            fw.write("\n");//   写入换行符
            fw.write(chars,0,2);
            fw.write("\n");
            //      可以直接写入String类型。
            fw.write("我是闫兆祥");
            fw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (fw != null){
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
