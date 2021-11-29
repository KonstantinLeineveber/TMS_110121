package library;


import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.locks.ReentrantLock;

public class ReadingRoom {


//    Написать клиент для работы библиотеки. В библиотеке доступны
//    к чтению несколько книг. Некоторые из них можно выдавать на
//    руки некоторые - только в читальный зал. Посетители могут
//    брать одновременно по несколько книг на руки и в читальный зал.

    public static ReentrantLock lock = new ReentrantLock();

    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Book> a = GetBooks.getAllBooks();

        for (int i = 0; i < 5; i++) {
            new Thread(() -> {
                lock.lock();
                try {
                    int quantityBooks = random.nextInt(9) + 1;
                    for (int j = 0; j < quantityBooks; j++) {
                        int idBooks = random.nextInt(9);
                        System.out.println(Thread.currentThread().getName() + " взял почитать " + a.get(idBooks));
                    }
                    Thread.sleep(1000);
                    System.out.println(Thread.currentThread().getName() + " Вернул все книги обратно" + '\n');
                } catch (Exception e) {
                } finally {
                    lock.unlock();
                }
            }).start();
        }
    }


}
