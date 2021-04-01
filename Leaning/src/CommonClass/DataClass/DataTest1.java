package CommonClass.DataClass;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DataTest1 {
    public static void main(String[] args) throws ParseException {
        //获取系统当前时间（精确到毫秒的系统当前时间)（这个Data必须是util包的Data类）
        //直接调用无参数构造方法就行。
        Date date = new Date();
        System.out.println(date);//输出系统当前日期

        //日期格式化
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        System.out.println(simpleDateFormat.format(date));

        //日期字符串转换为Data
        String time = "2008-08-08 08:08:08 888";
        //SimpleDateFormat sdf2 = new SimpleDateFormat("格式不能随便写，要和日期字符串格式相同");
        //注意∶字符串的日期格式和SimpLeDateformat对象指定的日期格式要一致。不然会出现异常: java.text.ParseException

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        Date date1 = sdf.parse(time);
        System.out.println(date1);//Fri Aug 08 08:08:08 CST 2008
    }
}
