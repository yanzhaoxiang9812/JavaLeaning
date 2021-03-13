package ControlStatement.src;

/*
  实现99乘法表
*/
public class For2{
	public static void main(String[] args){
		int sum;
		for(int i = 1 ; i <10 ; i++){
			for(int k = 1 ; k <=i ; k++){
			sum = k*i;
			System.out.print( k + "*" + i + "=" + sum + "\t" );
			}
		System.out.print("\n");
		}
	}
}