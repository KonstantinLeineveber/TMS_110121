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

    public void legk(int mochnost, int maxSkor, int mass, String marka,
                     int kolesa, float rashod, String tipKuzova, int kolPass) {
        setMochnost(mochnost);
        setMaxSkor(maxSkor);
        setMass(mass);
        setMarka(marka);
        setKolesa(kolesa);
        setRashod(rashod);
        setTipKuzova(tipKuzova);
        setKolPass(kolPass);
        System.out.println("Мощность: " + getMochnost() + " л.с. или " + " или " + kilovatt() + "кВ" + "\n" +
                "Максимальная скорость: " + getMaxSkor() + "км/ч" + "\n" +
                "Масса: " + getMass() + "кг" + "\n" +
                "Марка: " + getMarka() + "\n" +
                "Количество колес: " + getKolesa() + "шт" + "\n" +
                "Расход топлива: " + getRashod() + "л/100км" + "\n" +
                "Тип кузова: " + getTipKuzova() + "\n" +
                "Количество пассажиров: " + getKolPass() + "чел");
    }

    public String vremya(int vremya) {
        String str = "За время " + vremya + "ч, автомобиль " + getMarka()
                + " двигаясь с максимальной скоростью " + getMaxSkor() + " км/ч израсходует "
                + getRashod() * vremya * getMaxSkor() / 100 + " литров топлива" + "\n";
        return str;
    }

}
