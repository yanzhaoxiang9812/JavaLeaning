package ControlStatement.src;

public class Switch{
	public static void main (String [] args){
		java.util.Scanner s = new java.util .Scanner(System.in);
		System.out.println("���������ĳɼ���");
		double chengJI = s.nextDouble();
		int i = (int)(chengJI/10);
		String str = "������";
		switch(i){
		case 10: case 9:
		str = "����";
		break;
		case 8: case 7: 
		str = "����";
		break;
		case 6:
		str = "�ռ�������Ŭ��";
		break;
		case 5: case 4: case 3: case 2: case 1: case 0:
 		str = "����ѧ��";
		System.out.println(str);
		}

	}
}