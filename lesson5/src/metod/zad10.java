package metod;

public class zad10 {
    public static void main(String[] args) {
//        Посчитать факториал числа в границах от 10 до 15 (не используя рекурсию).
        long x = 1;
        for (int i = 1; i < 16; i++) {
            x = x*i;
            if (i > 9) {
                System.out.println("факториал " + i + "= " + x);
            }
        }

    }

}
