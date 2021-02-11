package string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class zad23 {
    public static void main(String[] args) {

//        Написать программу, выполняющую поиск в строке всех тегов абзацев, в т.ч. тех, у
//        которых есть параметры, например <p id=”p1”>, и замену их на простые теги
//        абзацев <p>

        String text = "fgb <p> <p id=”p1”> <p> <p id=”p1”> <p> <p> <p> <p id=”p1”> <p id=”p1”> fghdfgfgb";
        Pattern pattern = Pattern.compile("-*<p>");
        Matcher m = pattern.matcher(text);
        Pattern pattern1 = Pattern.compile("<{1}p{1}.{5,10}”>{1}");
        Matcher m1 = pattern1.matcher(text);
        while (m.find()) {
            System.out.println(m.group() + " ");
        }
        while (m1.find()) {
            System.out.println(m1.group() + " ");
        }

        System.out.println(text.replaceAll("<{1}p{1}.{5,10}”>{1}", "<p>"));
    }
}

