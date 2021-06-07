package other;

public class hw5 {
    public static void main(String[] args) {
        //Напишите программу печати таблицы перевода расстояний
        //из дюймов в сантиметры для значений длин от 1 до 20 дюймов.
        //1 дюйм = 2,54 см
        double duym = 2.54;
        double perevod = 0;
        double i;
        for (i = 1; i <= 20; i++) {
            perevod = i * duym;
            System.out.println("Во стольки дюймах - " + i + " - столько сантиметров - " + perevod);
        }

    }
}
