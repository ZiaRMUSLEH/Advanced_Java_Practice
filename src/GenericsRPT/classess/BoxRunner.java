package GenericsRPT.classess;

public class BoxRunner {
    public static void main (String[] args) {
        // Task 1 : Create a Box to store and retrieve strings
        Box<String> stringBox = new Box<>("zia");
        System.out.println(stringBox.getItem()+" item is in my stringBox");
        stringBox.setItem("ahmad");
        System.out.println("now "+stringBox.getItem()+" is in my stringBox");


        // Task 2 : Create a Box to store and retrieve integers
        Box<Integer> integerBox = new Box<>(123);
        System.out.println(integerBox.getItem()+" item is in my integerBox");
        integerBox.setItem(456);
        System.out.println("now "+integerBox.getItem()+" is in my integerBox");
    }
}
