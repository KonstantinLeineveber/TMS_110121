package zad26;

public class stiralka extends krupnaya_bit_tech {
    public String name;
    public int dateVip;
    public String color;

    public stiralka(String name, String color, int dateVip, int dlina, int shrina, int visota, int ves) {
        this.name = name;
        this.dateVip = dateVip;
        this.color = color;
        this.dlina = dlina;
        this.shirina = shrina;
        this.visota = visota;
        this.ves = ves;
    }

//    @Override        С этим нужна помощь!!!
//    public void vkl() {if (name == "Staraya sovetskaya" & this.getRazetka() == false) {
//            System.out.println("Я вставлен в розетку и издаю шум, что берегитесь соседи");
//            this.setRazetka (true);
//        } else System.out.println("Я давно вставлен в розетку");
//    }


    @Override
    public String toString() {
        return "Stiralnaya mashina{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", data vipuska=" + dateVip + '\'' +
                ", dlina=" + dlina + '\'' +
                ", shirina=" + shirina + '\'' +
                ", visota=" + visota + '\'' +
                ", ves=" + ves + '\'' +
                '}';
    }

}
