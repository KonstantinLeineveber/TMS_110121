package other.dopolnitelnoe_zadaniye1;

import java.io.*;
import java.util.ArrayList;

public class dop1 {
    public static void main(String[] args) throws IOException {
//        1)В исходном файле находятся слова, каждое слово на новой стороке. После
//        запуска программы должен создать файл, который будет содержать в себе
//        только полиндромы
        ArrayList<Character> arrayList = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader("d:/tms/TMS_110121/lesson15/src/other/dopolnitelnoe_zadaniye1/Palindrome.txt"));

        int a;
        while ((a = br.read()) != -1) {
            arrayList.add((char) a);
        }
        br.close();
        char[] reverse = new char[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            reverse[i] = arrayList.get(arrayList.size() - 1 - i);
        }
        arrayList.add('\n');
        for (int i = 0; i < reverse.length; i++) {
            if (reverse[i] != '\n') {
                arrayList.add(reverse[i]);
            }
        }

        BufferedWriter bw = new BufferedWriter(new FileWriter("d:/tms/TMS_110121/lesson15/src/other/dopolnitelnoe_zadaniye1/PalindromeItog.txt"));
        for (char b : arrayList) {
            bw.write(b);
        }
        bw.close();
    }


}
