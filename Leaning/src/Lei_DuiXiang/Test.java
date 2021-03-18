package Lei_DuiXiang;


public class Test {
    public static void main(String [] args){

        Address a = new Address();//此时的‘a'也被称为“引用”。’a‘中保存了Address对象的内存地址
        a.city = "陕西";
        a.street = "西安";
        a.zipcod = "66666";

        User u = new User();
        u.id = 888;
        u.username = "Fuck";
        u.addr = a;
        System.out.println(u.id);
        System.out.println(u.username);
        System.out.println(u.addr.city);
    }
}
class Address{
    String city;
    String street;
    String zipcod;
}
class User{
    int id;
    String username;
    Address addr;
}


