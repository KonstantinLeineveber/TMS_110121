package metod;


public class zad13 {
    public static void main(String[] args) {
//        Создать последовательность случайных чисел, найти и вывести наибольшее
//        из них

        int array[] = {16, 546, 234, 6456, 2342, 1, 78978};
        for (int start = 0; start < array.length - 1; start++) {
            for (int index = 0; index < array.length - 1 - start; index++) {
                if (array[index] < array[index + 1]) {
                    int tmp = array[index];
                    array[index] = array[(index + 1)];
                    array[(index + 1)] = tmp;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[0]);
        }


    }
}
