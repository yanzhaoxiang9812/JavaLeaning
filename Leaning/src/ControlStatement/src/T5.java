package ControlStatement;

/*
�Ӽ��̽���һ������������������Ϊ�������������ͼ��
    *
   ***
  *****
 *******
*********
*/
public class T5{
	public static void main(String [] args){
		java.util.Scanner s = new java.util .Scanner(System.in);
		System.out.println("������������");
		int hangShu = s.nextInt();
		//���ѭ����������
		for(int i = 1 ; i <= hangShu; i++){
			//�ڲ�ѭ����ӡ�ո��*
			for(int j = 0 ; j < hangShu - i ;  j++){//����ո�
				System.out.print(" ");
			}
			for(int k = 0; k < i * 2 - 1 ; k++){//���*
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}