package absolute_path;
/*
            获取文件的绝对路径。

 */
public class AbsolutePath {
    public static void main(String[] args) {
        /*
            Thread.currentThread()线程方法，当前线程对象
            getContextClassLoader()线程对象方法，获取线程的类加载器对象。
            getResource("Test.txt")类加载器对象方法，默认从类的根目录下加载资源。

         */
        String path = Thread.currentThread().getContextClassLoader()
                .getResource("Test.txt").getPath();
        System.out.println(path);
        //  /E:/JavaLeaning/out/production/Leaning/Test.txt

        String path2 = Thread.currentThread().getContextClassLoader()
                .getResource("absolute_path\\test.properties").getPath();
        System.out.println(path2);
        //  /E:/JavaLeaning/out/production/Leaning/absolute_path%5ctest.properties
    }
}
