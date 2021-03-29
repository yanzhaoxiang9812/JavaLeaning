package Object;

import java.util.Objects;

public class Equals3 {
    public static void main(String[] args) {
        User u1 = new User("Y",new Address("西安","人民路","666"));
        User u2 = new User("Y",new Address("西安","人民路","666"));
        System.out.println(u1.equals(u2));//false
        //只对User类重写了equlas方法，Address类没有重写。
        //因为User类中包含了Address，比较User两个对象的时候必然也会调用Address中的equlas方法。
        //但现在并没有对Address类的equlas方法重写，所以现在还是比较的是两个User对象的内存地址。


        //Address类equlas方法重写后。
        System.out.println(u1.equals(u2));//true

        User u3 = new User("Z",new Address("西安","人民路","666"));
        System.out.println(u1.equals(u3));
    }
}
class User{
    String name;
    Address addr;
    public User() {
    }
    public User(String name, Address addr) {
        this.name = name;
        this.addr = addr;
    }

    @Override//重写equlas方法
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return name.equals(user.name) && addr.equals(user.addr);
    }
}
class Address{
    String city,street,zipcode;
    public Address() {
    }
    public Address(String city, String street, String zipcode) {
        this.city = city;
        this.street = street;
        this.zipcode = zipcode;
    }

    @Override//重写equlas方法
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Address)) return false;
        Address address = (Address) o;
        return city.equals(address.city) && street.equals(address.street) && zipcode.equals(address.zipcode);
    }

}