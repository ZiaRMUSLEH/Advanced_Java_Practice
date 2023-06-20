package Threads.HomeWork.semaphorex;

import java.util.concurrent.Semaphore;

public class Person extends Thread {
    private String name;
    private Semaphore semaphore;

    public Person (String name, Semaphore semaphore) {
        this.name = name;
        this.semaphore = semaphore;
    }

    @Override
    public void run () {

        try {System.out.println(name + " wants to enter fitting room");
            semaphore.acquire();
            System.out.println(name+" entered to the fitting room");
            Thread.sleep(5000);
            System.out.println(name+" left the fitting room");
            semaphore.release();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
