package metodichka.zad1;

public abstract class Vozdushnij extends Transport {

    int razmah; // размах крыльев в м
    int minDlina; // Минимальная длина взлётно-посадочной полосы для взлёта в м

    public void setRazmah(int razmah){this.razmah = razmah;}
    public int getRazmah(){return razmah;}
    public void setMinDlina(int minDlina){this.minDlina = minDlina;}
    public int getMinDlina() {return minDlina;}



}
