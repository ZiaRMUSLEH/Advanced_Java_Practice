package GenericsRPT.classess;
                    /*
            Task: Implement a generic class called Pair that represents a pair of elements.
            The Pair class should have two type parameters, T and U, representing the types of the two elements in the pair.
            Then, create a runner class to demonstrate the usage of the Pair class with different types.
            */


public class PairRunner {
    public static void main (String[] args) {

        //scenario 1 : Pairs of String
        Pair<String,String> stringPair = new Pair<>("Zia","Musleh");
        System.out.println("Full name: "+stringPair.getFirst()+" "+stringPair.getSecond());

        //Scenario 2: Pairs of Integers
        Pair<Integer, Integer> integerPair = new Pair<>(123,321);
        System.out.println("total of pairs: "+(integerPair.getFirst()+integerPair.getSecond()));


        //Scenario 3: Pairs of Custom Objects
        //Assuming we have a Person class with name and age fields
        Person person1 = new Person("zia",29);
        Person person2 = new Person("lutfu",28);

        Pair <Person, Person> personPair = new Pair<>(person1, person2);

        System.out.println("first person: "+personPair.getFirst().getName()+" "+personPair.getFirst().getAge());
        System.out.println("second person: "+personPair.getSecond().getName()+" "+personPair.getSecond().getAge());



    }
}
