package other.dopolnitelnoe_zadaniye2;

import java.io.*;

public class Main extends TextFormater {
    public static void main(String[] args) throws IOException {
//        2)Текстовый файл содержит текст. После запуска программы в другой файл
//        должны записаться только те предложения в которых от 3-х до 5-ти слов. Если в
//        предложении присутствует слово-палиндром, то не имеет значения какое кол-во
//        слов в предложении, оно попадает в новый файл.
//        В main считываем файл.
//        Разбиваем текст на предложения. Используя методы класса TextFormater
//        определяем подходит ли нам предложение. Если подходит добавляем его в
//        новый файл

        BufferedReader br = new BufferedReader(new FileReader("d:/tms/TMS_110121/lesson15/src/other/dopolnitelnoe_zadaniye2/File.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("d:/tms/TMS_110121/lesson15/src/other/dopolnitelnoe_zadaniye2/NewFile.txt"));
        String res = br.readLine();
        while (res != null) {
            int a = numWord(res);
            if (palindrome(res)) {
                bw.write(res + " ");
            } else if (a > 2 & a < 6) {
                bw.write(res + " ");
            }
            res = br.readLine();
        }
        br.close();
        bw.close();
    }
}
