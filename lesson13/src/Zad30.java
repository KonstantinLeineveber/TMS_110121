import java.util.HashSet;
import java.util.Set;

public class Zad30 {
    public static void main(String[] args) {
//        Создать коллекцию, наполнить ее случайными числами. Удалить повторяющиеся
//        числа.

        Set<Integer> numbers = new HashSet<>();
        numbers.add(8);
        numbers.add(9);
        numbers.add(7);
        numbers.add(5);
        numbers.add(4);
        numbers.add(0);
        numbers.add(1);
        numbers.add(10);
        numbers.add(6);
        numbers.add(5);
        numbers.add(3);
        System.out.println(numbers);

    }


}
