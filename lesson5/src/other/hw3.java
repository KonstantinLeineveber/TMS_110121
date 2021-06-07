package other;

public class hw3 {
    public static void main(String[] args) {
//        Вычислить: 1+2+4+8+...+256
        long summ = 0;
        long itog = 256;


        for (long i = 1; i <= itog; i *= 2) {
            summ += i;
        }
        System.out.println(summ);
    }

}
