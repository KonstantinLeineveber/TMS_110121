package other;

public class hw3 {
    public static void main(String[] args) {
//        Вычислить: 1+2+4+8+...+2564) Составьте программу, вычисляющую A*B, не пользуясь операцией умножения.
        long summ = 0;
        long itog = 2048; // Судя по первым числам должно заканчиваться на 2048


        for (long i = 1; i <= itog; i *= 2) {
            summ += i;
        }
        System.out.println(summ);
    }

}
