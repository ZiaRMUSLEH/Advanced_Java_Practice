package ThreadsRPT.volatilekeyword;

/*
Task : create a Java program that showcases the usage of the
 volatile keyword in a multi-thread environment.
  The program consists of two threads: a writer thread and a reader thread.
  */

public class VolatileKeyword {
    private static volatile boolean flag = false;

    public static void main (String[] args) {

        Thread writerThread = new Thread(new Runnable() {
            @Override
            public void run () {
                try {
                    Thread.sleep(500);
                    flag=true;
                    System.out.println("writer: flag is set true...");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        Thread readerThread = new Thread(new Runnable() {
            @Override
            public void run () {
                while (!flag){

                }
                System.out.println("Reader: flag is now true Existing ... ");
            }
        });

        writerThread.start();
        readerThread.start();


    }
}
