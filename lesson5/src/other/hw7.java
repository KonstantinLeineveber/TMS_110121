package other;

public class hw7 {
    public static void main(String[] args) {
//        Напишите программу, определяющую сумму всех нечетных чисел от 1до 99
        int summ = 0;
        for (int i = 1; i <= 99; i += 2) {
            summ += i;
        }
        System.out.println("Сумма всех нечетных чисел от 1 до 99 = " + summ);
    }
}
