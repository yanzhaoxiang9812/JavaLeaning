package Override;
/*
    当前程序存在的问题是？
        鸟儿在move方法时，希望输出结果是“鸟儿在飞翔”
        但当前结果是“动物在移动”，
        很显然，Bird类继承Animal类之后，无法满足Bird的需求。
 */
public class Override1 {
    public static void main(String[]args){
        Bird b = new Bird();
        b.move();
    }
}
class Animal{//父类
    public void move(){
        System.out.println("动物在移动");
    }
}
class Bird extends Animal{//子类
    //子类继承父类，有些“行为”可能不需要改进，但也存在需要改进的情况
}
class Fish extends Animal{
    //鱼在调用move时希望输出“游动”
}
