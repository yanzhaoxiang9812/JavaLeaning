package Method;
//不止main方法能调用方法，方法也能调用其他方法。
public class M2 {
    public static void main(String[] args){
        m1();
    }
    public static void m1(){
        m2();
    }
    public static void m2(){
        M2_class.m3();
    }
}
class M2_class{
    public static void m3(){
        System.out.println("Life's Struggle  Life's Struggle   Life's Struggle");
    }
}
