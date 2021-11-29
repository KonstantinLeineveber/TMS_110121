import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Zad33 {
    public static void main(String[] args) throws IOException {
//        Создать файл с текстом, прочитать, подсчитать в тексте количество знаков
//        препинания и слов


        BufferedReader br = new BufferedReader(new FileReader("File.txt"));

        String res = br.readLine();
        StringBuilder result = new StringBuilder();
        while (res != null) {
            result.append(res);
            res = br.readLine();
        }
        br.close();

        int n = 0;
        Pattern pattern = Pattern.compile("[.,—:;!?()]");
        Matcher m = pattern.matcher(result);
        while (m.find()) {
            n++;
        }
        System.out.println("У нас есть " + n + " знаков препинания");
        String str = String.valueOf(result);
        str = str.replaceAll("(?U)\\W", " ");
        str = str.trim();
        String[] str1 = str.split(" +");
        System.out.println("Количество слов = " + str1.length);
    }
}
