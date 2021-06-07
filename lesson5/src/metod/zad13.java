package metod;


public class zad13 {
    public static void main(String[] args) {
//        Создать последовательность случайных чисел, найти и вывести наибольшее
//        из них

        int array[] = {16, 546, 234, 6456, 2342, 1, 78978};
        int max = array[0];
        for (int index = 0; index < array.length - 1; index++) {
            if (max < array[index + 1]) {
                max = array[index + 1];
            }
        }

        System.out.println(max);


    }
}
