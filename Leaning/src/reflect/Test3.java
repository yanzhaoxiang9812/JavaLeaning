package reflect;

/*
        //通过反射机制，获取CLass，通过CLass来实例化对象

 */
public class Test3 {
    public static void main(String[] args) {
        try {
            //通过反射机制，获取CLass，
            Class c1 = Class.forName("reflect.User");
            //通过CLass来实例化对象
             Object o = c1.newInstance();// 这个方法会执行该对象类的无参构造方法
            System.out.println(o);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }

    }
}
class User{
    public User() {
        System.out.println("User 无参构造方法执行！");
    }
}