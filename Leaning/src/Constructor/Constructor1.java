package Constructor;
/*
构造方法：
    一个特殊的方法，能够完成对象的创建并对实例变量的初始化，

    [修饰符列表] 构造方法名(形式参数列表){
            构造方法体;//此处一般给对象属性进行赋值
    }
    构造方法没有返回值(不能在构造方法前写上void)，


    调用构造方法使用new关键字。
        new 构造方法名(实际参数列表);
 */
public class Constructor1 {
        public static void main(String[] arsg ){
            new Constructor1_Test();//调用构造方法Constructor1_Test，此行代码无引用
            Constructor1_Test c1 = new Constructor1_Test();//此行程序也是调用构造方法Constructor1_Test，但是该行代码对Constructor1_Test类型的对象创建了c1引用，

        }
}


