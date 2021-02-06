package string;

public class zad20 {
    public static void main(String[] args) {
//        Имеется строка с текстом. Вывести текст, составленный из последних букв
//        всех слов.

        String str = " Существуют две основные трактовки понятия текст: имманентная (расширенная, философски нагруженная) и " +
                "репрезентативная (более частная).       ";

        str = str.trim();
        String lastL = "";
        char symbol, symbol1;
        for (int i = 0; i < str.length(); i++) {
            if (i + 1 == str.length()) {
                break;
            }
            symbol = str.charAt(i);
            symbol1 = str.charAt(i + 1);
            if (symbol == ',' || symbol == '.' || symbol == '-' || symbol == ':' || symbol == ';'
                    || symbol == '!' || symbol == '?' || symbol == ' ' || symbol == ')') {
                if (symbol1 == ',' || symbol1 == '.' || symbol1 == '-' || symbol1 == ':' || symbol1 == ';'
                        || symbol1 == '!' || symbol1 == '?' || symbol1 == ' ' || symbol1 == ')') {
                    symbol = str.charAt(i - 1);
                    lastL += str.valueOf(symbol);
                } else if (str.charAt(i - 1) == ',' || str.charAt(i - 1) == '.' || str.charAt(i - 1) == '-' || str.charAt(i - 1) == ':' || str.charAt(i - 1) == ';'
                        || str.charAt(i - 1) == '!' || str.charAt(i - 1) == '?' || str.charAt(i - 1) == ' ' || str.charAt(i - 1) == ')') {
                } else {
                    symbol = str.charAt(i - 1);
                    lastL += str.valueOf(symbol);
                }
            }
        }
        System.out.println(lastL);


    }
}
