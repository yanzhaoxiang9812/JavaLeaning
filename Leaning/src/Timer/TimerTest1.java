package Timer;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/*
                定时器
 */
public class TimerTest1 {
    public static void main(String[] args) throws ParseException {
        //  创建定时器对象
        Timer timer = new Timer();
        //  Timer timer =new Timer(true); 守护线程方式。

        //  获取时间并设置时间格式
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date firstTime = simpleDateFormat.parse("2021-04-18 14:00:00");

        //  指定定时任务
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String strTime = simpleDateFormat.format(new Date());
                System.out.println(strTime + "完成了");
            }
        }, firstTime, 1000 * 10);
        //  定时任务为抽象类TimerTask类的run方法，第一次操作时间为firsttime，每十秒操作一次
    }
}
