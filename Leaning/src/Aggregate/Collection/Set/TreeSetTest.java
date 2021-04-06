package Aggregate.Collection.Set;

/*

            TreeSet集合存储元素特点:
                存顺序和取顺序不同且不可重复的，但是存储的元素可以自动按照大小顺序排序!称为:可排序集合。


 */

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        Set<Integer> integerSet = new TreeSet<>();
        integerSet.add(1);
        integerSet.add(6);
        integerSet.add(7);
        integerSet.add(4);
        integerSet.add(7);//添加了两个7
        integerSet.add(9);
        integerSet.add(0);
        integerSet.add(3);
        for (Integer integer : integerSet){
            System.out.println(integer);
        }
        //0
        //1
        //3
        //4
        //6
        //7
        //9

        //      自定义类型的元素自动排序
        //      该自定义类型必须实现Comparable接口
        //      并实现compareTo方法，编写比较规则。
        A a1 = new A(123);
        A a2 = new A(723);
        A a3 = new A(423);
        A a4 = new A(623);
        A a5 = new A(923);
        A a6 = new A(23);
        Set<A> set = new TreeSet();
        set.add(a1);
        set.add(a2);
        set.add(a3);
        set.add(a4);
        set.add(a5);
        set.add(a6);
        for (A a : set) {
            System.out.println(a);
            //A{anInt=23}
            //A{anInt=123}
            //A{anInt=423}
            //A{anInt=623}
            //A{anInt=723}
            //A{anInt=923}
        }

        //      使用匿名内部类实现 Comparator接口和方法
        TreeSet<B> treeSet = new TreeSet<B>(new Comparator<B>() {
            @Override
            public int compare(B o1, B o2) {
                return o1.i - o2.i;
            }
        });
        treeSet.add(new B(13));
        treeSet.add(new B(93));
        treeSet.add(new B(73));
        treeSet.add(new B(3));
        for ( B b : treeSet ) {
            System.out.println(b);
            //B{i=3}
            //B{i=13}
            //B{i=73}
            //B{i=93}
        }
    }
}
class A implements Comparable<A>{
    int anInt;
    public A(int anInt) {
        this.anInt = anInt;
    }

    @Override
    public int compareTo(A a) {
        return this.anInt - a.anInt;
    }

    @Override
    public String toString() {
        return "A{" +
                "anInt=" + anInt +
                '}';
    }
}
class B{
    int i;

    public B(int i) {
        this.i = i;
    }

    @Override
    public String toString() {
        return "B{" +
                "i=" + i +
                '}';
    }
}