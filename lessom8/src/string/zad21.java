package string;

public class zad21 {
    public static void main(String[] args) {
//        Напишите три цикла выполняющих многократное сложение строк, один с
//        помощью оператора сложения и String, другой с помощью StringBuilder и метода
//        append, а также аналогино для StringBuffer. Сравните скорость их выполнения.

        String text = "Vasya hochet v Tambo!";
        StringBuilder textBuilder = new StringBuilder("Vasya hochet v Tambo!");
        StringBuffer textBuffer = new StringBuffer("Vasya hochet v Tambo!");

        long startTimeOne = System.currentTimeMillis();
        for (int i = 0; i < 20; i++) {
            text += text;
        }
        long finishTimeOne = System.currentTimeMillis();
        long operationTimeOne = finishTimeOne - startTimeOne;

        long startTimeTwo = System.currentTimeMillis();
        for (int i = 0; i < 20; i++) {
            textBuilder.append(textBuilder);
        }
        long finishTimeTwo = System.currentTimeMillis();
        long operationTimeTwo = finishTimeTwo - startTimeTwo;

        long startTimeThree = System.currentTimeMillis();
        for (int i = 0; i < 20; i++) {
            textBuffer.append(textBuffer);
        }
        long finishTimeThree = System.currentTimeMillis();
        long operationTimeThree = finishTimeThree - startTimeThree;

        System.out.println("Время выполнения String равно: " + operationTimeOne + " мс");
        System.out.println("Время выполнения  StringBuilder равно: " + operationTimeTwo + " мс");
        System.out.println("ВВремя выполнения  StringBuffer равно: " + operationTimeThree + " мс");

    }
}
