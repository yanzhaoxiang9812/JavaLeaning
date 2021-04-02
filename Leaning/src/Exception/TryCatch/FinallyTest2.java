package Exception.TryCatch;

public class FinallyTest2 {
    public static void main(String[] args) {
        /*
        try中没有catch，有fianlly可以。但try不能单独使用。
         */
        //以下代码的执行顺序:
        //先执行try. . .再执行finally.. .
        //最后执行return ( return语句只要执行方法必然结束。)
        try {
            System.out.println("try....");
            //try....
            return;
        }finally {
            System.out.println("fianlly....");
            //fianlly....

            //fianll中的语句一定会执行，尽管try中有return。
        }
    }
}
