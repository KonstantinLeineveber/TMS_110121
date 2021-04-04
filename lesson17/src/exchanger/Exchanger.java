package exchanger;

import java.util.concurrent.locks.ReentrantLock;

public class Exchanger {

//    Написать клиент для работы обменника.
//    Люди могут подходить к обменнику чтобы
//    купить/продать доллары или ЕВРО. Количество
//    долларов и ЕВРО в обменнике не должно превышать
//    какого-то заранее заданного предела и не должно
//    оказаться меньше нуля. Каждый человек так же
//    не может купить или продать долларов или ЕВРО
//    больше, чем какое-то определенное значение.
//    В нашей программе, имитирующей торговый центр,
//    работает несколько обменников. Одновременно в
//    одном обменнике может находится только один человек.
//    Человек может как покупать или продавать валюту так
//    и делать обе эти операции одновременно (покупать доллары и продавать ЕВРО).


    public static ReentrantLock lock = new ReentrantLock();

    public static void main(String[] args) {
        Buyer buyer = new Buyer();
        for (int i = 0; i < 12; i++) {
            new Thread(() -> {
                lock.lock();
                try {
                    System.out.print(Thread.currentThread().getName() + " сказал: ");
                    buyer.CurrencyExchange();
                } catch (Exception e) {
                } finally {
                    lock.unlock();
                }
            }).start();
        }
    }


}
