package zad27;

class Bankovkaya {

    //    Создать иерархию классов, описывающих банковские карточки.
    //    Иерархия должна иметь хотя бы три уровня.

    private int summ = 1000;

    void zachislenie(int z) {
        System.out.println("На Вашу банковскую карточку зачислено номинала = " + z);
        this.summ += z;
    }

    void snyatie(int s) {
        if (s <= summ) {
            System.out.println("C Вашей банковской карточки снято номинала = " + s);
            this.summ -= s;
        } else if (this.summ == 0) {
            System.out.println("Операция не удалась");
        } else System.out.println("Операция не удалась");
    }

    void balans() {
        System.out.println("Баланс Вашей банковской карточки = " + this.summ);
    }
}
