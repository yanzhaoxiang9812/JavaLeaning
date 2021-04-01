package CommonClass.Random;

import java.util.Random;

public class RandomTest1 {
    public static void main(String[] args) {
        //创建随机数对象
        Random random = new Random();
        //随机产生一个int类型随机数
        int num1 = random.nextInt();
        System.out.println(num1);

        //产生[0~100]之间的随机数。不能产生101。
        // nextInt翻译为:下t个int类型的数据是101，表示只能取到100.
        int num2 = random.nextInt( 101);//不包括101
        System.out.println(num2);

    }
}
