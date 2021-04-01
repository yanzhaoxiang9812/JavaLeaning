package CommonClass.Random;
import java.util.Random;
/*
编写程序，生成5个不重复的随机数[0-100]。重复的话重新生成。
最终生成的5个随机数放到数组中，要求数组中这5个随机数不重复。
 */
public class RandomTest2 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] a = new int[5];
        int index = 0;//下标
        while (index < a.length){
            int num = random.nextInt(101);
            if(!MyMethod(a,num)){//不包含这个元素就加到数组中
                a[index++] = num;
            }
        }
        //打印数组
        for (int i = 0 ; i < a.length ; i++){
            System.out.println(a[i]);
        }

    }

    //单独编写一个个方法，判断数组中是否存在相同的元素
    public static boolean MyMethod(int[] a , int key){
        for(int i = 0 ; i < a.length ; i++){
            if(a[i] == key){
                return true;
            }
        }
        return false;
    }
}

