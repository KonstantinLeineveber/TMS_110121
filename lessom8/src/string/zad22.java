package string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class zad22 {
    public static void main(String[] args) {
//        Написать программу, выполняющую поиск в строке шестнадцатеричных чисел,
//                записаных по правилам Java, с помощью регулярных выражений и вывести их на
//                страницу
        String text = "0xFFF 0xFF 0x18F 0xAAAAFFF 0XCDCFDV";
        Pattern pattern = Pattern.compile(".*0[Xx]?[0-9]?[a-fA-F]?[0-9].*");
        Matcher m = pattern.matcher(text);

        while (m.find()) {
            System.out.print(m.group() + " ");
        }

    }
}
