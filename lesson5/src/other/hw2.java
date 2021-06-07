package other;

public class hw2 {
    public static void main(String[] args) {
//        Одноклеточная амеба каждые 3 часа делится на 2 клетки.
//        Определить,сколько амеб будет через 3, 6, 9, 12,..., 24 часа
        int ameba = 1;
        for (int i = 1; i <= 8; i++) {
            ameba *= 2;

            System.out.println("Через столько часов: " + i * 3 + " - количество амеб будет " + ameba);
        }
    }
}
