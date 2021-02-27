package by.teachmeskills.kosmodrom;

import java.util.Random;

class Shattl extends Kosmodrom implements Istart {


    @Override
    public boolean proverka() {
        Random random = new Random();
        int rnd = random.nextInt(10);
        if (rnd < 3) {
            return false;
        } else return true;
    }

    @Override
    public void startEngine() {
        System.out.println("Двигатели Шатла запущены. Все системы в норме.");

    }

    @Override
    public void start() {
        System.out.println("Старт Шатла");

    }
}
