package zad27;

public class runner {
    public static void main(String[] args) {
        kartochka kartochka = new kartochka("Belinvestbank", "Kanstantsin", 1232415565, 05, 2021);
        kartochka.zachislenie(600);
        kartochka.balans();
        kartochka.snyatie(1200);
        kartochka.balans();
        System.out.println();
        kartochka kartochka2 = new kartochka("MTbank", "Halya", 654521545, 01, 2028);
        kartochka2.zachislenie(800);
        kartochka2.balans();
        kartochka2.snyatie(1600);
        kartochka2.balans();
    }

}
