package by.teachmeskills.human;


import by.teachmeskills.human.kutrka.Kurtka;
import by.teachmeskills.human.obuv.Obuv;
import by.teachmeskills.human.shtani.Shtani;

public class Human implements PreHuman {
    private Kurtka kurtka;
    private Shtani shtani;
    private Obuv obuv;


    public Human(Kurtka kurtka, Shtani shtani, Obuv obuv) {
        this.kurtka = kurtka;
        this.shtani = shtani;
        this.obuv = obuv;
    }

    public Human() {
    }

    public Obuv getObuv() {
        return obuv;
    }

    public void setObuv(Obuv obuv) {
        this.obuv = obuv;
    }

    public Shtani getShtani() {
        return shtani;
    }

    public void setShtani(Shtani shtani) {
        this.shtani = shtani;
    }

    public Kurtka getKurtka() {
        return kurtka;
    }

    public void setKurtka(Kurtka kurtka) {
        this.kurtka = kurtka;
    }

    @Override
    public String name(String name) {
        return name;
    }

    @Override
    public void odet() {
        kurtka.nadetKurtka();
        shtani.nadetShtani();
        obuv.nadetObuv();
    }

    @Override
    public void snyat() {
        kurtka.snyatKurtka();
        shtani.snyatShtani();
        obuv.snyatObuv();
    }


}

