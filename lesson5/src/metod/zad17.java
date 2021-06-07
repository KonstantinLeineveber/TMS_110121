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

        for (int i = 0; i < arr.length / 2 + 1; i++) {
            for (int j = 0; j < arr.length - i; j++) {
                if (j >= i) {
                    arr[i][j] = '1';
                }
            }
        }
        for (int i = arr.length / 2 + 1; i < arr.length; i++) {
            for (int j = arr.length; j > arr.length - i - 2; j--) {
                if (j <= i) {
                    arr[i][j] = '1';
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] != '1') {
                    arr[i][j] = '0';
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j]);
//                System.out.print(arr[j][i]);
            }
            System.out.println();
        }
    }
}
