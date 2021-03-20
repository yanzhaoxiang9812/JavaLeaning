package Constructor;

class Constructor1_Test{//当一个类没有提供任何构造方法，系统会默认提供一个无参数的构造方法，这个构造方法被称为‘缺省构造器’
    int id;
    String name;
    int age;

    //下面的程序就是系统默认提供的无参数构造方法也叫‘缺省构造器’
    public Constructor1_Test() {//构造方法的方法名必须与类名一致
        System.out.println("缺省构造器执行了");
    }
    //下面程序编写了一个有参数的构造方法
    /*  public Constructor1_Test(int i ){//当一个类中手动提供了一个构造方法，系统就不会自动提供无参构造方法了！！
    //构造方法也可以方法重载
        }
     */
}