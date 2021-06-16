package other.dopolnitelnoe_zadaniye1;

import java.io.*;
import java.util.ArrayList;

public class Dop1 {
    public static void main(String[] args) throws IOException {
//        1)В исходном файле находятся слова, каждое слово на новой стороке. После
//        запуска программы должен создать файл, который будет содержать в себе
//        только полиндромы
        ArrayList<Character> arrayList = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader("d:/tms/TMS_110121/lesson15/src/other/dopolnitelnoe_zadaniye1/Palindrome.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("d:/tms/TMS_110121/lesson15/src/other/dopolnitelnoe_zadaniye1/PalindromeItog.txt"));

        String a, b;

        while ((a = br.readLine()) != null) {
            b = new StringBuilder(a).reverse().toString();
            if (a.equals(b)) {
                bw.write(a + '\n');
            }
        }
        br.close();
        bw.close();

    }

}
