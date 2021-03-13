package ControlStatement.src;

public class Continue{
	public static void main(String [] args){	
		for(int i = 0; i < 9 ; i++){
		if( i == 6){ // 当满足条件及终止本次循环直接进入下一循环
		continue;  //  跳过输出6,但7.8.9照常输出
		}	
		System.out.println(i);
		}
	}
}
