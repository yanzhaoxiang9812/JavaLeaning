package ControlStatement.src;

public class For1 {
	public static void main (String [] args){
		java.util.Scanner s = new java.util .Scanner(System.in);
		System.out.println("���������֣�");
		int shuZi = s.nextInt();
		int sum = 0;
		for(int i = 1; i <=shuZi; i++){
		if(i % 2 == 1){
		sum += i;}
		}
		System.out.println("��Ϊ��"+sum);
	}
}