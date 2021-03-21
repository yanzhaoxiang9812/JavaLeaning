package Static_This;

public class Static5 {
    static int i = 100;//静态变量，在类加载时初始化
    static {//静态代码块，在类加载是执行
        System.out.println(i);//所以在此处可以访问‘i’变量
    }
    int k = 99;//此处k是一个实例变量
    static {
        //System.out.println(k);//编译错误：java: 无法从静态上下文中引用非静态 变量 k    k变量是一个实例变量
    }

    static {
        //System.out.println(string);//编译错误：java: 非法前向引用
    }
    static String string = "Life' A Struggle";
    static {
        System.out.println(string);//此处可访问string，代码自上向下执行
    }

    public static void main(String[]args){
        System.out.println("main begin");
    }
}
