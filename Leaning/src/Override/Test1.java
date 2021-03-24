package Override;
/*
    方法覆盖简单案例
 */
public class Test1 {
    public static void main(String [] args){
        ChinaPeople chinaPeople = new ChinaPeople();
        chinaPeople.setName("张三");
        chinaPeople.Speak();
        AmericPeople americPeople = new AmericPeople();
        americPeople.setName("jack");
        americPeople.Speak();
    }
}
class People{
    private String name;
    public People(){}
    public People(String name){
        this.name = name;
    }
    public void Speak(){
        System.out.println(this.getName()+"......");
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
class ChinaPeople extends People{
    public void Speak(){
        System.out.println(this.getName()+": 床前明月光......");
    }
}
class AmericPeople extends People{
    public void Speak(){
        System.out.println(this.getName()+": ABCDEFG.......");
    }
}
