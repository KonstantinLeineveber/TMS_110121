package com.tms;

import java.util.Random;

public class Zad3 {

    public static void main(String[] args) {

        Random rand = new Random();

        int x = rand.nextInt();
        int a = x % 100;
        int b = a % 10;


        //Имеется целове число (задать с помощью Random rand = new Random(); int x =
        //rand.nextInt() ). Это число – количесво денег в рублях. Вывести это число, добавив к
        //нему слово «рублей» в правильном падеже.

        if (a >= 11 & a <= 19 || a >= -19 & a <= -11 || b >= 5 & b <= 9 || b >= -9 & b <= -5 || b == 0) {
            System.out.println(x + " рублей");
        } else if (b == 1 || b == -1) {
            System.out.println(x + " рубль");
        } else {
            System.out.println(x + " рубля");
        }

    }

}
