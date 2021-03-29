package Object;

import java.sql.Time;
import java.util.Objects;

/*
        关于object类中的equals方法
        1、equals方法的源代码
            public boolean equals (Object obj) {
                 return (this == obj);}
            以上这个方法是object类的默认实现。
        2、equals方法的目的是什么?
            编程的过程当中，要通过equals方法来判断两个对象是否相等。
            equals方法是判断两个对象是否相等的。
        3、我们需要研究一下object类给的这个默认的equals方法够不够用!! ! !
            在object类中的equals方法当中，默认采用的是"=="判断两个java对象是否相等。
            而"=-=n判断的是两个java对象的内存地址，我们应该判断两个java对象的内容是否
            相等。所以老祖宗的equals方法不够用，需要子类重写equals.
        4、判断两个java对象是否相等，不能使用"==n，因为"==比较的是两个对象的内存地址。


 */
public class Equals {
    public static void main(String[] args) {
        //判断两个基本数据类型是否相等，直接使用“ == ”
        int a = 6;
        int b = 6;
        System.out.println(a == b);

        //那么判断两个对象呢？
        Time2 t1 = new Time2(2000,1,1);
        Time2 t2 = new Time2(2000,1,1);
        System.out.println(t1 == t2);//这样可以吗？？？？
        //输出false
        //这里的 “ == ”实际上是判断了t1和t2的内存地址是否相等。
        //故“ == ”不能用来判断对象是否相等。

        boolean b1  = t1.equals(t2);
        System.out.println(b1);
        //结果仍是false。(因为默认的equals方法是用 == 来判断的，仍是判断内存地址)，
        // 则必须对equals方法重写。


        // equals方法重写后b1则为true
        boolean b2  = t1.equals(t2);
        System.out.println(b2);
        Time2 t3 = new Time2(2000,1,2);
        System.out.println(t1.equals(t3));
        Time2 t4 = null;
        System.out.println(t1.equals(t4));
        //没有bug，但是效率太低。
    }
}
class Time2{
    int year;
    int month;
    int day;
    public Time2() {
    }
    public Time2(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

/*
        默认的equals方法。
    public boolean equals (Object obj) {
           return (this == obj);}
     */

    //重写equals方法。
    /*
    public boolean equals (Object obj) {
        int y1 = this.year;
        int m1 = this.month;
        int d1 = this.day;
        if(obj instanceof Time2){
            Time2 t = (Time2)obj;
            int y2 = t.year;
            int m2 = t.month;
            int d2 = t.day;
            if(y1 == y2 && m1 == m2 && d1 == d2){
                return true;
            }
        }
        return false;
    }     */


    //改良equals方法
    public boolean equals (Object obj) {
        //如果obj为空或者obj根本不是Time2，没必要比较
        if(obj == null || !(obj instanceof Time2)){
            return false;
        }
        //如果this和obj内存地址相同，没必要比较（内存地址相同更肯定是同一对象。）
        if( this == obj){ return true;}
        Time2 t = (Time2) obj;
            return this.year == t.year && this.month == t.month && this.day == t.day;

    }

}