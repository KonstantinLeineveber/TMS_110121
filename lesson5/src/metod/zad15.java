package metod;

public class zad15 {
    public static void main(String[] args) {

//        Создать массив, заполнить его случайными элементами, распечатать,
//        перевернуть, и снова распечатать (при переворачивании нежелательно создавать
//        еще один массив).
        int array[] = {13, 15, 3, 7, 8, 11, 19};
        int i;
        int tmp;
        System.out.print("исходный массив ");
        for (i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        for (i = 0; i < array.length / 2; i++) {

            tmp = array[i];
            array[i] = array[(array.length - 1 - i)];
            array[(array.length - 1 - i)] = tmp;
        }
        System.out.print("\n" + "перевернутый массив ");
        for (i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }
}