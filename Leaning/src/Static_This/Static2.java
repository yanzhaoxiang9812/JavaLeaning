package Static_This;
/*
        什么时候变量声明为实例或静态
            静态变量：如果这个类型的所有对象的某个属性值都相同，则一般定义为静态变量，节省空间。
            实例变量：如果这个类型的所有对象的某个属性值都不同，则一般定义为实例变量。
 */
public class Static2 {
    public static void main(String [] args){
        System.out.println(Chinese.country);//country是Chinese类中的静态变量以“类名.”访问
        Chinese c1 = new Chinese("666","张三");
        System.out.println(c1.idCard + "   " + c1.name);
        //  idCard和name实例变量要new对象，并以“引用.”访问。
    }
}
//定义一个类：中国人
class Chinese{
    //身份证号码，每人身份证号码不同，所以要用实例变量
    String idCard;
    //姓名，每人姓名不同，所以要用实例变量
    String name;
    //国籍，这个类是中国人，中国人的国籍都是中国，不会因为对象的变化而变化，属于类的特征，则不用定义为实例变量，防止占用内存
    static String country = "中国";
    //此时大的country变量为静态变量，静态变量在类加载是初始化的，不需要new的对象，内存空间就已经开辟了，存储在方法区
    public Chinese(){}
    public Chinese(String s1,String s2){
        idCard = s1;
        name = s2;
    }
}
