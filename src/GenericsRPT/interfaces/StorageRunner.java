package GenericsRPT.interfaces;
         /*
    Task: Implement a generic interface called Storage that represents a data storage mechanism.
    Then, create a class that implements the Storage interface to store and retrieve items of any type.
     */

public class StorageRunner {
    public static void main (String[] args) {


        Storage<String> stringStorage = new GenericStorage<>();
        stringStorage.store("hello, java");
        System.out.println(stringStorage.retrieve());

        stringStorage.store("hello, generic");
        System.out.println(stringStorage.retrieve());

        Storage<Integer> integerStorage = new GenericStorage<>();
        integerStorage.store(123);
        System.out.println(integerStorage.retrieve());


    }
}
