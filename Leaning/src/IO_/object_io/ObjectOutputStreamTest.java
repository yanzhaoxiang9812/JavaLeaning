package IO_.object_io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/*
         把对象转换为字节序列的过程称为对象的序列化。
　　      把字节序列恢复为对象的过程称为对象的反序列化。
            对象的序列化主要有两种用途：
            　　1） 把对象的字节序列永久地保存到硬盘上，通常存放在一个文件中；
            　　2） 在网络上传送对象的字节序列。

        序列化和反序列化的对象类必须实现Serializable接口
            一个类如果实现了Serializable接口，会自动生成给序列化版本号，
            最好在编写该类的同时编写出该类的序列化版本号。
            后期修改该类方便。
 */
public class ObjectOutputStreamTest {
    public static void main(String[] args) {
        //  创建对象
        A a = new A(22,"yzx");
        try {
            //  创建对象流
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("obj"));
            //  序列化
            oos.writeObject(a);
            //  刷新
            oos.flush();
            //  关闭
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
class A implements Serializable {
    //  手动编写序列化版本号
    private static final long serialVersionUID = 1L;
    int age;
    private transient String name;
    //  transient关键字表示流离的，不参与序列化

    public A() {
    }

    public A(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "A{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}