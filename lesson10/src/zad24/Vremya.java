package zad24;

public class Vremya {

    //Создать класс и объекты описывающие промежуток времени. Сам промежуток
    //в классе должен задаваться тремя свойствами: секундами, минутами, часами.
    //Сделать методы для получения полного количества секунд в объекте, сравнения
    //двух объектов (метод должен работать аналогично compareTo в строках). Создать
    //два конструктора: получающий общее количество секунд, и часы, минуты и секунды
    //по отдельности. Сделать метод для вывода данных.
    private long summS;

    private static long sec, min, s, m, h;

    Vremya(long s, long m, long h) {
        this.s = s;
        this.m = m;
        this.h = h;
        summS = s + m * 60 + h * 3600;
        sec = summS % 60;
        m = (summS - sec) / 60;
        min = m % 60;
        h = (m - min) / 60;
    }

    public static void print(Vremya vremya) {
        System.out.println("Количество часов, минут и секунд в указанном числе = " + h + ", " + min + " и " + sec);
    }

    void compareTo(Vremya b) {
        if (this.summS >= b.summS) {
            System.out.println("Количество секунд в указанном промежутке времени = " + b.summS);
            System.out.println("Количество секунд в указанном промежутке времени = " + this.summS);
        } else {
            System.out.println("Количество секунд в указанном промежутке времени = " + this.summS);
            System.out.println("Количество секунд в указанном промежутке времени = " + b.summS);
        }

    }

}
