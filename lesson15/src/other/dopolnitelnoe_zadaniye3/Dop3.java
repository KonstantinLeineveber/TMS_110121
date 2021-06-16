package other.dopolnitelnoe_zadaniye3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Dop3 {
    public static void main(String[] args) throws IOException {
//        3) Проверка на цензуру:
//        Создаете 2 файла.
//        1 - й. Содержит исходный текст.
//        2 - й. Содержит слова недопустимые в тексте(black list). Структура файла
//        определите сами, хотите каждое слово на новой строке, хотите через запятую
//        разделяйте, ваша программа делайте как считаете нужным.
//                Задача: необходимо проверить проходит ли текст цензуру. Если в тексте не
//        встретилось ни одного недопустимого слова, то выводите сообщение о том что
//        текст прошёл проверку на цензуру. Если нет, то выводите соответствуюущее
//        сообщение, кол-во предложений не прошедших проверку и сами предложения
//        подлежащие исправлению.
        int count = 0;
        BufferedReader brCens = new BufferedReader(new FileReader("d:/tms/TMS_110121/lesson15/src/other/dopolnitelnoe_zadaniye3/Cens.txt"));
        String cens = brCens.readLine();
        List<String> list = new ArrayList<String>();
        while (cens != null) {
            list.add(cens);
            cens = brCens.readLine();
        }
        brCens.close();

        BufferedReader br = new BufferedReader(new FileReader("d:/tms/TMS_110121/lesson15/src/other/dopolnitelnoe_zadaniye3/Text.txt"));
        String res = br.readLine();
        while (res != null) {
            String str = res.replaceAll("(?U)\\W", " ");
            str = str.trim();
            String[] str1 = str.split(" +");
            for (String s : str1) {
                for (String value : list) {
                    if (s.equals(value)) {
                        count++;
                        System.out.println('\n' + "Текст не прошел цензуру");
                        System.out.println(value + " встречается в следующем предложении:");
                        System.out.println(res);
                    }
                }
            }
            res = br.readLine();
        }
        System.out.println('\n' + "Слова, находящиеся в black list - встречается в данном тексте - " + count + '\n');
        br.close();
    }
}
