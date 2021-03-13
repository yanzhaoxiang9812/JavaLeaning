package ControlStatement.src;

/*
计算1+2-3+4-5+6-7....+100的结果
	奇数做减法 偶数做加法
*/
public class T2{
	public static void main(String [] args){
		int s = 1;
		for( int i = 2; i <= 100; i++){
		    if( i % 2 == 0){//偶数
		        s += i;
		    }else{//奇数
		        s -= i;
		            }
		}
		System.out.println(s);
	}	
}