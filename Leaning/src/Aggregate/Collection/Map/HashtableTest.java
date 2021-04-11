package Aggregate.Map;

import java.util.Hashtable;
import java.util.Map;

/*
        Hashtable集合底层为哈希表结构。
        Hashtable集合是线程安全的。
        Hashtable集合key，value都不能为null
        初始化容量为：11，默认加载因子0.75.扩容为原容量二倍加一。

 */

public class HashtableTest {
    public static void main(String[] args) {
        Map map = new Hashtable();
        map.put(null,1);
        System.out.println(map.size());
        //  NullPointerException
        map.put(1,null);
        System.out.println(map.size());
        //  NullPointerException
    }
}
