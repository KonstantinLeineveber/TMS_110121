package metodichka.zad1;

public class Gruzovoj extends Nazemnij {

    int gruzo; //грузоподъемность в т

    public void setGruzo(int gruzo) {
        this.gruzo = gruzo;
    }

    public int getGruzo() {
        return gruzo;
    }

    @Override
    float kilovatt() {
        return getMochnost() * 0.74f;
    }

    public void gruz(int mochnost, int maxSkor, int mass, String marka,
                     int kolesa, float rashod, int gruzo) {
        setMochnost(mochnost);
        setMaxSkor(maxSkor);
        setMass(mass);
        setMarka(marka);
        setKolesa(kolesa);
        setRashod(rashod);
        setGruzo(gruzo);
        System.out.println("Мощность: " + getMochnost() + " л.с. или " + " или " + kilovatt() + "кВ" + "\n" +
                "Максимальная скорость: " + getMaxSkor() + "км/ч" + "\n" +
                "Масса: " + getMass() + "кг" + "\n" +
                "Марка: " + getMarka() + "\n" +
                "Количество колес: " + getKolesa() + "шт" + "\n" +
                "Расход топлива: " + getRashod() + "л/100км" + "\n" +
                "Грузоподъемность: " + getGruzo() + "т");
    }

    public String zagruzka(int zagr) {
        if (zagr <= getGruzo()) {
            return "Грузовик загружен" + "\n";
        } else return "Вам нужен грузовик побольше" + "\n";
    }

}
