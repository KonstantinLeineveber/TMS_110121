package metodichka.zad1;

public class Graghdanskij extends Vozdushnij {

    int kolPass; // количество пассажиров
    boolean biznes; // наличие бизнес класса (true/false)

    public void setKolPass(int kolPass) {
        this.kolPass = kolPass;
    }

    public int getKolPass() {
        return kolPass;
    }

    public void setBiznes(boolean biznes) {
        this.biznes = biznes;
    }

    public boolean getBiznes() {
        return biznes;
    }


    @Override
    float kilovatt() {
        return getMochnost() * 0.74f;
    }

    public void gragh(int mochnost, int maxSkor, int mass, String marka,
                      int razmah, int minDlina, int kolPass, boolean biznes) {
        setMochnost(mochnost);
        setMaxSkor(maxSkor);
        setMass(mass);
        setMarka(marka);
        setRazmah(razmah);
        setMinDlina(minDlina);
        setKolPass(kolPass);
        setBiznes(biznes);
        System.out.println("Мощность: " + getMochnost() + " л.с. или " + " или " + kilovatt() + "кВ" + "\n" +
                "Максимальная скорость: " + getMaxSkor() + "км/ч" + "\n" +
                "Масса: " + getMass() + "кг" + "\n" +
                "Марка: " + getMarka() + "\n" +
                "Размах крыльев: " + getRazmah() + "м" + "\n" +
                "Минимальная длина взлётно-посадочной полосы для взлёта: " + getMinDlina() + "м" + "\n" +
                "Количество пассажиров: " + getKolPass() + "чел" + "\n" +
                "Наличие бизнес класса: " + getBiznes());
    }

    public String posadka(int pos) {
        if (pos <= getKolPass()) {
            return "Самолет заполнен" + "\n";
        } else return "Вам нужен самолет побольше побольше" + "\n";
    }
}
