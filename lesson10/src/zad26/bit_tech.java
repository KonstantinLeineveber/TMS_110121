package zad26;

public class bit_tech {
    //    Создать иерархию классов, описывающих бытовую технику. Создать несколько
//    объектов описанных классов, часть из них включить в розетку.
//    Иерархия должна иметь хотя бы три уровня.

    private boolean razetka = false;

//    public boolean getRazetka() {
//        return razetka;
//    }
//
//    public void setRazetka(boolean razetka) {
//        this.razetka = razetka;
//    }

    public void vkl() {
        if (this.razetka == false) {
            System.out.println("Я вставлен в розетку");
            this.razetka = true;
        } else System.out.println("Я давно вставлен в розетку");
    }

    public void vikl() {
        if (this.razetka == true) {
            System.out.println("Я вытащен из розетки");
            this.razetka = false;
        } else System.out.println("Я давно вытащен из розетки");
    }

}
