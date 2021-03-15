package ControlStatement;

/*
  ���1000�������в��ܱ�7�����������ĺ�
*/
public class T1{
	public static void main(String [] args){
		int sum=0;
		for( int i = 1; i <= 1000; i++ ){
			if( i%7 != 0 ){
			sum +=i;
			}
		}
		System.out.println(sum);
	}	
}