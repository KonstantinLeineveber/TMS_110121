package metodichka.zad1;

public abstract class Nazemnij extends Transport {

    int kolesa; //количество колес
    float rashod; //расход топлива в л/100км

    public void setKolesa(int kolesa) {
        this.kolesa = kolesa;
    }

    public int getKolesa() {
        return kolesa;
    }

    public void setRashod(float rashod) {
        this.rashod = rashod;
    }

    public double getRashod() {
        return rashod;
    }
}
