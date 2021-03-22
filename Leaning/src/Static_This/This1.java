package Static_This;
/*
        一个对象一个this.
        this是一个变量，是一个引用。this保存当前对象的内存地址，指向自身。
        所以，严格意义上来说，this代表的就是"当前对象"
        this存储在堆内存当中对象的内部。
        this只能使用在实例方法中。谁调用这个实例方法，this就是谁。
        *** 所以this代表的是:‘当前对象’。 ***



 */
public class This1 {
    public static void main(String[]args){
        Customer1 c1 = new Customer1("123");//此时this和c1在内存中是相同的，保存了相同的内存的地址
        c1.shopping();
        Customer1 c2 = new Customer1("456");//此时this和c2在内存中是相同的，保存了相同的内存的地址
        c2.shopping();

    }
}
class Customer1{
    String name;
    public Customer1(){

    }
    public Customer1(String s){
        name = s;
    }
    public void shopping(){
        /*  c1调用shopping () ,this是c1
            c2调用shopping (),this是c2   */
        System.out.println(/* this. */name + "正在购物");
        //此处的name是实例变量必须以“引用.”访问，但此处是实际上是有一个‘this.’ 大部分情况下‘this.’可以省略
    }
}
class Student{
    String name = "123";//此处的name是实例变量，访问必须以“引用.”访问
    public static void m (){//静态方法
        //System.out.println(name);//静态方法访问实例变量name，必须以“引用.”访问
        //System.out.println(this.name);//但此行代码仍不能编译成功，因为访问实例变量name，以“引用.”访问，缺少对象
        Student s = new Student();
        System.out.println(s.name);//对象s后才可以访问实例变量name
    }
}