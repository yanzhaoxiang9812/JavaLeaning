package Lei_DuiXiang;
/*
    创建对象：   new 类名();
类是模板，一个类可以创建n个对象。
在java中类名都属于“引用数据类型”，
 */
public class Student_Test {
    public static void main(String[]args){
        //创建对象
      //  类名  对象名 =    new 类名(参数列表);
        Student s1   =    new Student();
        Student s2   =    new Student();
        Student s3   =    new Student();
        //以上程序等同与以Student类实例化了3个对象。
        //访问实例变量
        //对象名.变量名
        System.out.println(s1.nianLing);
    }
}
