package Aggregate.Collection.List;

/*
            List接口的特有方法。
                add(int index，E element)
                E get(int index)
                E set(int index)
                int indexOf(0bject o)
                int lastIndex0f(0bject o)
                E remove(int index)
                E set(int index, E eLement)

 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListMethod {
    public static void main(String[] args) {
        List l1= new ArrayList();
        l1.add("A");
        l1.add("B");
        l1.add("C");
        l1.add("D");
        Iterator i1 = l1.iterator();
        while (i1.hasNext()){
            System.out.println(i1.next());
        }
        //A
        //B
        //C
        //D


        //      add(int index，E element)
        //      给集合某个位置插入元素。
        l1.add(1,"JAVA");
        Iterator i2 = l1.iterator();
        while (i2.hasNext()){
            System.out.println(i2.next());
        }   //A
            //JAVA
            //B
            //C
            //D


        //      E get(int index)
        //      获取指定位置元素
        System.out.println(l1.get(1));//JAVA


        //      故 List可以使用下列方式遍历。
        for (int i = 0 ; i < l1.size() ; i++){
            System.out.println(l1.get(i));
            //A
            //JAVA
            //B
            //C
            //D
        }


        //      int lastIndex0f(0bject o)
        //      获取某个对象第一次出现的位置
        System.out.println(l1.indexOf("JAVA"));//1


        //      int lastIndex0f(0bject o)
        //      获取某个对象最后一次出现的位置
        l1.add("JAVA");
        for (int i = 0 ; i < l1.size() ; i++){
            System.out.println(l1.get(i));
            //A
            //JAVA
            //B
            //C
            //D
            //JAVA
        }
        System.out.println(l1.lastIndexOf("JAVA"));//5


        //      E remove(int index)
        //      删除某个位置的元素
        l1.remove(5);
        for (int i = 0 ; i < l1.size() ; i++){
            System.out.println(l1.get(i));
            //A
            //JAVA
            //B
            //C
            //D
        }


        //      E set(int index)
        //      修改某位置元素
        System.out.println(l1.get(4));//D
        l1.set(4,"Life's A Struggle");
        System.out.println(l1.get(4));//Life's A Struggle
    }
}
