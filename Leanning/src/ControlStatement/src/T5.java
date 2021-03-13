package ControlStatement.src;

/*
从键盘接受一个正整数改正整数作为行数，输出以下图形
    *
   ***
  *****
 *******
*********
*/
public class T5{
	public static void main(String [] args){
		java.util.Scanner s = new java.util .Scanner(System.in);
		System.out.println("请输入行数：");
		int hangShu = s.nextInt();
		//外层循环控制行数
		for(int i = 1 ; i <= hangShu; i++){
			//内层循环打印空格和*
			for(int j = 0 ; j < hangShu - i ;  j++){//输出空格
				System.out.print(" ");
			}
			for(int k = 0; k < i * 2 - 1 ; k++){//输出*
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}