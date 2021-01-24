package com.tms;

public class Zad1 {

    public static void main(String[] args) {
        int a = 788;

        //Создайте число. Определите, является ли число трехзначным. Определите, является
        //ли его последняя цифра семеркой. Определите, является ли число четным.

        if (a < 1000 & a > 99 || a < -99 & a > -1000) {
            System.out.println("Значение a - число трехзначное");
        } else {
            System.out.println("Значение a - нетрехзначное число");
        }

        if (a % 10 == 7) {
            System.out.println("Значение a имеет 7 на конце");
        } else {
            System.out.println("Значение a не имеет 7 на конце");
        }

        if (a % 2 == 0) {
            System.out.println("Значение a четное");
        } else {
            System.out.println("Значение a нечетное");
        }

    }

}
