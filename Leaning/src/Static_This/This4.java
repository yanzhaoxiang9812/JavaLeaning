package Static_This;
/*
        this();的用法
    this可以应用实例方法中 也可以应用在构造方法中
        新语法:通过当前的构造方法去调用另一个本类的构造方法，
        可以使用以下语法格式:this(实际参数列表);
        通过一个构造方法A去调用构造方法B，可以做到代码复用。构造方法A和构造方法B必须在同一个类中
        this()这个语法作用是什么?
            代码复用。
      注意：对this语句的调用必须是构造方法的首行且仅能出现一次
 */
public class This4 {
    public static void main(String[]args){
            Date d1 = new Date();
            d1.print();
            Date d2 = new Date(2000,6,6);
            d2.print();
    }
}
/*
        1、定义一个日期类,可以表示年月日信息。
        2、需求:
        如果调用无参数构造方法，默认创建的日期为:1970年1月1日.
        当然，除了调用无参数构造方法之外，也可以调用有参数的构造方法来创建日期对象。
*/
class Date{
    private int year;
    private int month;
    private int day;
    public Date(){
        /*  this.year = 1970;
            this.month = 1;
            this.day = 1;
        以上代码繁杂且重复，可以改为一下代码 */
        this(1970,1,1);
    }
    public Date(int year,int month,int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }
    public void print(){
        System.out.println(getYear()+"年"+getMonth()+"月"+getDay()+"日");
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public int getMonth() {
        return month;
    }
    public void setMonth(int month) {
        this.month = month;
    }
    public int getDay() {
        return day;
    }
    public void setDay(int day) {
        this.day = day;
    }
}