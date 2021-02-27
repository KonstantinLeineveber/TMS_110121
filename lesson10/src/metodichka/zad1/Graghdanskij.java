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

    public StringBuilder gragh(int mochnost, int maxSkor, int mass, String marka,
                               int razmah, int minDlina, int kolPass, boolean biznes) {
        setMochnost(mochnost);
        setMaxSkor(maxSkor);
        setMass(mass);
        setMarka(marka);
        setRazmah(razmah);
        setMinDlina(minDlina);
        setKolPass(kolPass);
        setBiznes(biznes);
        StringBuilder s = new StringBuilder();
        s.append("Мощность: " + getMochnost() + " л.с. или " + " или " + kilovatt() + "кВ" + "\n");
        s.append("Максимальная скорость: " + getMaxSkor() + "км/ч" + "\n");
        s.append("Масса: " + getMass() + "кг" + "\n");
        s.append("Марка: " + getMarka() + "\n");
        s.append("Размах крыльев: " + getRazmah() + "м" + "\n");
        s.append("Минимальная длина взлётно-посадочной полосы для взлёта: " + getMinDlina() + "м" + "\n");
        s.append("Количество пассажиров: " + getKolPass() + "чел" + "\n");
        s.append("Наличие бизнес класса: " + getBiznes());
        return s;
    }

    public String posadka(int pos) {
        if (pos <= getKolPass()) {
            return "Самолет заполнен" + "\n";
        } else return "Вам нужен самолет побольше побольше" + "\n";
    }
}
