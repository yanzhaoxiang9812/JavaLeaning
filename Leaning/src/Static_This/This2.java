package Static_This;
/*
    实例变量和实例方法，都是对象级别的，必须先创建的对象并以“引用.”访问
    静态变量和静态方法，都是类级别的，以“类名.”访问
 */
public class This2 {
    int i = 999;//实例变量
    static int k = 666;//静态变量
    public static void main(String[]args){//静态方法
        //System.out.println(i);//此处并不能访问实例变量i。
        //访问实例变量必须有以下代码
        This2 t = new This2();
        System.out.println(t.i);

        //可以直接访问静态变量k
        System.out.println(k);
    }
}
