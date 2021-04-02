package Exception.TryCatch;

/*
关于try..catch中的finally子句:
1、在finally子句中的代码是最后执行的，并且是一定会执行的，即使try语句块中的代码出现了异常。
2、finally语句通常使用在通常在finally语句块中完成资源的释放/关闭。
    因为finally中的代码比较有保障。即使try语句块中的代码出现异常，finally中代码也会正常执行


 */



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FinallyTest1 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            //创键输入流对象
            fis = new FileInputStream("E:\\JavaLeaning\\Leaning\\src\\Test1.txt");

            String s = null;
            s.toString();//这里一定会出现空指针异常。
            //下面的程序可能不会执行，因为上面的程序出现异常，下面的语句不会执行
            //fis.close();//必须要关闭流(流占用资源).
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }catch (NullPointerException e){
            e.printStackTrace();
        }finally {
            System.out.println("=======");
            //流的关闭放在这里比较保险。
            //finally中的代码是一定会执行的。
            //即使try中出现了异常!
            try {//避免空指针异常
                if(fis != null){
                    fis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("over");

    }
}
