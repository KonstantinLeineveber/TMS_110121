package by.teachmeskills.human.kutrka;

public class Parka implements Kurtka {

    public Parka() {
    }

    @Override
    public void nadetKurtka() {
        System.out.println("Я надел парку");

    }

    @Override
    public void snyatKurtka() {
        System.out.println("Я снял парку");
    }
}
