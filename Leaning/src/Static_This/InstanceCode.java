package Static_This;
/*

        实例代码块：
            {
                java语句；
                ........
            }
           实例代码块在 构造方法执行之前，系统自动执行实例代码块
 */
public class InstanceCode {
    {//实例代码块
        System.out.println("实例代码块");
    }
    public InstanceCode(){
        System.out.println("无参构造方法");
    }
    public InstanceCode(String name){
        System.out.println("有参构造方法");
    }
    public static void main(String[]args){//入口
        System.out.println("main begin");
        new InstanceCode();
        /*
            此处运行的结果为：
            main begin
            实例代码块
            无参构造方法
         */
        new InstanceCode("Life's A Struggle");
        /*
            此处运行结果为：
                main begin
                实例代码块
                无参构造方法
                实例代码块
                有参构造方法
         */
    }
}
