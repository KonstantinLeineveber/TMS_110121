package zad25;

class runner {
    public static void main(String[] args) {


        bankomat bankomat = new bankomat();
        bankomat.vnesenie(14, 5, 2);
        bankomat.snyatie(1000);
        bankomat.bank();
    }
}