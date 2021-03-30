package Array;
/*
       对数组的扩容：(效率较低，因为涉及了拷贝。)
            先新建一个大容量的数组，然后将小容量数组中的数据一个一个拷贝到大数组当中。
                System.arraycopy();
 */
public class Test4 {
    public static void main(String[] args) {
        //数组拷贝语句如下：
        //System.arraycopy();
        int[] ints = {1,2,3,4,5,};//拷贝源
        //拷贝目标
        int[] ints1 = new int[20];

        //调用arraycopy()方法
        //arraycopy()方法的四个参数：
        //1，拷贝的原数组名 2，源数组开始的元素下标 3，确定新数组的起点元素下标 4，需要拷贝原数组的长度
        System.arraycopy(ints,1,ints1,3,3);
        for (int i = 0 ; i < ints1.length ; i++){
            System.out.println(ints1[i]);
        }

    }
}
