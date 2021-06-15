import java.util.ArrayList;

public class Zad29 {
    public static void main(String[] args) {

//        Создать список оценок учеников с помощью ArrayList, заполнить случайными
//оценками. Удалить неудовлетворительные оценки из списка.

        ArrayList<Integer> score = new ArrayList();
        score.add(8);
        score.add(9);
        score.add(7);
        score.add(5);
        score.add(4);
        score.add(0);
        score.add(1);
        score.add(10);
        score.add(6);
        score.add(5);
        score.add(3);
        score.removeIf(n -> n < 4);
        System.out.println(score);
    }
}
