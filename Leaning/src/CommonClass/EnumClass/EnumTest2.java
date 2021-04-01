package CommonClass.EnumClass;
/*

        采用枚举方式改造EnumTest1中程序

总结;
        1、枚举是一种引用数据类型
        2、枚举类型怎么定义，语法
            enum 枚举类型名{
                枚举值1 ,枚举值2，枚举值3
            }
        3、结果只有两种情况的，建议使用布尔类型。
        结果超过两种并且还是可以一枚一枚列举出来的，建议使用枚举类型。



 */
public class EnumTest2 {
    public static void main(String[] args) {
        Result result = divide1(10,0);
        System.out.println(result == Result.SUCCESS ? "计算成功" : "计算失败");
        Result result1 = divide1(0,10);
        System.out.println(result1 == Result.SUCCESS ? "计算成功" : "计算失败");
    }
    public static boolean divide(int a, int b){
        try {
            int c = a / b;
            return true;
        }catch (Exception e){
            return false;
        }
    }
    //使用过枚举后的程序
    public static Result divide1(int a, int b){
        try {
            int c = a / b;
            return Result.SUCCESS;
        }catch (Exception e){
            return Result.FAIL;
        }
    }
}
/*
枚举:―枚一枚可以列举出来的，才建议使用枚举类型。
枚举编译之后也是生成cLass文件。
枚举也是一种引用数据类型。
枚举中的每一个值可以看做是常量。
 */
enum Result{
    // SUCCESS是枚举Result类型中的一个值
    // FAIL是枚举Result类型中的一个值
    // 枚举中的每一个值，可以看做是常量”
        SUCCESS,FAIL
}