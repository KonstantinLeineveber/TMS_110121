package com.tms;


public class Zad6 {

    public static void main(String[] args) {

        int a = 0;

        //Дано целое число. Если оно является положительным,
        //то прибавить к нему 1.Если отрицательным, то вычесть
        //из него 2. Если нулевым, то заменить его на 10. Вывести полученное число.

        if (a > 0) {
            a++;
        } else if (a < 0) {
            a = a - 2;

        } else {
            a = 10;

        }
        System.out.println(a);
    }

}
