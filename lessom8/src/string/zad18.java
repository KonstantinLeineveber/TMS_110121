package string;

public class zad18 {
    public static void main(String[] args) {
//        Найти в строке не только запятые, но и другие знаки препинания. Подсчитать
//        общее их количество.
        String str = " Текст (от лат. textus — ткань; сплетение, сочетание) — зафиксированная на каком-либо материальном" +
                " носителе человеческая мысль; в общем плане связная и полная последовательность символов.\n" +
                "\n" +
                "Существуют две основные трактовки понятия «текст»: имманентная (расширенная, философски нагруженная) и " +
                "репрезентативная (более частная). Имманентный подход подразумевает отношение к тексту как к автономной " +
                "реальности, нацеленность на выявление его внутренней структуры. Репрезентативный — рассмотрение текста " +
                "как особой формы представления информации о внешней тексту действительности.\n" +
                "\n" +
                "В лингвистике термин «текст» используется в широком значении, включая и образцы устной речи. Восприятие" +
                " текста изучается в рамках лингвистики текста и психолингвистики. Так, например, И. Р. Гальперин " +
                "определяет текст следующим образом: «Это письменное сообщение, объективированное в виде письменного " +
                "документа, состоящее из ряда высказываний, объединённых разными типами лексической, грамматической и " +
                "логической связи, имеющее определённый моральный характер, прагматическую установку и соответственно " +
                "литературно обработанное»[1]. ";
        int n = 0;
        char symbol;
        for (int i = 0; i < str.length(); i++) {
            symbol = str.charAt(i);
            if (symbol == ',' || symbol == '.' || symbol == '-' || symbol == ':' || symbol == ';'
                    || symbol == '!' || symbol == '?' || symbol == '(' || symbol == ')') {
                n++;
            }
        }
        System.out.println("У нас есть " + n + " знаков препинания");


    }
}