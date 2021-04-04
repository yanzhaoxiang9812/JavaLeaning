package Generic;

import java.util.ArrayList;
import java.util.List;

/*
                自动类型推断机制(又称为钻石表达式)
 */
public class GenericTest3 {
    public static void main(String[] args) {
        //  前面的”<>"编写了对象类型，则”=“后面的”<>“可以省略。
        List<Animal> animals = new ArrayList<>();
    }
}
