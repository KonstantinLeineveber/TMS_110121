package by.teachmeskills.human;


import by.teachmeskills.human.kutrka.Kosuha;
import by.teachmeskills.human.obuv.Botinki;
import by.teachmeskills.human.shtani.Bruki;

public class Human implements PreHuman {
    private Kosuha kosuha;
    private Bruki bruki;
    private Botinki botinki;


    public Human(Kosuha kosuha, Bruki bruki, Botinki botinki) {
        this.kosuha = kosuha;
        this.bruki = bruki;
        this.botinki = botinki;
    }

    public Human() {
    }

    public Botinki getBotinki() {
        return botinki;
    }

    public void setBotinki(Botinki botinki) {
        this.botinki = botinki;
    }

    public Bruki getBruki() {
        return bruki;
    }

    public void setBruki(Bruki bruki) {
        this.bruki = bruki;
    }

    public Kosuha getKosuha() {
        return kosuha;
    }

    public void setKosuha(Kosuha kosuha) {
        this.kosuha = kosuha;
    }

    @Override
    public String name(String name) {
        return name;
    }

    @Override
    public void odet() {
        kosuha.nadetKurtka();
        bruki.nadetShtani();
        botinki.nadetObuv();
    }

    @Override
    public void snyat() {
        kosuha.snyatKurtka();
        bruki.snyatShtani();
        botinki.snyatObuv();
    }


}

