package metodichka.zad1;

public class Voennij extends Vozdushnij {

    private boolean katapult; //Наличие системы катапультирования (true/false)
    private int raket;//Кол-во ракет на борту

    public void setKatapult(boolean katapult) {
        this.katapult = katapult;
    }

    public boolean getKatapult() {
        return katapult;
    }

    public void setRaket(int raket) {
        this.raket = raket;
    }

    public int getRaket() {
        return raket;
    }

    @Override
    float kilovatt() {
        return getMochnost() * 0.74f;
    }

    public void voenn(int mochnost, int maxSkor, int mass, String marka,
                      int razmah, int minDlina, boolean katapult, int raket) {
        setMochnost(mochnost);
        setMaxSkor(maxSkor);
        setMass(mass);
        setMarka(marka);
        setRazmah(razmah);
        setMinDlina(minDlina);
        setKatapult(katapult);
        setRaket(raket);
        System.out.println("Мощность: " + getMochnost() + " л.с. или " + " или " + kilovatt() + "кВ" + "\n" +
                "Максимальная скорость: " + getMaxSkor() + "км/ч" + "\n" +
                "Масса: " + getMass() + "кг" + "\n" +
                "Марка: " + getMarka() + "\n" +
                "Размах крыльев: " + getRazmah() + "м" + "\n" +
                "Минимальная длина взлётно-посадочной полосы для взлёта: " + getMinDlina() + "м" + "\n" +
                "Наличие системы катапультирования: " + getKatapult() + "\n" +
                "Кол-во ракет на борту: " + getRaket() + "шт");
    }

    public String katap() {
        if (getKatapult() == true) {
            return "Катапультирование прошло успешно";
        } else return "У вас нет такой системы";
    }

    public String zapuskRaket() {
        if (getRaket() != 0) {
            raket--;
            return "Ракета пошла…";
        } else return "Боеприпасы отсутствуют";
    }
}