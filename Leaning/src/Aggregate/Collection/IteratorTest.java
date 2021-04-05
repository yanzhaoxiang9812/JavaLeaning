package Aggregate.Collection;

/*
                            迭代器
 */

/*
          boolean           hasNext()   如果迭代具有更多元素，则返回 true 。
          E	                next()      返回迭代中的下一个元素
          default void	    remove()    从底层集合中删除此迭代器返回的最后一个元素
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class IteratorTest {
    public static void main(String[] args) {

        //      创建集合对象
        Collection collection = new ArrayList();
        //      给集合内加入元素
        collection.add(123);
        collection.add(3.14);
        collection.add("哈哈哈");
        collection.add(new Object());
        collection.add(true);

        //      获取集合对象的迭代器
        java.util.Iterator iterator = collection.iterator();

        //      对集合迭代并输出所有元素
        while (iterator.hasNext()){
            System.out.println(iterator.next());//.next()方法返回的是必须是Object类型
            //123
            //3.14
            //哈哈哈
            //java.lang.Object@1b6d3586
            //true
        }

        //  集合发生改变，迭代器必须重新获取！！！

        Collection collection1 = new HashSet();
        //HashSet的特点‘无序’且‘不可重复’
        collection1.add(22);
        collection1.add(61);
        collection1.add(33);
        collection1.add(55);
        collection1.add(16);
        collection1.add(43);
        collection1.add(43);
        //存了7个元素,出现相同元素存不进去
        System.out.println(collection1.size());//6
        java.util.Iterator iterator1= collection1.iterator();
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
            //16
            //33
            //22
            //55
            //43
            //61
        }
    }
}
