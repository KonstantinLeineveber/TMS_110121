package other;

public class hw2 {
    public static void main(String[] args) {
//        Одноклеточная амеба каждые 3 часа делится на 2 клетки.
//        Определить,сколько амеб будет через 3, 6, 9, 12,..., 24 часа
        int ameba = 1;
        for (int i = 0; i <= 24; i += 3) {
            if (i == 0) {
            } else ameba *= 2;
            System.out.println("Через столько часов: " + i + " - количество амеб будет " + ameba);
        }
    }
}
