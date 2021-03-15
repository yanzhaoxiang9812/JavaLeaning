package ControlStatement;

/*
һ�������ǡ�õ�����������֮����Ϊ��������1000�����е�����
*/
public class T7{
	public static void main(String [] args){
		for( int i = 1; i <=1000 ; i ++){
			int sum = 0;
			//�� i ������
			for(int j = 1 ;  j <= i/2 ; j++){
				if( i % j == 0){
					//��ʱ�� j ���� i ������
					sum += j;
				}
			}
			if( i == sum ){
			System.out.println(i);
			}
		}
	}
}