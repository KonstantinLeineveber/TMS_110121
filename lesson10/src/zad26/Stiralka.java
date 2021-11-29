package zad26;

public class Stiralka extends KrupnayaBitTech {
    private final String name;
    private final int dateVip;
    private final String color;

    public Stiralka(String name, String color, int dateVip, int dlina, int shrina, int visota, int ves) {
        this.name = name;
        this.dateVip = dateVip;
        this.color = color;
        super.setDlina(dlina);
        super.setShirina(shrina);
        super.setVisota(visota);
        super.setVes(ves);
    }

    @Override
    public String toString() {
        return "Stiralnaya mashina{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", data vipuska=" + dateVip + '\'' +
                ", dlina=" + super.getDlina() + '\'' +
                ", shirina=" + super.getShirina() + '\'' +
                ", visota=" + super.getVisota() + '\'' +
                ", ves=" + super.getVes() + '\'' +
                '}';
    }

}
