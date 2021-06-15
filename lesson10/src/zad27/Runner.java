package zad27;

public class Runner {
    public static void main(String[] args) {
        Kartochka kartochka = new Kartochka("Belinvestbank", "Kanstantsin", 1232415565, 05, 2021);
        kartochka.zachislenie(600);
        kartochka.balans();
        kartochka.snyatie(1200);
        kartochka.balans();
        System.out.println();
        Kartochka kartochka2 = new Kartochka("MTbank", "Halya", 654521545, 01, 2028);
        kartochka2.zachislenie(800);
        kartochka2.balans();
        kartochka2.snyatie(1600);
        kartochka2.balans();
    }

}
