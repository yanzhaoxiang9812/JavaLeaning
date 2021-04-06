package Aggregate.Collection.Set;

import java.util.HashSet;
import java.util.Set;


/*
            HashSet集合的特点：
                1、存顺序和取顺序不同。
                2、不可重复。
                3、放到HashSet集合中的元素实际上是放到HashMap集合的key部分了。

 */

public class HashSetTset {
    public static void main(String[] args) {
        Set<String> stringHashSet = new HashSet<>();
        stringHashSet.add("java");
        stringHashSet.add("353teger");
        stringHashSet.add("java");
        stringHashSet.add("53452yerte");
        stringHashSet.add("jyrtyrt");
        stringHashSet.add("asdqw");
        for (String s : stringHashSet){
            System.out.println(s);
        }
        //jyrtyrt
        //java
        //asdqw
        //53452yerte
        //353teger
    }
}
