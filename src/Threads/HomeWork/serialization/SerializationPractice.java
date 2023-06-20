package Threads.HomeWork.serialization;


// Task: Create objects of type Book, write these objects to the "books.txt" file,
// and then read the objects from this file.

// Steps:
// 1. Define the Book class with the necessary attributes (e.g., title, author, year).
// 2. Create Book objects with different values.
// 3. Write the Book objects to the "books.txt" file using file I/O operations.
// 4. Read the Book objects from the "books.txt" file and store them in a collection or array.
// 5. Process or display the Book objects as needed.

import java.io.*;

public class SerializationPractice {
    public static void main(String[] args) {

       Book book1 = new Book("java","suleyman",2005);
       Book book2 = new Book("Ad_java","frotan",2023);
       Book book3 = new Book("JDBC","sara",2022);

       //writeObject(book1,book2,book3);
        readObject("books.txt");
    }

    // let's create a method to write object
    public static void writeObject(Book book1, Book book2, Book book3) {
        System.out.println("Book objects are being written");
        try {
            FileOutputStream fos = new FileOutputStream("books.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(book1);
            oos.writeObject(book2);
            oos.writeObject(book3);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    // let's create a method to readObject - DESERIALIZATION
    public static void readObject(String filename) {
        try {
            FileInputStream fis = new FileInputStream(filename);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Book book1 = (Book) ois.readObject();
            Book book2 = (Book) ois.readObject();
            Book book3 = (Book) ois.readObject();

            System.out.println(book1);
            System.out.println(book2);
            System.out.println(book3);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
