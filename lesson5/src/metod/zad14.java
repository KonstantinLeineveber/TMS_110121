package metod;

public class zad14 {
    public static void main(String[] args) {

//        Создать массив оценок произвольной длины, вывести максимальную и
//        минимальную оценку, её (их) номера.

        int array[] = {13, 15, 3, 7, 8, 11, 19};
        int max = array[0];
        int indexMax = 0;
        int indexMin = 0;
        int min = array[0];
        for (int start = 0; start < array.length; start++) {
            if (max < array[start]) {
                max = array[start];
                indexMax = start + 1;
            }
            if (min > array[start]) {
                min = array[start];
                indexMin = start + 1;
            }
        }
        System.out.println("Максимальное значение в данном массиве = " + min + " и номер его  = " + indexMin);
        System.out.println("Максимальное значение в данном массиве = " + max + " и номер его  = " + indexMax);

    }
}
