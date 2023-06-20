package ThreadsRPT.countdownlatch;

import java.time.LocalDate;

public class AppointmentCenter {
    private volatile LocalDate day = LocalDate.now();

    public synchronized LocalDate getAppointment(){
        day= day.plusDays(1);
        return day;
    }
}
