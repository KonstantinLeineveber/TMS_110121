package string;

public class zad19 {
    public static void main(String[] args) {
//        Имеется строка с текстом. Подсчитать количество слов в тексте. Желательно
//        учесть, что слова могут разделяться несколькими пробелами, в начале и конце
//        текста также могут быть пробелы, но могут и отсутствовать.

        String str = " Существуют        две основные трактовки понятия текст: имманентная (расширенная, философски нагруженная) и " +
                "репрезентативная (более частная). Имманентный подход подразумевает отношение к тексту как к автономной " +
                "реальности, нацеленность         на выявление его внутренней структуры. Репрезентативный — рассмотрение текста " +
                "как особой формы представления информации о внешней тексту действительности.      ";
        str = str.trim();
        String probel = "  ";
        int n = 0;
        char symbol, symbol1;

        for (int i = 0; i < str.length(); i++) {
            if (i + 1 == str.length()) {
                break;
            }
            symbol = str.charAt(i);
            symbol1 = str.charAt(i + 1);
            String preText1 = str.valueOf(symbol);
            String preText2 = str.valueOf(symbol1);
            String preText3 = preText1 + preText2;
            String text = preText3.intern();
            if (symbol == ' ') {
                n++;
            }
            if (symbol == '—') {
                n--;
            }

            if (probel == text) {
                n--;
            }
        }

        n = n + 1;
        System.out.println("Количество слов " + n);

    }
}
