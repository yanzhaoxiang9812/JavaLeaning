package Polymorphism;

public class Test2 {
    public static void main(String [] args){
        Animal x = new Bird();
        Animal y = new Fish();
        if(x instanceof  Bird){
            Bird bird = (Bird)x;
            bird.Sing();
        }else if(x instanceof Fish){
            Fish fish = (Fish)x;
            fish.fishScales();
        }
        if(y instanceof  Bird){
            Bird bird = (Bird)y;
            bird.Sing();
        }else if(y instanceof Fish){
            Fish fish = (Fish)y;
            fish.fishScales();
        }
        //输出为：Bird's Sing   Fish have scales
    }
}
