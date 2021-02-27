package metodichka.zad1;

public class Legkovoj extends Nazemnij {
    private String tipKuzova; // тип кузова
    private int kolPass; //количество пассажиров

    public void setTipKuzova(String tipKuzova) {
        this.tipKuzova = tipKuzova;
    }

    public String getTipKuzova() {
        return tipKuzova;
    }

    public void setKolPass(int kolPass) {
        this.kolPass = kolPass;
    }

    public int getKolPass() {
        return kolPass;
    }

    @Override
    float kilovatt() {
        return getMochnost() * 0.74f;
    }

    public StringBuilder legk(int mochnost, int maxSkor, int mass, String marka,
                              int kolesa, float rashod, String tipKuzova, int kolPass) {
        setMochnost(mochnost);
        setMaxSkor(maxSkor);
        setMass(mass);
        setMarka(marka);
        setKolesa(kolesa);
        setRashod(rashod);
        setTipKuzova(tipKuzova);
        setKolPass(kolPass);
        StringBuilder s = new StringBuilder();
        s.append("Мощность: " + getMochnost() + " л.с. или " + " или " + kilovatt() + "кВ" + "\n");
        s.append("Максимальная скорость: " + getMaxSkor() + "км/ч" + "\n");
        s.append("Масса: " + getMass() + "кг" + "\n");
        s.append("Марка: " + getMarka() + "\n");
        s.append("Количество колес: " + getKolesa() + "шт" + "\n");
        s.append("Расход топлива: " + getRashod() + "л/100км" + "\n");
        s.append("Тип кузова: " + getTipKuzova() + "\n");
        s.append("Количество пассажиров: " + getKolPass() + "чел");
        return s;
    }

    public String vremya(int vremya) {
        String str = "За время " + vremya + "ч, автомобиль " + getMarka()
                + " двигаясь с максимальной скоростью " + getMaxSkor() + " км/ч израсходует "
                + getRashod() * vremya * getMaxSkor() / 100 + " литров топлива" + "\n";
        return str;
    }

}
