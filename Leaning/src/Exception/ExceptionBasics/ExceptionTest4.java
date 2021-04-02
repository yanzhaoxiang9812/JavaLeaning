package Exception.ExceptionBasics;


//          对ExceptionTest3中异常的处理


public class ExceptionTest4 {
    /*第一种处理方式：在方法声明的位置上继续使用throws，用来抛给上一级(JVM)。
    public static void main (String[] args) throws ClassNotFoundException { */

    /*第二种处理方式：使用try...catch捕捉(拦截并处理)*/
    public static void main(String[] args) {
        try {
            doSome();
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }
    public static void doSome() throws ClassNotFoundException{
        System.out.println("doSome");
    }
}
