package Aggregate.Map;

import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/*
        Properties集合继承了Hashtable，
        Properties中的key，value都是String类型
        Properties被称为属性类对象
 */
public class PropertiesTest {
    public static void main(String[] args) {
        Properties properties = new Properties();

        //  存元素方法setProperty().(实际上是调用了Hashtable的put方法)
        properties.setProperty("1","一");
        properties.setProperty("2","二");
        properties.setProperty("3","三");
        properties.setProperty("4","四");
        properties.setProperty("5","五");

        Set set = properties.keySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            Object o1 = iterator.next();
            //  获取元素方法getProperty()
            Object o2 = properties.getProperty((String) o1);
            System.out.println("key:" + o1 + "," + "value:" + o2 );
            //  key:5,value:五
            //  key:4,value:四
            //  key:3,value:三
            //  key:2,value:二
            //  key:1,value:一
        }
    }
}
