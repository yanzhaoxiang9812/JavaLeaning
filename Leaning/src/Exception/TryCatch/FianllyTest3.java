package Exception.TryCatch;

public class FianllyTest3 {
    public static void main(String[] args) {
        int result = m();
        System.out.println(result);//100    ?

    }
    //方法中的语句一定是自上而下执行
    //return一定是在方法中最后执行的。
    public static int m(){
        int i = 100;
        try {
            return i;
        }finally {
            i++;
        }
    }
    /*
        这里其实是：
        int i = 100;
        int j = i;
        i++;
        return j;
     */
}
