package Aggregate.Map;

import java.util.HashMap;
import java.util.Map;

/*
HashMap集合:
        1、HashMap集合底层是哈希表/散列表的数据结构。
        2、哈希表是一个数组和单向链表的结合体。
            数组∶在查询方面效率很高，随机增删方面效率很低。
            单向链表:在随机增删方面效率较高，在查询方面效率很低。
            哈希表将以上的两种数据结构融合在一起，充分发挥它们各自的优点。
        3、HashMap集合初始化容量为16(且只能为2的倍数增长，可增加性能，散布均匀)，默认加载因子为0.75.扩容为原来的二倍

 */
public class HashMapTest {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"yi");
        map.put(2,"er");
        map.put(3,"san");
        map.put(4,"si");
        map.put(1,"yi");
        System.out.println(map.size());
        //输出为：4。如果key重复会覆盖value。

        map.put(null,null);
        System.out.println(map.size());
        //  5   key部分可以为null
        map.put(null,"JAVA");
        System.out.println(map.size());
        //  5   覆盖了上面的null key
        System.out.println(map.get(null));
        //JAVA
    }
}
