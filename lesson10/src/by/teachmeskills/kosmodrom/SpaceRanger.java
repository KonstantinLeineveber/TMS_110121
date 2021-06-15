package by.teachmeskills.kosmodrom;

import java.util.Random;

class SpaceRanger implements Istart {


    @Override
    public boolean proverka() {
        Random random = new Random();
        int rnd = random.nextInt(56);
        if (rnd < 4) {
            return false;
        } else return true;
    }

    @Override
    public void startEngine() {
        System.out.println("Двигатели космического рэйнджера запущены. Все системы в норме. Ракеты готовы.");

    }

    @Override
    public void start() {
        System.out.println("Старт космического рэйнджера!! ..... Огонь по доминаторам");

    }
}