package Exception.ExceptionBasics;

/*

        重写之后的方法不能比重写之前的方法抛出更多（更宽泛）的异常，可以更少。

 */

public class ExceptionTest6 {
    public void doSome() throws Exception{

    }
}
class A extends ExceptionTest6{
    /*编译报错
    父类未抛出异常，子类不能抛出异常
    public void doSome() throws Exception{}。
     */

    /*编译通过
    父类抛出throws Exception，子类可以抛出throws Exception，或比Exception跟小的，不能更大。
    public void doSome() throws Exception{}
     */
}
