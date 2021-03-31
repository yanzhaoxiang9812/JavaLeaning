package Test;

import java.util.Objects;
import java.util.Scanner;

/*
编写程序模拟用户注册:
1↓程序开始执行时，提示用户输入"用户名"和"密码"信息。
2、输入信息之后，后台java程序模拟用户注册。
3、注册时用户名要求长度在[6-14]之间，小于或者大于都表示异常。
注意:
    完成注册的方法放到一个单独的类中。异常类自定义即可。
        class User {
            public void register(string username , string password) {
            这个方法中完成注册!}
编写main方法，在main方法中接收用户输入的信息，在main方法中调用Userservice的register方法完成注册。
 */
public class Test9 {
    public static void main(String[] args) {
        Userservice us1 = new Userservice();
        //用户名存在约束，使用循环输入。
        while (true){
            boolean b = true;//定义一个退出循环的变量
            Scanner s1 = new Scanner(System.in);
            System.out.println("请输入您的用户名：");
            us1.setUsername(s1.nextLine());
            try {
                us1.register(us1.getUsername(), us1.getPassword());
            } catch (Test9_Exception e) {
                //若输入用户名出现异常，b变量更改为false。
                b = false;
                //获取简单异常信息。
                System.out.println(e.getMessage());
            }
            //这里代表没有出现异常，则退出循环
            if(b){break;}
        }
        Scanner s2 = new Scanner(System.in);
        System.out.println("请输入您的密码：");
        us1.setPassword(s2.nextLine());
        System.out.println("注册成功，欢迎" + us1.getUsername());
    }
}
//用户业务类
class Userservice{
    String username,password;
    //注册方法
    public void register(String username, String password) throws Test9_Exception {
        if(username == null || username.length() < 6 || username.length() >14){
            throw new Test9_Exception("用户名有误。");
        }
    }
    public Userservice() {
    }
    public Userservice(String username, String password) {
        this.username = username;
        this.password = password;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Userservice)) return false;
        Userservice that = (Userservice) o;
        return Objects.equals(getUsername(), that.getUsername()) && Objects.equals(getPassword(), that.getPassword());
    }
    @Override
    public String toString() {
        return "Userservice{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
