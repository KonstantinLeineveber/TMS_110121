package other.dopolnitelnoe_zadaniye2;

public class TextFormater {
    private static int z;

//        Пишем все в ООП стиле. Создаём класс TextFormater
//        в котором два статических метода:
//        1. Метод принимает строку и возвращает кол-во слов в строке.
//        2. Метод принимает строку и проверяет есть ли в строке слово-палиндром. Если
//        есть возвращает true, если нет false
//


    public static int numWord(String str) {
        str = str.replaceAll("(?U)\\W", " ");
        str = str.trim();
        String[] str1 = str.split(" +");
        return str1.length;
    }

    public static boolean palindrome(String str) {
        boolean isPalindrome = false;
        str = str.replaceAll("(?U)\\W", " ");
        str = str.trim();
        String[] str1 = str.split(" +");
        for (String s : str1) {
            String a = new StringBuilder(s).reverse().toString();
            if (a.equals(s)) {
                isPalindrome = true;
            }
        }
        return isPalindrome;
    }
}