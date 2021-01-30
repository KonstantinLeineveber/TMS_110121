package metod;

public class zad16 {
    public static void main(String[] args) {
//        Определите сумму элементов одномерного массива, расположенных между
//        минимальным и максимальным значениями.
        int array[] = {14, 12, 46, 22, 13, 79, 11};
        int max = array[0];
        int min = array[0];
        int i;
        int x = 0;
        for (i = 0; i < array.length; i++) {
            x += array[i];
            if (max < array[i]) {
                max = array[i];
            } else if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.print("сумма элементов массива, расположенных между минимальным и максимальным значениями = ");
        System.out.print(x - min - max);
    }
}
