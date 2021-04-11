package Aggregate.Map;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/*
    TreeMap集合是继承了SortedMap接口
    TreeMap底层是一个二叉树。
    TreeSet集合中的元素实际上是放在了TreeMap的key部分。

 */
public class TreeMapTest {
    public static void main(String[] args) {
        TreeMap<Integer,String> treeMap = new TreeMap();
        treeMap.put(1,"一");
        treeMap.put(5,"五");
        treeMap.put(2,"二");
        treeMap.put(4,"四");
        treeMap.put(3,"三");
        Set<Map.Entry<Integer, String>> set = treeMap.entrySet();
        for (Map.Entry<Integer, String> node : set){
            System.out.println(node.getKey() + "=" + node.getValue());
            //      key自动排序
            //  1=一
            //  2=二
            //  3=三
            //  4=四
            //  5=五
        }

    }
}