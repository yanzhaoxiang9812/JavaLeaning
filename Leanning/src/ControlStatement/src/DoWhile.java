package ControlStatement.src;

/*
	do {
	循环体；
	}while(布尔表达式);
	先do一次，再判断。
	至少会do一次
*/
public class DoWhile{	
	public static void main(String[] args){
			java.util.Scanner s = new java.util .Scanner(System.in);
			System.out.println("请输入口令：");
			int i = s.nextInt();
			do{
			System.out.println("Life's Struggle");
			i++;
			}while(i < 6);
			System.out.println("Life is motherfucker moive");
	}
}
/*
请输入口令：
1
Life's Struggle
Life's Struggle
Life's Struggle
Life's Struggle
Life's Struggle
Life is motherfucker moive
*/