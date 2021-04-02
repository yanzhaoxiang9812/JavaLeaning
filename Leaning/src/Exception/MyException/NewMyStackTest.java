package Exception.MyException;

public class NewMyStackTest {
    public static void main(String[] args) {
        //创建栈对象
        NewMyStack nms = new NewMyStack();

        //压栈
        //在此处对异常进行处理
        try {
            nms.push(new Object());
            nms.push(new Object());
            nms.push(new Object());
            nms.push(new Object());
            nms.push(new Object());
            nms.push(new Object());
            nms.push(new Object());
            nms.push(new Object());
            nms.push(new Object());
            nms.push(new Object());
            nms.push(new Object());//此处异常
        } catch (NewMyStackOperationException e) {
            //这里采用 获取简单异常信息。
            System.out.println(e.getMessage());
        }

        //弹栈

        try {
            nms.pop(new Object());
            nms.pop(new Object());
            nms.pop(new Object());
            nms.pop(new Object());
            nms.pop(new Object());
            nms.pop(new Object());
            nms.pop(new Object());
            nms.pop(new Object());
            nms.pop(new Object());
            nms.pop(new Object());
            nms.pop(new Object());//此处异常
        } catch (NewMyStackOperationException e) {
            System.out.println(e.getMessage());
        }

    }
}
