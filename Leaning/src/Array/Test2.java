package Array;
/*
main方法中的String[] args数组
 */
public class Test2 {
    public static void main(String[] args) {
        System.out.println(args.length);
        for(int i = 0; i < args.length ; i++){
            System.out.println(args[i]);
        }
        String username = args[0];
        String password = args[1];
        if(username.equals("YZX") && password.equals("123")){
            System.out.println("s");
        }else System.out.println("f");
    }
}
