package Aggregate.Collection;

/*
        Collection接口的常用方法
 */

import java.util.ArrayList;
import java.util.Collection;

public class CollectionTest {
    public static void main(String[] args) {
        //创建一个集合对象
        Collection collection = new ArrayList();

        //      给集合内加入元素方法、
        collection.add(123);
        collection.add(3.14);
        collection.add("123");
        collection.add(new Object());
        collection.add(true);

        //      返回集合元素个数
        System.out.println(collection.size());//5

        //      删除集合某个元素
        collection.remove(123);
        System.out.println(collection.size());//4

        //      清除集合内所有元素
        collection.clear();
        System.out.println(collection.size());//0

        collection.add(123);
        collection.add(3.14);
        collection.add("java");
        collection.add(new Object());
        collection.add(true);

        //      判断集合内是否包含某元素 返回布尔类型
        System.out.println(collection.contains(123));//true
        String s = "javaNB";
        collection.add(s);
        String s1 = new String("javaNB");
        //底层是调用了equlas方法
        System.out.println(collection.contains(s1));//true

        //      判断集合是否为 空返回布尔类型
        System.out.println(collection.isEmpty());//false

        //      把集合转化为数组方法
        Object[] o = collection.toArray();
        for (int i = 0 ; i < o.length ; i++ ){
            Object o1 = o[i];
            System.out.println(o1);
            //123
            //3.14
            //java
            //java.lang.Object@1b6d3586
            //true
        }

        Collection collection1 = new ArrayList();
        collection1.add(456);
        collection1.add(6.166);
        collection1.add("LIFE");
        collection1.add(new Object());
        collection1.add(false);


        //      将指定集合中的所有元素添加到此集合
        collection1.addAll(collection);
        System.out.println(collection1.size());//11

        //      删除存在的指定元素。
        collection1.remove("LIFE");
        //底层是调用了equlas方法
        System.out.println(collection1.size());//10

    }
}
