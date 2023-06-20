package ThreadsRPT.synchronization;

import java.util.Arrays;

public class AppointmentApp {

    public static void main (String[] args) {



        String [] names = {"zia","ahmad","mahmod"};
        AppointmentCenter appointmentCenter= new AppointmentCenter();
        for (String w:names) {
            Thread thread1 = new Thread(new Runnable() {
                @Override
                public void run () {
                    Thread.currentThread().setName(w);
                   String name = Thread.currentThread().getName();
                    System.out.println("Dear "+name+" your appointment Date is: "+appointmentCenter.getAppointment());
                }
            });

            thread1.start();

        }

    }



}
