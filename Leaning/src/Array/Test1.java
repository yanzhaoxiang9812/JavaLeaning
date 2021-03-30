package Array;
/*
1、Java语言中的数组是一种引用数据类型。不属于基本数据类型。数组的父类是object。
2、数组实际上是一个容器，可以同时容纳多个元素。(数组是一个数据的集合。)
3、数组当中可以存储v基本数据类型的数据，也可以存储"引用数据类型”的数据。
4、数组因为是引用类型，所以数组对象是堆内存当中。(数组是存储在堆当中的)
5、数组当中如果存储的是"java对象”的话，实际上存储的是对象的引用（内存地址)”
6、数组一旦创建，在java中规定，长度不可变。
7、数组的分类:一维数组、二维数组、三维数组、多维数组...
8、所有的数组对象都有Length属性(java自带的)，用来获取数组中元素的个数。
9、java中的数组要求数组中元素的类型统一。比如int类型数组只能存储int类型，Person类型数组只能存储Person类型。
10、数组在内存方面存储的时候，数组中的元素内存地址是连续的。
11、所有的数组都是拿第一个小方框的内存地址”作为整个数组对象的内存地址。(数组中首元素的内存地址作为整个数组的内存地址)
12、数组中每一个元素都是有下标的，下标从O开始，以1递增。最后一个元素的下标是:length - 1
13、数组这种数据结构的优点和缺点是什么?
    优点:
        查询/查找/检索某个下标上的元秦时效率极高。可以说是查询效率最高的一个数据结构。
                 为什么检索效率高?
            第一:每一个元素的内存地址在空间存储上是连续的。
            第二:每一个元素类型相同，所以占用空间大小一样。
            第三:知道第一个元素内存地址，知道每一个元秦占用空间的大小，又知道下标，所以通过
            偏移量就可以计算出某个下标上元素的内存地址。直接通过内存地址定位元素，所以数组的检索效率是最高的。
    缺点：
        1，由于为了保证数组中每个元素的内存地址连续，所以在数组上随机删除或者增加元素的时候，
           效率较低，因为随机增删元素会涉及到后面元素统一向前或者向后位移的操作。(除过对最后一个个元素的增删操作)
        2，数组不能存储大数据量， 因为很难在内存空间上找到一块特别大的连续的内存空间。
14、怎么声明/定义一个一维数组?
        语法格式:
            int[ ] array1;
            double[ ] array2;
            boolean[ ] array3;
            string[ ] array4;
            object[ ] array5;
15、怎么初始化一个一维数组呢?
        包括两种方式:静态初始化一维数组，动态初始化一维数组。
             静态初始化语法格式:
                int[ ] array = {100，2100，300，55};
             动态初始化语法格式:
                int[ ] array = new int[5];//这里的5表示数组的元素个数。



 */
public class Test1 {
    public static void main(String[] args) {
        //声明一个int类型的数组，使用静态
        int [] a1 = {1,2,3,4,5,6,7,7};
        //每个数字都有length属性
        System.out.println(a1.length);
        //通过下标对元素操作
        System.out.println("1:" + a1[0]+"   2:"+a1[1]+" 6:"+a1[7]);
        a1[0] = 6;
        System.out.println("1:"+a1[0]);
        //遍历数组
        for(int i =0; i < a1.length ; i++){
            System.out.println(a1[i]);
        }
        //System.out.println(a1[9]);//下表越界异常：ArrayIndexOutOfBoundsException
        for(int i = a1.length -1 ; i >= 0 ; i--){
            System.out.println(a1[i]);
        }


        //声明一个int类型数组，动态
        int [] a2 = new int [5];//默认值为0
        for(int i = 0; i<a2.length;i++) System.out.println(a2[i]);
        Object[] objects = new Object[4];
        for(int i = 0; i<objects.length;i++) System.out.println(objects[i]);


        //存储object，采用静态初始化呢?
        Object o1 = new Object();
        Object o2 = new Object();
        Object o3 = new Object();
        Object[] objects1 = {o1,o2,o3};
        for (int i = 0; i < objects1.length; i++) {
            System.out.println(objects1[i]);
        }

    }
}
