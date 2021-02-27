package by.teachmeskills.kosmodrom;

import java.util.Random;

class SpaceX extends Kosmodrom implements Istart {


    @Override
    public boolean proverka() {
        Random random = new Random();
        int rnd = random.nextInt(100);
        if (rnd < 70) {
            return false;
        } else return true;
    }

    @Override
    public void startEngine() {
        System.out.println("Двигатели SpaceX запущены. Все системы в норме.");

    }

    @Override
    public void start() {
        System.out.println("Старт SpaceX. Бесконечность и далее!!!");

    }
}