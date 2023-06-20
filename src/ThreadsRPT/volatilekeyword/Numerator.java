package ThreadsRPT.volatilekeyword;

public class Numerator {

    private volatile static int counter =0;

    public void getOrder(){
        String name = Thread.currentThread().getName();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        synchronized (this){
            counter++;
            System.out.println("Dear " + name + " your number is : " + counter);
        }
    }
}
