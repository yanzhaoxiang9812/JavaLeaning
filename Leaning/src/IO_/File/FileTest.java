package IO_.File;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
        File类与四个主要流无关，不是一个流类。
            File表示文件和目录名的抽象表达方式。
                C:\Program Files\Android    这是一个File对象
                D:\EA   这也是一个File对象。
 */
public class FileTest {
    public static void main(String[] args) {
        File f1 = new File("E:\\JavaLeaning\\file");
        //  exists()判断是否存在。
        System.out.println(f1.exists());//  false

        if (!f1.exists()){
            try {
                //      createNewFile()以文件的形式 新建。
                f1.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        /*
        if (!f1.exists()){
            //  mkdir()以目录形式新建。
            f1.mkdir();
        }
         */

        File f2 = new File("E:\\JavaLeaning\\a\\b\\c\\d");
        if (!f2.exists()){
            //  创建的多层目录
            f2.mkdirs();
        }
        //  获取父路径getParent()
        System.out.println(f2.getParent());//E:\JavaLeaning\a\b\c
        File parentFile = f2.getParentFile();
        System.out.println("获取绝对路径：" + parentFile.getParentFile());//获取绝对路径：E:\JavaLeaning\a\b

        File f3 = new File("E:\\JavaLeaning\\a\\b\\c\\d\\e");
        //  获取文件名getName()
        System.out.println(f3.getName());
        //  判断是否为目录isDirectory()
        System.out.println(f3.isDirectory());// false
        //  判断是否为文件isFile()
        System.out.println(f3.isFile());//true

        //  获取文件最后修改时间lastModified()（返回一个long类型的数据毫秒。）
        long l = f3.lastModified();
        Date date = new Date(l);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        String s = sdf.format(date);
        System.out.println(s);

        //  获取文件大小length()
        System.out.println(f3.length());

        //      获取当前目录下所有的子文件。listFiles()返回一个File数组。
        File[] files = f2.listFiles();
        for (File file : files){
            System.out.println(file.getAbsolutePath());
            System.out.println(file.getName());
        }


    }
}
