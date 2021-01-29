package com.tms;

public class Zad7 {

    public static void main(String[] args) {
//Даны 3 целых числа. Найти количество положительных чисел в исходном наборе.
        int a = -100;
        int b = 200;
        int c = -300;
        int d = 400;
        int e = -500;
        int x = 0;
        if (a >= 0) {
            x = x += 1;
        } else if (b >= 0) {
            x = x += 1;
        } else if (c >= 0) {
            x = x += 1;
        } else if (d >= 0) {
            x = x += 1;
        } else if (e >= 0) {
            x = x += 1;
        }
        switch (x) {
            case 0:
                System.out.println("Все числа отрицательные");
                break;
            case 1:
                System.out.println("В исходном наборе только 1 число положительное");
                break;
            case 2:
                System.out.println("В исходном наборе только 2 числа положительных");
                break;
            case 3:
                System.out.println("В исходном наборе только 3 числа положительных");
                break;
            case 4:
                System.out.println("В исходном наборе только 4 числа положительных");
                break;
            case 5:
                System.out.println("Все числа положительные");
                break;
        }
    }

}

