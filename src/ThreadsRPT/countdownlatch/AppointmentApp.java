package ThreadsRPT.countdownlatch;

import java.util.concurrent.CountDownLatch;


        /*Define the worker threads in the Worker class.
        Create CountDownLatch and AppointmentCenter objects.
        Create threads using a foreach loop.
        Instantiate Worker objects.
        Start the created Worker threads.
        */

public class AppointmentApp {
    public static void main (String[] args) {

        String[] users = {"Bill", "Steve", "Linus", "Tim", "Larry"};

        CountDownLatch latch = new CountDownLatch(users.length);

        AppointmentCenter appointmentCenter= new AppointmentCenter();



        for (String user: users) {
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run () {
                    try {
                        latch.await();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println("dear "+Thread.currentThread().getName()+
                            " your appointment date is "+appointmentCenter.getAppointment());
                }
            });

            thread.setName(user);
            thread.start();
        }


        //String[] users = {"Bill", "Steve", "Linus", "Tim", "Larry"};
                    Worker worker1 = new Worker("Bill",latch);
                    Worker worker2 = new Worker("Steve",latch);
                    Worker worker3 = new Worker("Linus",latch);
                    Worker worker4 = new Worker("Tim",latch);
                    Worker worker5 = new Worker("Larry",latch);

            worker1.start();
            worker2.start();
            worker3.start();
            worker4.start();
            worker5.start();

            }

        }





