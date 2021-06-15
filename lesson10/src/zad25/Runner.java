package zad25;

class Runner {
    public static void main(String[] args) {


        Bankomat bankomat = new Bankomat();
        bankomat.vnesenie(14, 5, 2);
        bankomat.snyatie(1000);
        bankomat.bank();
    }
}