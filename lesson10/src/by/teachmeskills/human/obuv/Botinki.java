package by.teachmeskills.human.obuv;

public class Botinki implements Obuv {

    public Botinki() {
    }

    @Override
    public void nadetObuv() {
        System.out.println("Я надел ботинки");
    }

    @Override
    public void snyatObuv() {
        System.out.println("Я снял ботинки");
    }
}
