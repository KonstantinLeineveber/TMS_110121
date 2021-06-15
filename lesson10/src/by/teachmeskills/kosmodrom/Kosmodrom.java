package by.teachmeskills.kosmodrom;

public class Kosmodrom {


    public static void zapusk(Istart korabl) {
        if (!korabl.proverka()) {
            System.out.println("Предстартовая проверка провалена");
        } else {
            korabl.startEngine();
            for (int i = 10; i > 0; i--) {
                System.out.println("обратный отсчет " + i);
            }

            korabl.start();
        }
    }


}
