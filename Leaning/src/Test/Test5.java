package Test;
/*
请定义一个交通工具(ehicle)的类
其中有属性:
速度(speed)
体积(size)
方法移动(move())
设匿速度(setSpeed(int speed))
加速speedUp(),减速speedDown()

最后在测试类Vehicle中的main()中实例化一个交通工具对象并通过方法给它初始化
speed,size的值并且打印出来。另外调用加速减速的方法对速度进行改变。
*/


public class Test5 {
    public static void main(String[] args) {
        Vehicle v = new Vehicle(0,6);
        v.move();
        v.speedUp(10);
        v.move();
        v.speedDown(6);
        v.move();


    }
}
class Vehicle{
    private int speed;
    private int size;
    public Vehicle() {}
    public Vehicle(int speed, int size) {
        this.speed = speed;
        this.size = size;
    }
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }
    public void move(){
        System.out.println("该交通该工具正在移动，当前速度为：" + getSpeed() + "码");
    }
    public void speedUp(int addSpeed){
        this.setSpeed(this.getSpeed() + addSpeed);
    }
    public void speedDown(int subSpeed){
        this.setSpeed(this.getSpeed() - subSpeed);
    }
}