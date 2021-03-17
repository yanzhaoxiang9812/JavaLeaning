package Method;
/*
使用方法重载对代码的封装
编写一个打印所有数据类型的类
 */
public class SOP {
    public static void main(String[]args){

    }
    public static void p(byte b){
        System.out.println(b);
    }

    public static void p(short s){
        System.out.println(s);
    }
    public static void p(int i ){
        System.out.println(i);
    }
    public static void p(long l){
        System.out.println(l);
    }
    public static void p(float f){
        System.out.println(f);
    }
    public static void p(double d){
        System.out.println(d);
    };
    public static void p(boolean b){
        System.out.println(b);
    }
    public static void p(char c){
        System.out.println(c);
    }
    public static void p(String s){
        System.out.println(s);
    }
}
