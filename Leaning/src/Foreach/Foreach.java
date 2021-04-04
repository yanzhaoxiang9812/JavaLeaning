package Foreach;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
        增强for循环：
            for( 元素类型 变量名 : 数组或集合名){
                语句;
            }
 */
public class Foreach {
    public static void main(String[] args) {
        int[] ints = {123,4,45,123,1,23,5,31,3};
        for (int i : ints){
            System.out.println(i);
        }
        //123
        //4
        //45
        //123
        //1
        //23
        //5
        //31
        //3
/*

            集合使用foreach

 */
        List<String> list = new ArrayList<>();
        list.add("j");
        list.add("a");
        list.add("v");
        list.add("a");
        System.out.println("使用迭代器遍历集合list");
        Iterator<String> i = list.iterator();
        while (i.hasNext()){
            String s = i.next();
            System.out.print(s);//java
        }
        System.out.println();



        System.out.println("使用foreach遍历集合list");
        for (String s : list){
            System.out.print(s);//java
        }


    }
}
