package Exception.MyException;
//          自定义栈操作异常类
public class NewMyStackOperationException extends Exception{
    public NewMyStackOperationException() {
    }
    public NewMyStackOperationException(String s) {
        super(s);
    }
}
