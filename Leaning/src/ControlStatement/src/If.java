package ControlStatement.src;

public class If {
	public static void main (String [] args){
		java.util.Scanner s = new java.util .Scanner(System.in);
		System.out.println("请输入您的年龄：");
		int age = s.nextInt();
		if(age < 0 || age >150){
			System.out.println("您输入的年龄不合法");
		}else if(age <=5){
		 	System.out.println("您的年龄属于：婴幼儿");
		}else if(age <= 10){
			System.out.println("您的年龄属于：儿童");
		}else if (age <= 18){
			System.out.println("您的年龄属于：少年");
		}else if(age <= 35){
			System.out.println("您的年龄属于：青年");
		}else if(age <= 55){
			System.out.println("您的年龄属于：中年");
		}else{System.out.println("您的年龄属于：老年");}
	}
}