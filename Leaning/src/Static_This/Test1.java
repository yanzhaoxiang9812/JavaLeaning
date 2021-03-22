package Static_This;
/*
        定义丈夫类Husband和妻子类wife,
        丈夫类的属性包括:身份证号，姓名，出生日期，妻子。
        妻子类的属性包括:身份证号，姓名，出生日期，丈夫。
        分别给这两个类提供构造方法（无参数构造方法和有参数构造方法都要提供），编写测试程序，
        创建丈夫对象，然后再创建妻子对象，丈夫对象关联妻子对象，妻子对象关联丈夫对象，
        要求能够输出这个"丈夫对象"的妻子的名字，或者能够输出这个"妻子对象"的丈夫的名字。
 */
public class Test1 {
    public static void main(String[]args){
        Husband h = new Husband("123","张三","2000-01-01",null);
        Wife w = new Wife("456","李四","2222-2-22",null);
        //关联两个类
        h.wife = w;
        w.husband = h;
        //输出丈夫对象的妻子的名字
        System.out.println(h.name + "的妻子是" + h.wife.name);
        System.out.println(h.name + "的妻子是" + w.name);//这样写虽然可以输出，但并不能证明丈夫与妻子已经有关联
        System.out.println(w.name + "的丈夫是" + w.husband.name);
    }
}
class Husband{
    String idCard;
    String name;
    String birth;
    Wife wife;
    public Husband(){}
    public Husband(String s1,String s2,String s3,Wife w){
        idCard = s1;
        name = s2;
        birth = s3;
        wife = w;
    }
}
class Wife{
    String idCard;
    String name;
    String birth;
    Husband husband;
    public Wife(){}
    public Wife(String s1,String s2,String s3,Husband h){
        idCard = s1;
        name = s2;
        birth = s3;
        husband = h;
    }
}