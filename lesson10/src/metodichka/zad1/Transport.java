package metodichka.zad1;

public abstract class Transport {

    private int mochnost; // мощность в л.с.
    private int maxSkor; // максимальная скорость в км/ч
    private int mass; // масса кг
    private String marka; // марка

    public void setMochnost(int mochnost) {
        this.mochnost = mochnost;
    }

    public int getMochnost() {
        return mochnost;
    }

    public void setMaxSkor(int maxSkor) {
        this.maxSkor = maxSkor;
    }

    public int getMaxSkor() {
        return maxSkor;
    }

    public void setMass(int mass) {
        this.mass = mass;
    }

    public int getMass() {
        return mass;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getMarka() {
        return marka;
    }

    abstract float kilovatt();
}
