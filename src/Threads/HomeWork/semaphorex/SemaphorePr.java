package Threads.HomeWork.semaphorex;
/*
Semaphore is used to limit the number of threads that can access a resource.
Unlike synchronized, which allows only one thread to lock and execute a synchronized block/method,
 Semaphore allows n threads to proceed and blocks the others.

Scenario: Fitting room / Trial counter
There are 3 fitting rooms in a store. 5 people want to use the fitting room.
Use 5 threads for these 5 operations.

Steps:

Define a Semaphore object with a value of 3 (number of threads).
Create threads in the Person class.
In the SemaphorePr class, create 5 instances of Person (these are actually threads).
Start the threads you created as Person.
*/


import java.util.concurrent.Semaphore;

public class SemaphorePr {
    public static void main (String[] args) {

        Semaphore semaphore = new Semaphore(3);

        Person person1 = new Person("john",semaphore);
        Person person2 = new Person("mike",semaphore);
        Person person3 = new Person("lara",semaphore);
        Person person4 = new Person("tom",semaphore);
        Person person5 = new Person("jack",semaphore);

        person1.start();
        person2.start();
        person3.start();
        person4.start();
        person5.start();
    }
}
