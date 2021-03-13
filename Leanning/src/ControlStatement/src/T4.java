package ControlStatement.src;

/*
从控制带输入一个正整数，判断该数字是否为质数。
*/
public class T4{
	public static void main(String [] args){
		java.util.Scanner s = new java.util .Scanner(System.in);
		System.out.println("请输入数字：");
		int shuZi = s.nextInt();
		boolean zhiShu = true;
		for( int i = 2 ; i <shuZi ; i++){
		 	if( shuZi % i == 0){
			zhiShu = false;
			break;
			}
		}
		System.out.println(zhiShu);
	}
}