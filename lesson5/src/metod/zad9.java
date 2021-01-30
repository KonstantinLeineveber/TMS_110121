package metod;

public class zad9 {

    public static void main(String[] args) {
        //Изменить пример с суммой чисел таким образом, чтобы рассчитывалась не сумма, а
        //произведение, т.е. факториал числа.

        double averageFact = 0;
        double fact = 1;
        int n = 0;
        int x = (int) (Math.random() * 20);
        while (x != 0) {
            fact *= x;
            n++;
            x = (int) (Math.random() * 20);
        }
        if (n != 0) {
            averageFact = fact / n;
        } else {
            averageFact = 0;
        }
        System.out.println("среднее факториала:" + averageFact);
    }

}
