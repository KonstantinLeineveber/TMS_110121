package string;

public class zad20 {
    public static void main(String[] args) {
//        Имеется строка с текстом. Вывести текст, составленный из последних букв
//        всех слов.

        String str = " Существуют две основные трактовки понятия текст: имманентная (расширенная, философски нагруженная) и " +
                "репрезентативная (более частная).       ";

        str = str.replaceAll("(?U)\\W", " ");
        str = str.trim();
        String[] str1 = str.split(" +");
        String lastL = "";
        for (String word : str1) {
            lastL += word.toCharArray()[word.length() - 1];
        }
        System.out.println(lastL);


    }
}
