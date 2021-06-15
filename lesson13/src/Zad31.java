import java.util.ArrayList;
import java.util.Iterator;

public class Zad31 {
    public static void main(String[] args) {

        int i = 0;
//        Создать список оценок учеников с помощью ArryList, заполнить случайными
//        оценками. Найти самую высокую оценку с использованием итератора

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
        int max = score.get(0);
        Iterator iterator = score.iterator();
        while (iterator.hasNext()) {
            iterator.next();
            if ((score.get(i) > max)) {
                max = score.get(i);
            }
            i++;
        }
        System.out.println(max);
    }

}
