package ControlStatement.src;

/*
一个数如果恰好灯鱼它的因子之和则为完数，求1000内所有的完数
*/
public class T7{
	public static void main(String [] args){
		for( int i = 1; i <=1000 ; i ++){
			int sum = 0;
			//求 i 的因子
			for(int j = 1 ;  j <= i/2 ; j++){
				if( i % j == 0){
					//此时的 j 就是 i 的因子
					sum += j;
				}
			}
			if( i == sum ){
			System.out.println(i);
			}
		}
	}
}