package metod;

public class zad11 {
    public static void main(String[] args) {
//        Имеется целое число, определить является ли это число простым, т.е.
//        делится без остатка только на 1 и себя.
        int n = 18;
        boolean lie = true;

        for (int i = 2; i <= n / i; i++) {
            if ((n % i) == 0) {
                lie = false;
                break;
            }
        }
        if (lie) {
            System.out.println("n - Пpocтoe число");
        } else {
            System.out.println("n - He простое число");
        }

    }

}
