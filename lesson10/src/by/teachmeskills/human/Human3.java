package by.teachmeskills.human;

import by.teachmeskills.human.kutrka.Puhovik;
import by.teachmeskills.human.obuv.Tufli;
import by.teachmeskills.human.shtani.Joggeri;

public class Human3 implements PreHuman {
    private Puhovik puhovik;
    private Joggeri joggeri;
    private Tufli tufli;


    public Human3(Puhovik puhovik, Joggeri joggeri, Tufli tufli) {
        this.puhovik = puhovik;
        this.joggeri = joggeri;
        this.tufli = tufli;
    }

    public Human3() {
    }

    public Joggeri getJoggeri() {
        return joggeri;
    }

    public void setJoggeri(Joggeri joggeri) {
        this.joggeri = joggeri;
    }

    public Puhovik getPuhovik() {
        return puhovik;
    }

    public void setPuhovik(Puhovik puhovik) {
        this.puhovik = puhovik;
    }

    public Tufli getTufli() {
        return tufli;
    }

    public void setTufli(Tufli tufli) {
        this.tufli = tufli;
    }

    @Override
    public String name(String name) {
        return name;
    }

    @Override
    public void odet() {
        puhovik.nadetKurtka();
        joggeri.nadetShtani();
        tufli.nadetObuv();
    }

    @Override
    public void snyat() {
        puhovik.snyatKurtka();
        joggeri.snyatShtani();
        tufli.snyatObuv();
    }


}
