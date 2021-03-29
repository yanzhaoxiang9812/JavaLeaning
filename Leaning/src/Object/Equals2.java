package Object;

import java.util.Objects;

public class Equals2 {
    public static void main(String[] args) {
        MyTime m1 = new MyTime(1998,12,12,"yzx");
        MyTime m2 = new MyTime(1998,12,12,"yzx");
        MyTime m3 = new MyTime(1998,12,21,"zx");
        System.out.println(m1.equals(m2));
        System.out.println(m1.equals(m3));
        System.out.println(m1.toString());
        System.out.println(m2.toString());
        System.out.println(m3.toString());

    }

}
class MyTime{
    private int year,month,day;
    private String string;
    public MyTime() {
    }

    public MyTime(int year, int month, int day, String string) {
        this.year = year;
        this.month = month;
        this.day = day;
        this.string = string;
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

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    @Override
    public String toString() {
        return "MyTime{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                ", string='" + string + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MyTime)) return false;
        MyTime myTime = (MyTime) o;
        return getYear() == myTime.getYear() && getMonth() == myTime.getMonth() && getDay() == myTime.getDay() && getString().equals(myTime.getString());
    }
}
