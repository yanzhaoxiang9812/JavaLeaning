package Constructor;

public class Vip_Test {
    public static void main(String[]args){
        //测试调用构造方法
        Vip v1 = new Vip();
        System.out.println(v1.id);//0
        System.out.println(v1.name);//null
        System.out.println(v1.birth);//null
        System.out.println(v1.sex);//false
        System.out.println("-----------------------------------");
        Vip v2 = new Vip(123,"钢铁侠");
        System.out.println(v2.id);//123
        System.out.println(v2.name);//钢铁侠
        System.out.println(v2.birth);//null
        System.out.println(v2.sex);//false
        System.out.println("-----------------------------------");
        Vip v3 = new Vip(456,"绿巨人","2000-01-01");
        System.out.println(v3.id);//456
        System.out.println(v3.name);//绿巨人
        System.out.println(v3.birth);//2000-01-01
        System.out.println(v3.sex);//false
        System.out.println("-----------------------------------");
        Vip v4 = new Vip(789,"雷神","3000-01-01",true);
        System.out.println(v4.id);//789
        System.out.println(v4.name);//雷神
        System.out.println(v4.birth);//3000-01-01
        System.out.println(v4.sex);//true
        System.out.println("-----------------------------------");
    }
}
