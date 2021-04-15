package IO_.print_io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
            编写一个日志文件。
 */
public class MyLogger {
    public static void log(String msg){
        try {
            //  指向一个日志文件
            PrintStream ps = new PrintStream(new FileOutputStream("MyLogger",true));
            //  该边输出方向
            System.setOut(ps);
            //  获取相同当前时间
            Date nowTime = new Date();
            // 设置时间格式
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
            String strTime = sdf.format(nowTime);
            System.out.println(strTime + ":" + msg);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
class Test{
    public static void main(String[] args) {
        MyLogger.log("我又想你了");
        MyLogger.log("想你");
        MyLogger.log("你想我了");
        MyLogger.log("爱你");

    }
}
