package reflect;
/*

                通过java语言中的反射机制可以操作字节码文件

java.lang.class:代表整个字节码，代表一个类型
java.lang. reflect. Method:代表字节码中的方法字节码。
java.lang.reflect.Constructor:代表字节码中的构造方法字节码。
java. lang. reflect.Field:代表字节码中的属性字节码。
       例如下面代码：
        public class User{
            // Field
            int no;
            // constructor
            public User() {
            }
            public User(int no){
                this.no = no;
            }
            // Method
            public void setNo (int no) {
                this.no = no;
            }
            public void setNo (int no){
                this.no = no;
            }
            public int getNo ( ) {
             return no;
            }
        }

 */
public class Test1 {}
