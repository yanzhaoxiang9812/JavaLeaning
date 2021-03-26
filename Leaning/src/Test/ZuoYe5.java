package ZuoYe;
/*
在程序中经常要对时间进行操作但是并没有时间类型的数据。那么我们可以自己实现一个时间类来满足程序中的需要。
定义名为MyTime的类其中应有三个整型成员时hour分minute秒secon为了保证数据的安全性这三个成员变量应声明为私有。
为MyTime类定义构造方法以方便创建对象时初始化成员变量。再定义diaplay方法用于将时间信息打印出来。
为MyTime类添加以下方法
addsecond(int sec)
addMinute(int min)
addHour(int hou)
subsecond(int sec)
subMinute(int min)
subHour(int hou)
分别对时、分、秒进行加减运算。

 */
public class ZuoYe5 {
    public static void main(String[] args) {
        MyTime m2 = new MyTime(6,6,6);
        //m2.addHour(4);
        //m2.addminute(4);
        m2.addsecond(6);
        m2.display();
        m2.addsecond(60);
        m2.display();
        m2.addsecond(66);
        m2.display();

    }
}
class MyTime{
    private int hour;
    private int minute;
    private int secon;
    public void display(){
        System.out.println(getHour()+"时" + getMinute() +"分" + getSecon() + "秒");
    }
    public void addHour(int hou){
        setHour(getHour() + hou);
    }
    public void addminute(int minute){
        setMinute(getMinute() + minute);
    }
    public void addsecond(int sec){
        int newSec = this.getSecon() + sec;
        if(newSec < 60){
            this.setSecon(newSec);
        }else if(newSec == 60){
            this.addminute(1);
            this.setSecon(0);
        }else {
            this.addminute(newSec / 60);
            this.setSecon(newSec % 60);
        }
    }
    public void subHour(int hou){
        setHour(getHour() - hou);
    }
    public void subMinute(int min){
        setMinute(getMinute() - min);
    }
    public void subsecond(int sec){
        setSecon(getSecon() - sec);
    }
    public MyTime() {
    }
    public MyTime(int hour, int minute, int secon) {
        this.hour = hour;
        this.minute = minute;
        this.secon = secon;
    }
    public int getHour() {
        return hour;
    }
    public void setHour(int hour) {
        this.hour = hour;
    }
    public int getMinute() {
        return minute;
    }
    public void setMinute(int minute) {
        this.minute = minute;
    }
    public int getSecon() {
        return secon;
    }
    public void setSecon(int secon) {
        this.secon = secon;
    }
}