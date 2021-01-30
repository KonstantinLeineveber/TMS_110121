package metod;

public class zad17 {
    public static void main(String[] args) {
//        Создать двухмерный квадратный массив, и заполнить его «бабочкой», т.е
//        таким образом:
//        1 1 1 1 1
//        0 1 1 1 0
//        0 0 1 0 0
//        0 1 1 1 0
//        1 1 1 1 1

        char[][] arr = new char[5][5];
        char[][] arr2 = new char[5][5];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (j <= i) {
                    arr[i][j] = '*';
                    arr2[i][j] = ' ';
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (j <= i) {
                    arr[i][j] = '*';
                    arr2[i][j] = ' ';

                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
                System.out.print(arr2[j][i]);
                System.out.print(arr2[j][i]);

            }
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[j][i]);


            }
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr2[i][j]);
                System.out.print(arr2[i][j]);
                System.out.print(arr[j][i]);
            }
            System.out.println();
        }

    }
}
