package generics.method;

import java.util.List;

public class ArraysUtilsRunner {
    public static void main (String[] args) {
        //task find the maximum integer or decimal with generic method


        Integer [] integers= {1,2};
        Double [] doubles = {1.2,2.5,4.5};

        System.out.println("Maximum number: "+ArraysUtils.findMaximum(integers));
        System.out.println("Maximum number: "+ArraysUtils.findMaximum(doubles));

    }
}
