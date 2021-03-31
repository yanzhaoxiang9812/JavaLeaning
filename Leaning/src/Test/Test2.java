/*
第一题:
编写程序，使用一维数组，模拟栈数据结构。要求:
1、这个栈可以存储java中的任何引用类型的数据。
2、在栈中提供push方法模拟压栈。（栈满了，要有提示信息。)
3、在栈中提供pop方法模拟弹栈。（栈空了，也有有提示信息。)
4、编写测试程序，new栈对象，调用push pop方法来模拟压栈弹栈的动作
public class Mystack{//栈类
        提供一个数组来存储栈中的元素 object[]

        栈帧(永远指向栈顶部的元素)1/每加1个元素，栈帧+1
            每减1个元素，栈帧-1
                int index;

    push方法（push方法压栈)
        压栈表示栈中多一个元素。但是栈如果已满，压栈失败。
    pop方法（pop方法弹栈)
            弹栈表示栈中少一个元素。但是栈如果已空，弹栈失败。


 */
public class Test2 {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        System.out.println(myStack.push(new Object()));
        System.out.println(myStack.push(new Object()));
        System.out.println(myStack.push(new Object()));
        System.out.println(myStack.push(new Object()));
        System.out.println(myStack.push(new Object()));
        System.out.println(myStack.push(new Object()));
        System.out.println(myStack.push(new Object()));
        System.out.println(myStack.push(new Object()));
        System.out.println(myStack.push(new Object()));
        System.out.println(myStack.push(new Object()));
        System.out.println("==========================");
        System.out.println(myStack.pop(new Object()));
        System.out.println(myStack.pop(new Object()));
        System.out.println(myStack.pop(new Object()));
        System.out.println(myStack.pop(new Object()));
        System.out.println(myStack.pop(new Object()));
        System.out.println(myStack.pop(new Object()));
        System.out.println(myStack.pop(new Object()));
        System.out.println(myStack.pop(new Object()));
        System.out.println(myStack.pop(new Object()));
        System.out.println(myStack.pop(new Object()));
        System.out.println(myStack.pop(new Object()));
    }
}

class MyStack{
    private Object[] objects;
    private int index;
    String push(Object o){
        if(index >= objects.length - 1){
            return "压栈失败";
        }else {
         objects[++index] = o;
           return  "压栈" + o + "元素成功，栈帧指向" + index;
        }
    }
    String pop(Object o){
        if(index < 0){
            return "栈已空，弹栈失败";
        }else{
            index--;
            return "元素" + o + "弹栈成功，栈帧指向" + index;
        }
    }
    public MyStack() {
        this.objects = new Object[10];
        this.index = -1;
    }
    public MyStack(Object[] objects) {
        this.objects = objects;
    }

    public Object[] getObjects() {
        return objects;
    }
    public void setObjects(Object[] objects) {
        this.objects = objects;
    }

}
