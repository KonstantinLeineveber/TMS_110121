package by.teachmeskills.human;

import by.teachmeskills.human.kutrka.Parka;
import by.teachmeskills.human.obuv.Sapogi;
import by.teachmeskills.human.shtani.Jinsi;

public class Human2 implements PreHuman {
    private Parka parka;
    private Jinsi jinsi;
    private Sapogi sapogi;

    public Human2(Parka kosuha, Jinsi jinsi, Sapogi sapogi) {
        this.parka = kosuha;
        this.jinsi = jinsi;
        this.sapogi = sapogi;
    }

    public Human2() {
    }

    public Jinsi getJinsi() {
        return jinsi;
    }

    public void setJinsi(Jinsi jinsi) {
        this.jinsi = jinsi;
    }

    public Parka getParka() {
        return parka;
    }

    public void setParka(Parka parka) {
        this.parka = parka;
    }

    public Sapogi getSapogi() {
        return sapogi;
    }

    public void setSapogi(Sapogi sapogi) {
        this.sapogi = sapogi;
    }

    @Override
    public String name(String name) {
        return name;
    }

    @Override
    public void odet() {
        parka.nadetKurtka();
        jinsi.nadetShtani();
        sapogi.nadetObuv();
    }

    @Override
    public void snyat() {
        parka.snyatKurtka();
        jinsi.snyatShtani();
        sapogi.snyatObuv();
    }


}

