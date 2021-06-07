package metod;

public class zad16 {
    public static void main(String[] args) {
//        Определите сумму элементов одномерного массива, расположенных между
//        минимальным и максимальным значениями.
        int array[] = {14, 12, 46, 22, 13, 79, 19};
        int min = array[0];
        int max = array[0];
        int indexMax = 0;
        int indexMin = 0;
        int summ = 0;
        for (int start = 0; start < array.length; start++) {
            if (max < array[start]) {
                max = array[start];
                indexMax = start;
            }
            if (min > array[start]) {
                min = array[start];
                indexMin = start;
            }
        }
        while (indexMin != indexMax - 1) {
            summ += array[indexMin + 1];
            indexMin++;
        }
        System.out.print("сумма элементов массива, расположенных между минимальным и максимальным значениями = ");
        System.out.print(summ);

    }
}
