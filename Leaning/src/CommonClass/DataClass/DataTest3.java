package CommonClass.DataClass;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DataTest3 {
    public static void main(String[] args) {
        Date time = new Date(1);//参数为毫秒数。
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        System.out.println(simpleDateFormat.format(time));
        //1970-01-01 08:00:00 001(北京时间差8小时)

        //获取昨天才此时的时间
        Date time1 = new Date(System.currentTimeMillis() - 1000 * 60 * 60 * 24);
        System.out.println(simpleDateFormat.format(time1));
    }
}
