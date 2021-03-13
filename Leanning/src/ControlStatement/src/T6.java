package ControlStatement.src;

/*
每天2.5，第5天或是5倍数的天数，-6，多少天能够100
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