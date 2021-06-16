import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;

public class Zad34 {
    public static void main(String[] args) throws IOException {
//Имеется файл с текстом, в котором присутствуют числа. Найти все числа,
//распечатать, посчитать сумму, убрать все повторяющиеся числа и снова
//распечатать.
        int summ = 0;
        BufferedReader br = new BufferedReader(new FileReader("File.txt"));

        String res = br.readLine();
        StringBuilder result = new StringBuilder();
        while (res != null) {
            result.append(res);
            res = br.readLine();
        }
        br.close();
        String str = String.valueOf(result);
        str = str.replaceAll("(?U)\\D", " ");
        str = str.trim();
        String[] str1 = str.split(" +");
        System.out.print("Все числа в тексте = ");
        for (int i = 0; i < str1.length; i++) {
            summ += Integer.parseInt(str1[i]);
            System.out.print(str1[i] + " ");
        }
        System.out.println('\n' + "Сумма всех чисел в файле = " + summ);
        HashSet hashSet = new HashSet();
        hashSet.addAll(Arrays.asList(str1));
        System.out.print("Все числа в тексте без повторений = ");
        for (Object hash : hashSet) {
            System.out.print(hash + " ");
        }


    }
}
