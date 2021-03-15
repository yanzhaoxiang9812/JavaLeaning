package ControlStatement;

/*
ÿ��2.5����5�����5������������-6���������ܹ�100
*/
public class T6{
	public static void main(String [] args){
		double money = 0;
		int day = 0;
		while( money < 100.0){
			day++;
			money += 2.5;
			if( day % 5 == 0){
				money -= 6.0;
			}
		}
		System.out.println(day);
	}
}