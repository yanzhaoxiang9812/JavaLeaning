package Method;
/*
    break;与return；的区别
*/
public class M3 {
    public static void main(String[] args) {
        for(int i = 1 ; i <= 4 ; i++){
            System.out.println(i);
            if(i==3) {
                //break;//用于终止该‘循环’
                return;//用于终止该’方法‘
            }
        }
        System.out.println("Life's Struggle");
    }
}
