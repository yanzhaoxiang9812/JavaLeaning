package Static_This;
/*
        什么时候定义静态方法或实例方法
                当方法体中直接访问了实例变量，则这个方法就得是实例方法，反之亦然。(有对象参与的方法应该为实例方法)
 */
public class Static3 {
    public static void main(String[]args){
        User u = new User();
    }
}
class User{
    private int id;
    public void setId(int i){
        id = i;
    }
    public int getId(){
        return id;
    }
}