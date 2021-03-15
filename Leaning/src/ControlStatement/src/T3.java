package ControlStatement;

/*
�ӿ���̨����һ�����������������Ľ׳�
*/
public class T3{
	public static void main(String [] args){
		java.util.Scanner s = new java.util .Scanner(System.in);
		System.out.println("���������֣�");
		int shuZi = s.nextInt();
		int sum = 1;
		for( int i = shuZi ; i > 0 ; i--){
			sum *= i;
		}
		System.out.println(sum);
	}
}