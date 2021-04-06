package Aggregate.Collection.List;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class ArrayListTest {
    public static void main(String[] args) {

        //      ArrayList 底层是一个Object类型数组。

        //      默认初始化容量为10
        List l1 = new ArrayList();
        System.out.println(l1.size());//0    size方法是返回集合的元素个数而不是集合的容量！！！
        //      数组会自动扩容，扩容为原容量的1.5倍。


        //      指定l2集合容量为20.
        List l2 = new ArrayList(20);

        /*
                数组的优点：检索效率高，往数组末尾添加元素效率高
                数组的缺点：随机增删元素效率低。
         */


        Collection c = new HashSet();
        c.add(1);c.add("JAVA");c.add(true);
        //      ArrayList的特殊构造方法可以将另一个集合传进去。
        List l3 = new ArrayList(c);
        for (int i = 0 ; i < l3.size() ; i++){
            System.out.println(l3.get(i));
            //JAVA
            //1
            //true
        }
    }
}
