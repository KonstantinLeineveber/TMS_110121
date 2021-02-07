import java.util.Random;
import java.util.Scanner;

public class KrestNol {

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        Scanner sto = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Вы играете крестиками, вводить только заглавную букву Х");

        String x = "X";
        String o = "O";

        String[][] pole = new String[3][3];

        for (int i = 0; i < 5; i++) {
            System.out.println("Введите номер строки, где будете вводить крестик");
            int strX = str.nextInt();
            if (strX < 4 & strX > 0) {
                System.out.println("Введите номер столбца, где будете вводить крестик");
            } else {
                System.out.println("Вы ввели неверное значение, начните игру заново");
                return;
            }
            int stoX = sto.nextInt();
            if (stoX < 4 & stoX > 0) {
            } else {
                System.out.println("Вы ввели неверное значение, начните игру заново");
                return;
            }
            if (pole[strX - 1][stoX - 1] == null) {
                pole[strX - 1][stoX - 1] = x;
            } else {
                System.out.println("Вы ввели значение в ячейку, которую до этого вводили. Начните игру заново");
                return;
            }
            if (pole[0][0] == x & pole[1][1] == x & pole[2][2] == x
                    || pole[0][0] == x & pole[0][1] == x & pole[0][2] == x
                    || pole[1][0] == x & pole[1][1] == x & pole[1][2] == x
                    || pole[2][0] == x & pole[2][1] == x & pole[2][2] == x
                    || pole[0][2] == x & pole[1][1] == x & pole[2][0] == x
                    || pole[0][0] == x & pole[1][0] == x & pole[2][0] == x
                    || pole[0][1] == x & pole[1][1] == x & pole[2][1] == x
                    || pole[0][2] == x & pole[1][2] == x & pole[2][2] == x) {
                System.out.println("Вы победили!");
                return;
            }
            for (int c = 0; c < 3; c++) {
                for (int d = 0; d < 3; d++) {
                    System.out.print(pole[c][d] + "       ");
                }
                System.out.println();
            }

            System.out.println();
            for (int m = 0; m < 100000; m++) {
                int rnd1 = rand.nextInt(3);
                int rnd2 = rand.nextInt(3);
                if (pole[rnd1][rnd2] == null) {
                    pole[rnd1][rnd2] = o;
                    break;
                }
            }
            for (int c = 0; c < 3; c++) {
                for (int d = 0; d < 3; d++) {
                    System.out.print(pole[c][d] + "       ");
                }
                System.out.println();
            }
            if (pole[0][0] == o & pole[1][1] == o & pole[2][2] == o
                    || pole[0][0] == o & pole[0][1] == o & pole[0][2] == o
                    || pole[1][0] == o & pole[1][1] == o & pole[1][2] == o
                    || pole[2][0] == o & pole[2][1] == o & pole[2][2] == o
                    || pole[0][2] == o & pole[1][1] == o & pole[2][0] == o
                    || pole[0][0] == o & pole[1][0] == o & pole[2][0] == o
                    || pole[0][1] == o & pole[1][1] == o & pole[2][1] == o
                    || pole[0][2] == o & pole[1][2] == o & pole[2][2] == o) {
                System.out.println("Вы проиграли!");
                return;

            }

        }

        System.out.println("Игра завершена! Ничья!");

    }

}