package metod;

public class zad12 {

    public static void main(String[] args) {

        //        Найдите сумму первых n целых чисел, которые делятся на 3.

        int n = 4;
        int i, x = 0;
        int k = 1;


        for (i = 0; k <= n; i++) {
            if (i == 0) {
            } else if (i % 3 == 0) {
                k++;
                x += i;
            }

        }

        System.out.println("Сумма первых n целых чисел, которые делятся на 3 = " + x);

    }

}
