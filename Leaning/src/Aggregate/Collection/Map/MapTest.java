package Aggregate.Map;


/*
      Map集合的特点：
            1.以键值对方式存储元素，(key,value)
            2.key和value都是引用数据类型，都保存了对象内存地址。
            3.key主导value。
            4.所有元素无序且不可重复

      Map常用方法：
            v       put(K key, v value)                 向Map集合中添加键值对
            v       get(Object key)                     通过key获取value
            void    clear()                             清空Map集合
            boolean containsKey(object key)             判断Map中是否包含某个key
            boolean containsValue(object value)         判断Map中是否包含某个value
            booLean isEmpty()                           判断Map集合中元素个数是否为0
            set<K>  keySet()                            获取Map集合所有的key，返回一个Set集合
            v       remove(Object key)                  通过key删除键值对
            int     size()                              返回Map集合的元素个数
            Collection<V> values()                      获取Map集合所有value，返回Collection集合
            Set<Nap.Entry<K,V>> entrySet()              将Map集合转为Set集合

 */


import java.util.*;

public class MapTest {
    public static void main(String[] args) {
        Map m1 = new HashMap();
        //      向Map集合中添加键值对
        m1.put(1,"一");
        m1.put(2,"二");
        m1.put(3,"三");
        m1.put(4,"四");

        //          Map集合的遍历
        //          获取key，通过key遍历各各value
        Set set1 = m1.keySet();
        Iterator iterator1 = set1.iterator();
        while (iterator1.hasNext()){
            Object o1 = iterator1.next();
            Object o2 = m1.get(o1);
            System.out.println("key+" + o1 + "," + "value:" + o2 );
            //  key:1,value:一
            //  key:2,value:二
            //  key:3,value:三
            //  key:4,value:四
        }

        //      另一种遍历方式
        //      直接把Map集合转换为Set集合
        Map<Integer, String> m2 = new HashMap<>();
        m2.put(5,"五");
        m2.put(6,"六");
        m2.put(7,"七");
        m2.put(8,"八");
        m2.put(9,"九");
        m2.put(10,"十");
        Set<Map.Entry<Integer, String>> sett = m2.entrySet();
        for (Map.Entry<Integer, String> node : sett){
            System.out.println(node.getKey() + "------->" + node.getValue());
            //  5------->五
            //  6------->六
            //  7------->七
            //  8------->八
            //  9------->九
            //  10------->十
        }

        //     通过key删除键值对
        m1.remove(1);

        Set set2 = m1.keySet();
        Iterator iterator2 = set2.iterator();
        while (iterator2.hasNext()){
            Object o1 = iterator2.next();
            Object o2 = m1.get(o1);
            System.out.println("key+" + o1 + "," + "value:" + o2 );
            //  key+2,value:二
            //  key+3,value:三
            //  key+4,value:四
        }

        //      清空Map集合
        m1.clear();
        System.out.println(m1.size());//    0

        //      向Map集合中添加键值对
        m1.put(1,"一");
        m1.put(2,"二");
        m1.put(3,"三");
        m1.put(4,"四");

        //      判断Map中是否包含某个key
        System.out.println(m1.containsKey(1));//    true
        System.out.println(m1.containsKey(6));//    false

        //     判断Map中是否包含某个value
        System.out.println(m1.containsValue("一"));//    true
        System.out.println(m1.containsValue("五"));//    false

        //      判断Map是否为空
        System.out.println(m1.isEmpty());//     false

        //      获取Map集合所有的key，返回一个Set集合
        Set set = m1.keySet();
        for (Object obj : set){
            System.out.println(obj);
            //  1
            //  2
            //  3
            //  4
        }

        //      获取Map集合所有value，返回Collection集合
        Collection collection = m1.values();
        for (Object ojb : collection){
            System.out.println(ojb);
            //  一
            //  二
            //  三
            //  四
        }

        Set set3 = m1.entrySet();
        for (Object obj : set1){
            System.out.println(obj);
            //  1=一
            //  2=二
            //  3=三
            //  4=四
        }

    }
}
