package Polymorphism;
/*
    编写程序实现乐手弹奏乐器。乐手可以弹奏不同的乐器从而发出不同的声音。可以弹奏的乐器包括二胡、钢琴和琵琶。
        实现思路及关键代码:
        1)定义乐器类Instrument，包括方法makesound ()
        2)定义乐器类的子类:二胡Erhu、钢琴Piano和小提琴violin
        3)定义乐手类Musician，可以弹奏各种乐器play (Instrunent i)
        4)定义测试类，给乐手不同的乐器让他弹奏
 */
public class Test4 {
    public static void main(String [] args){
        //创建所有乐器对象
        Erhu e1 = new Erhu();
        Piano p1 = new Piano();
        Violin v1 = new Violin();
        //创建乐手对象
        Musician m1 = new Musician();
        //乐手调用play方法使所有乐器发出声音
        m1.play(e1);
        m1.play(p1);
        m1.play(v1);
        Instrument instrument = new Erhu();
        instrument.makesound();
        m1.play(new Piano());
    }
}
//乐手
class Musician{
    public void play(Instrument instrument){
        instrument.makesound();
    }
}
//所有乐器的父类
class Instrument{
    public void makesound(){
    }
}
//下面都是乐器的子类
class Erhu extends Instrument{
    public void makesound(){
        System.out.println("二胡的声音");
    }
}
class Piano extends Instrument{
    public void makesound(){
        System.out.println("钢琴的声音");
    }
}
class Violin extends Instrument{
    public void makesound(){
        System.out.println("小提琴的声音");
    }
}
