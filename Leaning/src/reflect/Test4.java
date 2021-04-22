package reflect;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/*
            验证反射机制灵活性
                通过IO流读取文件，把文件加载到集合中，获取一个可实例化的对象。
                在java源代码不做任何修改基础上，可以实例化不同的对象。

                OCP 原则：对增加开放，对修改关闭。
 */
public class Test4 {
    public static void main(String[] args) {
        //  通过IO流 获取classinfo.properties文件
        FileReader reader = null;
        try {
            reader = new FileReader("E:\\JavaLeaning\\Leaning\\src\\reflect\\classinfo.properties");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        //  创建属性类对象
        Properties properties = new Properties();
        try {
            //  把classinfo.properties文件加载到pro集合中
            properties.load(reader);
        } catch (IOException e) {
            e.printStackTrace();
        }
        //  关闭流
        try {
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //  通过properties中key获取value（获取classinfo.properties文件中得一个类名）
        String className =  properties.getProperty("username");
        //  通过反射机制 实例化对象。
        try {
            Class c = Class.forName(className);
            Object o = c.newInstance();
            System.out.println(o);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }
}
