package resource_bundle;

import java.util.ResourceBundle;

/*
                资源绑定器。

 */
public class ResourceBundleTest {
    public static void main(String[] args) {
        //  只能绑定后缀名为properties的properties文件，且该文件必须在类目录下，
        ResourceBundle resourceBundle = ResourceBundle.getBundle("test");// 这里不能写入文件的后缀名。
        String className = resourceBundle.getString("className");
        System.out.println(className);
    }
}
