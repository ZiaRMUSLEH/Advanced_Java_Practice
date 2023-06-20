package ThreadsRPT.creation;

public class ThreadCreation03 {

    public static void main (String[] args) {
        //Task3: Create a thread by using anonymous class.

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run () {
                Thread.currentThread().setName("Nicole");
                String name = Thread.currentThread().getName();
                for (int i = 0; i < 100; i++) {
                    System.out.println(name +": you cant catch me!");

                }
            }
        });



        //Task4: Create a thread by using the lambda expression.
        Thread thread2 = new Thread(()->{
            Thread.currentThread().setName("Gumball");
            String name = Thread.currentThread().getName();
            for (int i = 0; i < 100; i++) {
                try {
                    Thread.sleep(20);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(name+" i will");
            }

        });



        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }



    }




}
