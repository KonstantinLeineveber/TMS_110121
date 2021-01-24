package com.tms;

public class Zad2 {

    public static void main(String[] args) {
        int a = 32;
        int b = 44;
        int r = 12;
        double c;
        c = Math.sqrt(a * a + b * b);


        //Имеется прямоугольное отверстие размерами a и b, определить, можно ли его
        //полностью закрыть круглой картонкой радиусом r.

        if (2 * r > c) {
            System.out.println("прямоугольное отверстие можно полностью закрыть круглой картонкой");
        } else {
            System.out.println("прямоугольное отверстие нельзя полностью закрыть круглой картонкой");
        }

    }
}
