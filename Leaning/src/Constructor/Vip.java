package Constructor;
/*
            ****构造方法****
                * 一 创建对象
                * 二 给实例变量赋值
 */
public class Vip {
    int id;
    String name;
    String birth;
    boolean sex;
    public Vip(){//无参构造方法
        /*  没有手动给实例变量赋值，系统会自动给实例变量赋默认值

        id = 0;
        name = null;
        birth = null;
        sex = false;

         */
    }
    public Vip(int huiYuanHao,String xingMing){//有参构造方法
        id = huiYuanHao;
        name = xingMing;
    }
    public Vip(int huiYuanHao,String xingMing,String shengRi){//有参构造方法
        id = huiYuanHao;
        name = xingMing;
        birth = shengRi;
    }
    public Vip(int huiYuanHao,String xingMing,String shengRi,boolean xingBie){//有参构造方法
        id = huiYuanHao;
        name = xingMing;
        birth = shengRi;
        sex = xingBie;
    }
}
