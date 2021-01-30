package other;

public class hw4 {
    public static void main(String[] args) {
        //Составьте программу, вычисляющую A*B, не пользуясь операцией умножения.
        int a = 8;
        int b = 11;
        int summ = 0;
        for (int i = 0; i < b; i++) {
            summ += a;
        }
        System.out.println(summ);
    }
}
