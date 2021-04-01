package CommonClass.EnumClass;

public class EnumTest1 {
    public static void main(String[] args) {
        System.out.println(divide1(110,10));
        System.out.println(divide1(10,0));

    }
    //设计缺陷﹖在这个方法的返回值类型上。返回一个int不恰当。
    //既然最后的结果只是成功和失败，最好使用布尔类型。因为布尔类型
    // true和false正好可以表示两种不同的状态。
    public static int divide(int a, int b){
        try {
            int c = a / b;
            return 1;//若1写错了，偏离需求，实际上已经出错了，但是编译器没有检查出来。
            //尽量要保证所有的错误尽可能让编译器找出来，所有的错误越早发现越好!
        }catch (Exception e){
            return 0;
        }
    }
    //改为下面的代码
    public static boolean divide1(int a, int b){
        try {
            int c = a / b;
            return true;
        }catch (Exception e){
            return false;
        }
    }
    /*
    思考:以上的这个方法设计没毛病，挺好，返回true和false表示两种情况，
    但是在以后的开发中，有可能遇到一个方法的执行结果可能包括三种情况，四种
    情况，五种情况不等，但是每一个都是可以数清楚的，一枚一枚都是可以列举出
    来的。这个布尔类型就无法满足需求了。此时需要使用java语言中的枚举类型。
    */

}
