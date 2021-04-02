 package Exception.MyException;

class NewMyStack {
    private Object[] objects;
    private int index;
    public void push(Object o) throws NewMyStackOperationException {
        if(index >= objects.length - 1){
            //此处对原有的错误使用过异常机制
            throw new NewMyStackOperationException("栈已满，压栈失败。");
            //throw关键字 手动抛出异常
        }else {
         objects[++index] = o;
            System.out.println("压栈" + o + "元素成功，栈帧指向" + index);
        }
    }
    public void pop(Object o) throws NewMyStackOperationException {
        if(index < 0){
            //此处对原有的错误使用过异常机制
            throw new NewMyStackOperationException("栈已空，，弹栈失败。");

        }else{
            index--;
            System.out.println("元素" + o + "弹栈成功，栈帧指向" + index);
        }
    }
    public NewMyStack() {
        this.objects = new Object[10];
        this.index = -1;
    }
    public NewMyStack(Object[] objects) {
        this.objects = objects;
    }
    public Object[] getObjects() {
        return objects;
    }
    public void setObjects(Object[] objects) {
        this.objects = objects;
    }

}
