package Method;
/*
    ����һ����n���жϱ�n�����С��ָ����
        ��������2�����3
  */

import java.util.Scanner;

public class M4 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("���������֣�");
        int n = s.nextInt();
        while(true){
            n++;
            //��ʱ�ж�i++�Ƿ�Ϊ����
            boolean b = isZhiShu(n);
            if(b){
                System.out.println(n);
                break;
            }

        }


    }
    //�ж������ķ���
    public static boolean isZhiShu(int num){
        for(int i = 2; i < num; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }

}
