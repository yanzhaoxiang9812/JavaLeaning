import java.util.Scanner;
/*
   用户输入生日年月日，年份不能超过四位数，进行判断，若该天是该年的第n天，第n天刚好可以整除9，则是幸运儿，反之则失败。
 */
public class Test1 {
    public static void main(String[] args) {
            AddTime add1 = new AddTime();
            add1.addYear();
            add1.addMonth();
            add1.addDay();
            System.out.println(add1.chu9());
    }
}
class Time{
    private int year,month,day,sum;
    public Time() {
    }
    public Time(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
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
    public int getSum() {
        return sum;
    }
    public void setSum(int sum) {
        this.sum = sum;
    }
    public int getDay() {
        return day;
    }
    public void setDay(int day) {
        this.day = day;
    }
}
class AddTime extends Time {
    //判断闰年方法
    Boolean runNian() {
        if ((getYear() % 4 == 0 && getYear() % 100 != 0) || (getYear() % 400 == 0)) {
            return true;
        }
        return false;
    }

    //计算天数方法
    void jiShuan(){
        switch (getMonth()){
            case 1:
                this.setSum(0);break;
            case 2:
                this.setSum(31);break;
            case 3:
                this.setSum(59);break;
            case 4:
                this.setSum(90);break;
            case 5:
                this.setSum(120);break;
            case 6:
                this.setSum(151);break;
            case 7:
                this.setSum(181);break;
            case 8:
                this.setSum(212);break;
            case 9:
                this.setSum(243);break;
            case 10:
                this.setSum(273);break;
            case 11:
                this.setSum(304);break;
            case 12:
                this.setSum(334);break;
        }
        setSum(getDay() + getSum());
        if(runNian() && getMonth() > 2){
            //如果是闰年且月份大于二月，加一
            setSum(getSum() + 1);
        }
    }

    //计算是否能被9整除
    String chu9(){
        jiShuan();
        if( getSum() % 9 == 0){
            return "恭喜幸运儿";
        }return "很抱歉，失败了";
    }

    //输入年方法
    void addYear() {
        while (true) {
            Scanner y = new Scanner(System.in);
            System.out.print("输入Year：");
            int y1 = y.nextInt();
            if (y1 <= 0 || y1 > 9999) {
                System.out.print("输入错误，重新");
            } else {
                this.setYear(y1);
                break;
            }
        }
    }

    //输入月方法
    void addMonth() {
        while (true) {
            Scanner m = new Scanner(System.in);
            System.out.print("输入Month：");
            int m1 = m.nextInt();
            if (m1 <= 0 || m1 > 12) {
                System.out.print("输入错误，重新");
            } else {
                this.setMonth(m1);
                break;
            }
        }
    }

    //输入日方法
    void addDay() {
        if (this.runNian()) {
            switch (getMonth()) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    while (true) {
                        Scanner d = new Scanner(System.in);
                        System.out.print("输入Day：");
                        int d1 = d.nextInt();
                        if (d1 <= 0 || d1 > 31) {
                            System.out.print("输入错误，重新");
                        } else {
                            this.setDay(d1);
                            break;
                        }
                    }
                    break;
                case 2:
                    while (true) {
                        Scanner d = new Scanner(System.in);
                        System.out.print("输入Day：");
                        int d1 = d.nextInt();
                        if (d1 <= 0 || d1 > 29) {
                            System.out.print("输入错误，重新");
                        } else {
                            this.setDay(d1);
                            break;
                        }
                    }
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    while (true) {
                        Scanner d = new Scanner(System.in);
                        System.out.print("输入Day：");
                        int d1 = d.nextInt();
                        if (d1 <= 0 || d1 > 30) {
                            System.out.print("输入错误，重新");
                        } else {
                            this.setDay(d1);
                            break;
                        }
                    }
                    break;
            }
        } else {
            switch (getMonth()) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    while (true) {
                        Scanner d = new Scanner(System.in);
                        System.out.print("输入Day：");
                        int d1 = d.nextInt();
                        if (d1 <= 0 || d1 > 31) {
                            System.out.print("输入错误，重新");
                        } else {
                            this.setDay(d1);
                            break;
                        }
                    }
                    break;
                case 2:
                    while (true) {
                        Scanner d = new Scanner(System.in);
                        System.out.print("输入Day：");
                        int d1 = d.nextInt();
                        if (d1 <= 0 || d1 > 28) {
                            System.out.print("输入错误，重新");
                        } else {
                            this.setDay(d1);
                            break;
                        }
                    }
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    while (true) {
                        Scanner d = new Scanner(System.in);
                        System.out.print("输入Day：");
                        int d1 = d.nextInt();
                        if (d1 <= 0 || d1 > 30) {
                            System.out.print("输入错误，重新");
                        } else {
                            this.setDay(d1);
                            break;
                        }
                    }
                    break;

            }

        }
    }
}