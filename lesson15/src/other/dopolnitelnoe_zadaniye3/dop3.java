package other.dopolnitelnoe_zadaniye3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class dop3 {
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
        BufferedReader brCens = new BufferedReader(new FileReader("d:/tms/TMS_110121/lesson15/src/other/dopolnitelnoe_zadaniye3/cens.txt"));
        String cens = brCens.readLine();
        StringBuilder result = new StringBuilder();
        while (cens != null) {
            result.append(cens);
            cens = brCens.readLine();
        }
        brCens.close();
        String str = String.valueOf(result);
        str = str.replaceAll("(?U)\\W", " ");
        str = str.trim();
        String[] str1 = str.split(" +");

        for (int i = 0; i < str1.length; i++) {

            count = 0;
            BufferedReader br = new BufferedReader(new FileReader("d:/tms/TMS_110121/lesson15/src/other/dopolnitelnoe_zadaniye3/text.txt"));
            String res = br.readLine();
            while (res != null) {
                Pattern pattern = Pattern.compile(str1[i]);
                Matcher matcher = pattern.matcher(res);
                while (matcher.find()) {
                    count++;
                    System.out.println(str1[i] + " встречается в следующем предложении:");
                    System.out.println(res);
                }
                res = br.readLine();
            }
            if (count > 0) {
                System.out.println('\n' + "Текст не прошел цензуру");
            }
            System.out.println('\n' + str1[i] + ", находящийся в black list - встречается в данном тексте - " + count + '\n');

            br.close();

        }


    }
}
