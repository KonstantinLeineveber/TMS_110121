package zad27;

public class Kartochka extends Plastikovaya {
    private final int dataIzgM, dataIzgY, dataOk;
    private String bank, nameDer;
    private long nomerKart;


    public Kartochka(String bank, String nameDer, long nomerKart, int dataIzgM, int dataIzgY) {
        this.bank = bank;
        this.nameDer = nameDer;
        this.nomerKart = nomerKart;
        this.dataIzgM = dataIzgM;
        this.dataIzgY = dataIzgY;
        this.dataOk = this.dataIzgY + 5;
        super.bip();
    }

    @Override
    public String toString() {
        return "Ваша банковская карта {" +
                "bank='" + bank + '\'' +
                ", name dergatelya='" + nameDer + '\'' +
                ", nomer kartochki='" + nomerKart + '\'' +
                ", data izgotovleniya='" + dataIzgM + "/" + dataIzgY + '\'' +
                ", goden do='" + dataIzgM + "/" + dataOk + '\'';
    }

}
