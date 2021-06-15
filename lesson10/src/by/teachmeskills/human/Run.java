package by.teachmeskills.human;

import by.teachmeskills.human.kutrka.Kosuha;
import by.teachmeskills.human.kutrka.Kurtka;
import by.teachmeskills.human.kutrka.Parka;
import by.teachmeskills.human.kutrka.Puhovik;
import by.teachmeskills.human.obuv.Botinki;
import by.teachmeskills.human.obuv.Obuv;
import by.teachmeskills.human.obuv.Sapogi;
import by.teachmeskills.human.obuv.Tufli;
import by.teachmeskills.human.shtani.Bruki;
import by.teachmeskills.human.shtani.Jinsi;
import by.teachmeskills.human.shtani.Joggeri;
import by.teachmeskills.human.shtani.Shtani;

public class Run {
    public static void main(String[] args) {

        Kurtka kosuha = new Kosuha();
        Kurtka parka = new Parka();
        Kurtka puhovik = new Puhovik();
        Shtani bruki = new Bruki();
        Shtani jinsi = new Jinsi();
        Shtani joggeri = new Joggeri();
        Obuv botinki = new Botinki();
        Obuv sapogi = new Sapogi();
        Obuv tufli = new Tufli();

        PreHuman human = new Human(kosuha, bruki, botinki);
        System.out.println("Первый человек:");
        System.out.println("Мое имя - " + human.name("Петя") + " и вот моя история");
        human.odet();
        System.out.println("Спустя какое-то время");
        human.snyat();
        System.out.println();

        PreHuman human2 = new Human(parka, jinsi, sapogi);
        System.out.println("Второй человек:");
        System.out.println("Мое имя - " + human.name("Коля") + " и вот моя история");
        human2.odet();
        System.out.println("Спустя какое-то время");
        human2.snyat();
        System.out.println();

        PreHuman human3 = new Human(puhovik, joggeri, tufli);
        System.out.println("Третий человек:");
        System.out.println("Мое имя - " + human.name("Толя") + " и вот моя история");
        human3.odet();
        System.out.println("Спустя какое-то время");
        human3.snyat();

    }
}
