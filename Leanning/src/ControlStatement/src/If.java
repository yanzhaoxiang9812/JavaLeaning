package ControlStatement.src;

public class If {
	public static void main (String [] args){
		java.util.Scanner s = new java.util .Scanner(System.in);
		System.out.println("�������������䣺");
		int age = s.nextInt();
		if(age < 0 || age >150){
			System.out.println("����������䲻�Ϸ�");
		}else if(age <=5){
		 	System.out.println("�����������ڣ�Ӥ�׶�");
		}else if(age <= 10){
			System.out.println("�����������ڣ���ͯ");
		}else if (age <= 18){
			System.out.println("�����������ڣ�����");
		}else if(age <= 35){
			System.out.println("�����������ڣ�����");
		}else if(age <= 55){
			System.out.println("�����������ڣ�����");
		}else{System.out.println("�����������ڣ�����");}
	}
}