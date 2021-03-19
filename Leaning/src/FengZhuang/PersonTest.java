package FengZhuang;
//在外部访问Person中的数据
/*public class PersonTest {
    public static void main(String[]a){
        Person p1 = new Person();
        //读Person数据(get)
        System.out.println(p1.age);
        //改Person数据(set)
        p1.age = 22;
        System.out.println(p1.age);
        //故在当前类中可以对age属性进行任意操作
        p1.age = -100;
        System.out.println(p1.age);//年龄为复数不符合实际情况
        //随意访问Preson中的age属性，导致数据不安全
        //所以要进行“封装”
    }
}*/
class Person {
    /*                  封装操作                     */
    //第一步:属性私有化
    //第二步:1个属性对外提供两个set和get方法。外部程序只能通过set方法修改，只能通过get访问以在set方法中设立关卡来保证数据的安全性。
    /*
        get方法的格式：
            public 返回值类型 get+属性名首字母大写(无参数){
            }
        set方法的格式：
            public void set+属性名首字母大写(一个参数){
                属性名 = 参数；
            }
     */
    private int age;
    //get实例方法
    public int getAge(){
        return age;
    }
    //set实例方法
    public void setAge(int nianLing){
        //设置约束
        if(nianLing < 0 || nianLing> 1000){
            System.out.println("age不合法");
            return;
        }
        age =  nianLing;
    }
}
public class PersonTest {
    public static void main(String[]args){
        Person p = new Person();
        //读age
        System.out.println(p.getAge());
        //改age
        p.setAge(22);
        System.out.println(p.getAge());
        //测试约束
        p.setAge(-1);
        System.out.println(p.getAge());
    }
}

