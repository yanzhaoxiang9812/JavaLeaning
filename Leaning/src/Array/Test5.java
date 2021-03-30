package Array;
/*
        二维数组其实是一个特殊的一维数组，特殊在这个一维数组当中的每一个元素是一个一维数组。
            静态初始化：
                int[][] array = { {1,2,3}, {4,5,6,}, {7,8,9} };
 */
public class Test5 {
    public static void main(String[] args) {
        //一维数组
        int[] i1 = {1,2,3};

        //静态初始化一个二维数组
        //以下代码中里面是三个一维数组。
        int[][] i2 = {
                {1,2,3},
                {4,5,6,},
                {7,8,9}
        };

        //二维数组的操作
        int[][] a = {
            {1,2,3},
            {4,5,6,7,8},
            {2,2,1,1,1},
            {1}
        };
        //取
        System.out.println(a[0][2]);//3
        System.out.println(a[1][4]);//8

        //二维数组的遍历
        String[][] strings = {
                {"a","b","c"},
                {"d","e"},
                {"f","g","h","i","j"}
        };
        for(int i = 0 ; i < strings.length; i++){

            for(int j = 0 ; j < strings[i].length ; j++){

                System.out.print( strings[i][j] + "    ");
            }

            System.out.println();
        }


        //动态初始化二维数组
        int[][] i3 = new int[3][4];
        //三个一维数组，每个一维数组有四个元素。
        for(int i = 0 ; i < i3.length; i++){

            for(int j = 0 ; j < i3[i].length ; j++){

                System.out.print( i3[i][j] + "    ");
            }

            System.out.println();
        }
    }
}
