package Method;
/*
方法重载(overload) :
什么时候需要考虑使用方法重载?
        在同一个类当中，如果"功能1"和"功能2"它们的功能是相似的，那么可以考虑将它们的方法名一致，这样代码既美观，又便于后期的代码编写(容易记忆，方便使用) .
        注意:方法重载overload不能随便使用，如果两个功能压根不相干,不相似，根本没关系，此时两个方法使用重载机制的话，会导致编码更麻烦。无法进行方法功能的区分。
*什么时候代码会发生方法重载?
         条件1:在同一个类当中
         条件2:方法名相同
         条件3:参数列表不同
            只要同时满足以上3个条件，那么我们可以认定方法和方法之间发生方法重载机制
方法重载与返回值类型和修饰符’无关‘.
重载主要看是否同一个类并且方法名和参数列表
 */
public class OverLoad {
    public static void main(String[] args){
        m(1);
    }
    public static void m(){//一
        System.out.println(" Life's A Struggle ");
    }
    public static void m(int i){//二
        System.out.println(i);
    }
    public static void m(int i, int y,int z){//三
        System.out.println(i + y + z);
    }
    public static void m(double d){//四
        System.out.println(d);
    }
    public static void m(int i,double d){//五
        System.out.println(i + (int)d);
    }
    public static void m(int i,int y,double d){//六
        System.out.println(i + y + (int)d);
    }
}
class MyClass{//不在类OverLoad类中  不能算为方法重载
    public static void m(int i , int y){

    }
}