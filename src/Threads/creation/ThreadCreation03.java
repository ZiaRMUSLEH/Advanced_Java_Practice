package Threads.creation;

public class ThreadCreation03 {


    /*
        Task3: Create a thread by using anonymous class.

        Create a thread by using the lambda expression.
 */

    public static void main(String[] args) {

        Thread thread1 = new Thread(new Runnable() {

            @Override
            public void run() {

                Thread.currentThread().setName("Nicole");
                String name =   Thread.currentThread().getName();

                for (int i = 0; i <100 ; i++) {
                    System.out.println(name+ ": You can not catch me!");

                }

            }
        });

        Thread thread2= new Thread(()-> {
            Thread.currentThread().setName("Gumball");
            String name =   Thread.currentThread().getName();
            for (int i = 0; i <100 ; i++) {
                try {
                    Thread.sleep(20);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(name+ ": I will ");

            }
        });

        thread1.start();
        thread2.start();


        //JOIN()
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }




}
