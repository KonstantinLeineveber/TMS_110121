package zad26;

public class BitTech {
    //    Создать иерархию классов, описывающих бытовую технику. Создать несколько
//    объектов описанных классов, часть из них включить в розетку.
//    Иерархия должна иметь хотя бы три уровня.

    private boolean rozetka = false; // включен ли прибор в розетку

    public void vkl() {
        if (this.rozetka == false) {
            System.out.println("Я вставлен в розетку");
            this.rozetka = true;
        } else System.out.println("Я давно вставлен в розетку");
    }

    public void vikl() {
        if (this.rozetka == true) {
            System.out.println("Я вытащен из розетки");
            this.rozetka = false;
        } else System.out.println("Я давно вытащен из розетки");
    }

}
