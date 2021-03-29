package Object;
/*
            toString方法：
                tostring方法返回一个字符串，“以文本方式表示”这个对象。

          其实SUN公司开发java语言的时候，建议所有的子类都去重写toString()方法。
          toString()方法应该是一个简洁的、详实的、易阅读的.

 */
 public class toString {
    public static void main(String[] args) {
        Time1 t1 = new Time1(1998,12,12);
        //未重写toString方法
        System.out.println(t1);
        //输出：toString.Time@1b6d3586

        //重写后
        System.out.println(t1);
        //输出：1998/12/12


    }
}
class Time1{
    private int year,month,day;

    public Time1(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    //重写toString方法

    public String toString(){
        return this.year + "/" + this.month + "/" +this.day;
    }

}
