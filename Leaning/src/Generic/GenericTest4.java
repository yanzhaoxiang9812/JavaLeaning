package Generic;

/*
            自定义泛型
 */

public class GenericTest4 {
    public static void main(String[] args) {
        //      没有规定泛型，默认为Object
        MyGeneric myGeneric = new MyGeneric();
        myGeneric.doSome(123);// 123
        myGeneric.doSome("java");// java
        myGeneric.doSome(true);//   true

        //      规定为泛型为String
        MyGeneric<String> myGeneric1 = new MyGeneric<>();
        myGeneric1.doSome("JAVA");// JAVA

        //      规定为泛型为Integer
        MyGeneric<Integer> myGeneric2 = new MyGeneric<>();
        myGeneric2.doSome(123);// 123


    }
}
class MyGeneric<MyGeneric>{
    public void doSome(MyGeneric myGeneric){
        System.out.println(myGeneric);
    }
}
