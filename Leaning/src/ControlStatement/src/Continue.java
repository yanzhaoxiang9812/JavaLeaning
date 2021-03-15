package ControlStatement;

public class Continue{
	public static void main(String [] args){	
		for(int i = 0; i < 9 ; i++){
		if( i == 6){ // ��������������ֹ����ѭ��ֱ�ӽ�����һѭ��
		continue;  //  �������6,��7.8.9�ճ����
		}	
		System.out.println(i);
		}
	}
}
