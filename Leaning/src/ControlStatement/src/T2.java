package ControlStatement;

/*
����1+2-3+4-5+6-7....+100�Ľ��
	���������� ż�����ӷ�
*/
public class T2{
	public static void main(String [] args){
		int s = 1;
		for( int i = 2; i <= 100; i++){
		    if( i % 2 == 0){//ż��
		        s += i;
		    }else{//����
		        s -= i;
		            }
		}
		System.out.println(s);
	}	
}