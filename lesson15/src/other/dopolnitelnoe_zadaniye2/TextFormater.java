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
        for (int i = 0; i < str1.length; i++) {
            char[] a = str1[i].toCharArray();
            if (a.length > 1) {
                z = 0;
                for (int j = 0; j < a.length; j++) {
                    if (a[j] == a[a.length - 1 - j]) {
                        z++;
                    }
                    if (z == a.length) {
                        isPalindrome = true;
                    }
                }
            }
        }
        return isPalindrome;
    }

}
