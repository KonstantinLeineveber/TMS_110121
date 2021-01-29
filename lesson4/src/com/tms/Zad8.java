package com.tms;

public class Zad8 {

    public static void main(String[] args) {
//Даны 3 целых числа. Найти количество положительных и отрицательных чисел в исходном наборе.
        int a = 100;
        int b = -200;
        int c = 300;
        int d = -400;
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
                System.out.println("В исходном наборе только 4 числа положительных и 1 отрицательное число");
                break;
            case 2:
                System.out.println("В исходном наборе только 3 числа положительных и 2 отрицательных числа");
                break;
            case 3:
                System.out.println("В исходном наборе только 2 числа положительных и 3 отрицательных числа");
                break;
            case 4:
                System.out.println("В исходном наборе только 1 число положительное и 4 отрицательных числа");
                break;
            case 5:
                System.out.println("Все числа положительные");
                break;
        }

    }

}

