package Static_This;
/*

        (封装)已知一个类student代码如下:class student{
        string name ;int age;
        string address;string zipcode ;string mobile;
        要求:
        1、把student 的属性都作为私有，并提供get/set方法以及适当的构造方法。
        2、为student类添加一个getPostAddress方法，要求返回student对象的地址和邮编。

*/
public class Test4 {
    public static void main(String [] args){
        Student2 student2 = new Student2("张三",19,"陕西","666","1234567");
        System.out.println(student2.getPostAddress());
    }
}
class Student2{
    private String name;
    private int age ;
    private String address;
    private String zipcode;
    private String mobile;
    public Student2(){}
    public Student2(String name, int age, String address, String zipcode, String mobile) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.zipcode = zipcode;
        this.mobile = mobile;
    }
    public String getPostAddress(){
        return "地址："+this.getAddress()+"\n"+"邮编："+this.getZipcode();
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getZipcode() {
        return zipcode;
    }
    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }
    public String getMobile() {
        return mobile;
    }
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
