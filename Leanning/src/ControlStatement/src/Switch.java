package ControlStatement.src;

public class Switch{
	public static void main (String [] args){
		java.util.Scanner s = new java.util .Scanner(System.in);
		System.out.println("请输入您的成绩：");
		double chengJI = s.nextDouble();
		int i = (int)(chengJI/10);
		String str = "不及格";
		switch(i){
		case 10: case 9:
		str = "优秀";
		break;
		case 8: case 7: 
		str = "良好";
		break;
		case 6:
		str = "刚及格仍需努力";
		break;
		case 5: case 4: case 3: case 2: case 1: case 0:
 		str = "你退学吧";
		System.out.println(str);
		}

	}
}