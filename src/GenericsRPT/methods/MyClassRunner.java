package GenericsRPT.methods;

import java.util.ArrayList;
import java.util.List;

public class MyClassRunner {
    public static void main (String[] args) {

        //Task 1 : create a generic method that print any kind of Data Type

        List<Integer> integerLis = new ArrayList<>();
        integerLis.add(1);
        integerLis.add(2);
        integerLis.add(3);
        integerLis.add(4);

        MyClass<List> obj1 = new MyClass<>();
        obj1.printer(integerLis);


        int a = 100;
        MyClass<Integer> obj2 = new MyClass<>();
        obj2.printer(a);





    }
}
