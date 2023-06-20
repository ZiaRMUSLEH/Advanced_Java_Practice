package ThreadsRPT.creation;

public class ThreadCreation01  {

    /*
                Task 1: Create a Counter class that extends Thread class.
                Create two threads from Counter class, that will count from 1 to 100.
         */
    public static void main (String[] args) {


        Counter counter1 = new Counter("ahmad ");
        Counter counter2 = new Counter("mahmo ");

        counter1.start();
        counter2.start();



    }
}

class Counter extends Thread{
private String name;

    public Counter (String name) {
        this.name = name;
    }

    @Override
    public void run () {
        System.out.println(this.name+" has started");
        for(int i = 1; i<101; i++){
            System.out.println(this.name+" - " +i);
        }
        System.out.println(this.name+" has finished");
    }

}
