package CommonClass.DataClass;

/*
            获取自1970年1月1日00:00:00 000到当前系统时间的总毫秒数。
                    System.currentTimeMillis();
 */

public class DataTest2 {
    public static void main(String[] args) {
        System.currentTimeMillis();
        long l =System.currentTimeMillis();
        System.out.println(l);

        //统计一个方法耗时
        //在调用目标方法之前记录一个毫秒数
        long begin = System.currentTimeMillis();
        print();
        //在执行完目标方法之后记录一个毫秒数
        long end = System.currentTimeMillis();
        System.out.println("耗费时长：" + (end - begin) + "毫秒");

    }
    public static void print(){
        for (int i = 0 ; i < 10000 ; i++){
            System.out.println(i);
        }
    }
}
