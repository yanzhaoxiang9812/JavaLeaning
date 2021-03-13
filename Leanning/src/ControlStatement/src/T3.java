package ControlStatement.src;

/*
从控制台输入一个正整数，求解该数的阶乘
*/
public class T3{
	public static void main(String [] args){
		java.util.Scanner s = new java.util .Scanner(System.in);
		System.out.println("请输入数字：");
		int shuZi = s.nextInt();
		int sum = 1;
		for( int i = shuZi ; i > 0 ; i--){
			sum *= i;
		}
		System.out.println(sum);
	}
}