package zad27;

public class kartochka extends plastikovaya {
    private final int dataIzgM, dataIzgY, dataOk;
    private String bank, nameDer;
    private long nomerKart;


    public kartochka(String bank, String nameDer, long nomerKart, int dataIzgM, int dataIzgY) {
        this.bank = bank;
        this.nameDer = nameDer;
        this.nomerKart = nomerKart;
        this.dataIzgM = dataIzgM;
        this.dataIzgY = dataIzgY;
        this.dataOk = this.dataIzgY + 5;
        System.out.println("Ваша банковская карта {" +
                "bank='" + bank + '\'' +
                ", name dergatelya='" + nameDer + '\'' +
                ", nomer kartochki='" + nomerKart + '\'' +
                ", data izgotovleniya='" + dataIzgM + "/" + dataIzgY + '\'' +
                ", goden do='" + dataIzgM + "/" + dataOk + '\'' +
                '}');
        super.bip();
    }


}
