package ControlStatement;

/*
�ӿ��ƴ�����һ�����������жϸ������Ƿ�Ϊ������
*/
public class T4{
	public static void main(String [] args){
		java.util.Scanner s = new java.util .Scanner(System.in);
		System.out.println("���������֣�");
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