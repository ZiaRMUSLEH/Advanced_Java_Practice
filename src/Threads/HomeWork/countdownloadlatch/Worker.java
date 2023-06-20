package Threads.HomeWork.countdownloadlatch;

import java.util.concurrent.CountDownLatch;

public class Worker extends Thread{

    private String name;
    private CountDownLatch latch;

    public Worker(String name, CountDownLatch latch) {
        this.name = name;
        this.latch = latch;
    }

    @Override
    public void run() {
        System.out.println(name+" - Thread  started ...");
        System.out.println("do some task ...");
        System.out.println(name+" - Thread finihished ....");
        latch.countDown();
    }
}
