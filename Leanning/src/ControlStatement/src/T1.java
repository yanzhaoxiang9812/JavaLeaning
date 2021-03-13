package ControlStatement.src;

/*
  求解1000以内所有不能被7整除所有数的和
*/
public class T1{
	public static void main(String [] args){
		int sum=0;
		for( int i = 1; i <= 1000; i++ ){
			if( i%7 != 0 ){
			sum +=i;
			}
		}
		System.out.println(sum);
	}	
}