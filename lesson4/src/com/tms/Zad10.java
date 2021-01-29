package com.tms;

import java.util.Random;

public class Zad10 {

    public static void main(String[] args) {

        Random rand = new Random();

        int x = rand.nextInt();
        int a = x % 100;
        int b = a % 10;

        //В переменную записываете количество программистов.
        //В зависимости от количества программистов необходимо
        //вывести правильно окончание. Например: • 2 программиста •
        //1 программиста • 10 программистов • и т.д.

        if (x <= -1) {
            System.out.println("программисты не могут быть отрицательными");
        } else if (a >= 11 & a <= 19 ||  b >= 5 & b <= 9 || b == 0) {
            System.out.println(x + " программистов");
        } else if (b == 1) {
            System.out.println(x + " программист");
        } else {
            System.out.println(x + " программиста");
        }

    }

}
