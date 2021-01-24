package com.tms;

public class Zad7 {

    public static void main(String[] args) {
//Даны 3 целых числа. Найти количество положительных чисел в исходном наборе.
        int a = -100;
        int b = -200;
        int c = -300;
        int d = -400;
        int e = -500;
        boolean q = a >= 0 & b >= 0 & c >= 0 & d >= 0 & e >= 0;
        boolean w1 = a < 0 & b >= 0 & c >= 0 & d >= 0 & e >= 0;
        boolean w2 = a >= 0 & b < 0 & c >= 0 & d >= 0 & e >= 0;
        boolean w3 = a >= 0 & b >= 0 & c < 0 & d >= 0 & e >= 0;
        boolean w4 = a >= 0 & b >= 0 & c >= 0 & d < 0 & e >= 0;
        boolean w5 = a >= 0 & b >= 0 & c >= 0 & d >= 0 & e < 0;
        boolean r1 = a < 0 & b < 0 & c >= 0 & d >= 0 & e >= 0;
        boolean r2 = a < 0 & b >= 0 & c < 0 & d >= 0 & e >= 0;
        boolean r3 = a < 0 & b >= 0 & c >= 0 & d < 0 & e >= 0;
        boolean r4 = a < 0 & b >= 0 & c >= 0 & d >= 0 & e < 0;
        boolean r5 = a >= 0 & b < 0 & c < 0 & d >= 0 & e >= 0;
        boolean r6 = a >= 0 & b < 0 & c >= 0 & d < 0 & e >= 0;
        boolean r7 = a >= 0 & b < 0 & c >= 0 & d >= 0 & e < 0;
        boolean r8 = a >= 0 & b >= 0 & c < 0 & d < 0 & e >= 0;
        boolean r9 = a >= 0 & b >= 0 & c < 0 & d >= 0 & e < 0;
        boolean r10 = a >= 0 & b >= 0 & c >= 0 & d < 0 & e < 0;
        boolean t1 = a < 0 & b < 0 & c < 0 & d >= 0 & e >= 0;
        boolean t2 = a < 0 & b < 0 & c >= 0 & d < 0 & e >= 0;
        boolean t3 = a < 0 & b < 0 & c >= 0 & d >= 0 & e < 0;
        boolean t4 = a < 0 & b >= 0 & c < 0 & d < 0 & e >= 0;
        boolean t5 = a < 0 & b >= 0 & c < 0 & d >= 0 & e < 0;
        boolean t6 = a < 0 & b >= 0 & c >= 0 & d < 0 & e < 0;
        boolean t7 = a >= 0 & b < 0 & c < 0 & d < 0 & e >= 0;
        boolean t8 = a >= 0 & b < 0 & c < 0 & d >= 0 & e < 0;
        boolean t9 = a >= 0 & b < 0 & c >= 0 & d < 0 & e < 0;
        boolean t10 = a >= 0 & b >= 0 & c < 0 & d < 0 & e < 0;
        boolean y1 = a >= 0 & b < 0 & c < 0 & d < 0 & e < 0;
        boolean y2 = a < 0 & b >= 0 & c < 0 & d < 0 & e < 0;
        boolean y3 = a < 0 & b < 0 & c >= 0 & d < 0 & e < 0;
        boolean y4 = a < 0 & b < 0 & c < 0 & d >= 0 & e < 0;
        boolean y5 = a < 0 & b < 0 & c < 0 & d < 0 & e >= 0;


        if (q) {
            System.out.println("Все числа положительные");
        } else if (w1 || w2 || w3 || w4 || w5) {
            System.out.println("В исходном наборе только 4 числа положительных");
        } else if (r1 || r2 || r3 || r4 || r5 || r6 || r7 || r8 || r9 || r10) {
            System.out.println("В исходном наборе только 3 числа положительных");
        } else if (t1 || t2 || t3 || t4 || t5 || t6 || t7 || t8 || t9 || t10) {
            System.out.println("В исходном наборе только 2 числа положительных");
        } else if (y1 || y2 || y3 || y4 || y5) {
            System.out.println("В исходном наборе только 1 число положительное");
        } else {
            System.out.println("Все числа отрицательные");
        }

    }

}
