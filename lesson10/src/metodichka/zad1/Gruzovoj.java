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

    public StringBuilder gruz(int mochnost, int maxSkor, int mass, String marka,
                              int kolesa, float rashod, int gruzo) {
        setMochnost(mochnost);
        setMaxSkor(maxSkor);
        setMass(mass);
        setMarka(marka);
        setKolesa(kolesa);
        setRashod(rashod);
        setGruzo(gruzo);
        StringBuilder s = new StringBuilder();
        s.append("Мощность: " + getMochnost() + " л.с. или " + " или " + kilovatt() + "кВ" + "\n");
        s.append("Максимальная скорость: " + getMaxSkor() + "км/ч" + "\n");
        s.append("Масса: " + getMass() + "кг" + "\n");
        s.append("Марка: " + getMarka() + "\n");
        s.append("Количество колес: " + getKolesa() + "шт" + "\n");
        s.append("Расход топлива: " + getRashod() + "л/100км" + "\n");
        s.append("Грузоподъемность: " + getGruzo() + "т");
        return s;
    }

    public String zagruzka(int zagr) {
        if (zagr <= getGruzo()) {
            return "Грузовик загружен" + "\n";
        } else return "Вам нужен грузовик побольше" + "\n";
    }

}
