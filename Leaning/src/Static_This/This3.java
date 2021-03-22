package Static_This;
/*
        This在什么情况下不能省略
            当实例变量名与局部变量名相同是，应该在实例变量名前加上‘this.’
                this的唯一作用就是指向当前对象
 */
public class This3 {
    public static void main(String [] args ){
        NotThis n1 = new NotThis();
        n1.setNum(123);
        n1.setName("888");
        System.out.println(n1.getNum()+"\t"+n1.getName());
        NotThis n2 = new NotThis(456,"999");
        System.out.println(n2.getNum()+"\t"+n2.getName());
    }
}
class NotThis{
    private int num;
    private String name;
    public NotThis(){}
    //当实例变量名与局部变量名相同是，应该在实例变量名前加上‘this.’
    public NotThis(int num,String name){
        this.num = num;
        this.name = name;
    }
    public int getNum() {
        return num;
    }
    public void setNum(int num) {
        this.num = num;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}