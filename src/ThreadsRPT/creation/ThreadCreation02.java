package ThreadsRPT.creation;

public class ThreadCreation02 {

      /*
        Task2: Create a CounterB class which implements the Runnable interface.

        Then, create two threads which prints the alphabet from A to Z.
 */

    public static void main (String[] args) {

        CounterB counterB1 = new CounterB("ahmad");
        CounterB counterB2 = new CounterB("maho");

        Thread thread1 = new Thread(counterB1);
        Thread thread2 = new Thread(counterB2);

        thread1.start();
        thread2.start();

    }
}
