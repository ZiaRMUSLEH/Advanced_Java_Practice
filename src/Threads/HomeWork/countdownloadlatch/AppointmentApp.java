package Threads.HomeWork.countdownloadlatch;

/*
Until the countdown is completed, all threads that invoke the "await()" method of a CountDownLatch instance are blocked/waiting. Once the countdown is completed, it can be seen as a gate being opened, and the waiting threads can proceed with their tasks. CountDownLatch can be used in situations where we want to pause the main thread until a certain number of threads (denoted by "n") finish their work, i.e., each thread decreases the counter by one until the counter value reaches zero.

Task: Design an appointment scheduling application (AppointmentCenter).
The application should provide a date one day ahead for each appointment request.
Before the threads that provide appointment dates, allow other threads to perform some tasks before the appointment.

Steps:

Define the worker threads in the Worker class.
Create CountDownLatch and AppointmentCenter objects.
Create threads using a foreach loop.
Instantiate Worker objects.
Start the created Worker threads.
*/

public class AppointmentApp {
    public static void main(String[] args) {
        String[] users = {"Bill", "Steve", "Linus", "Tim", "Larry"};
    }


}
