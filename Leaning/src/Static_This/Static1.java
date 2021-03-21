package Static_This;
/*
    statci译为静态的，statci关键字修饰的都是’类‘级别的。statci关键字修饰的，都是以“类名.”的方式访问。statci关键字修饰的变量：静态变量。statci关键字修饰的方法：静态方法
        变量：
            方法体中：局部变量(存储在jvm的栈中)

                            |-实例变量(对象级别，存储在jvm的堆内存中，与对象相关，以“引用.”访问，需要先new对象)
            方法体外：成员变量-
                            |-静态变量(类级别，存储在jvm的方法区中，与类相关的的，访以“类名.”访问,不需要new对象)

        方法：
            实例方法：与对象相关，以“引用.”的调用需要先new对象
            静态方法：与类相关的的，以“类名.”调用,不需要new对象
 */
public class Static1 {
}
class MyClass{
    //  下面的都是实例的，与对象相关，访问“引用.”需要先new对象，再访问
    int i;//成员变量中的实例变量
    public void m1(){}//实例方法
    //  下面都是静态的，与类相关的的，访问“类名.”,不需要new对象
    static int k;//成员变量中的静态变量
    public static void m2(){}//静态方法
}
