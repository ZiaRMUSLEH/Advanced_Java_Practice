package ThreadsRPT.volatilekeyword;

public class NumeratorRunnerClass {
    public static void main (String[] args) {

        Numerator numerator = new Numerator();

        String[] names = {"zia", "enes","ahmad","mahmood"};

        for (String name: names) {
            Thread thread1 = new Thread(new Runnable() {
                @Override
                public void run () {
                    numerator.getOrder();
                }
            });
            thread1.setName(name);
            thread1.start();

        }

    }
}
