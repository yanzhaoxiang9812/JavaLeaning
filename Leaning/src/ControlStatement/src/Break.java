package ControlStatement;

/*
   	break;
  	用于switch和循环语句中
	其作用就是终止整个循环体和终止switch语句
*/
public class Break{
	public static void main(String [] args){
		for(int i = 0 ; i < 5; i++){
		System.out.println("Life' Struggle");
		if( i == 3){
			break;}
		}	
	}
}