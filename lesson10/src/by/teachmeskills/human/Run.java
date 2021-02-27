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

        Human human = new Human(new Kosuha(), new Bruki(), new Botinki());
        System.out.println("Первый человек:");
        System.out.println("Мое имя - " + human.name("Петя") + " и вот моя история");
        human.odet();
        System.out.println("Спустя какое-то время");
        human.snyat();
        System.out.println();

        Human2 human2 = new Human2(new Parka(), new Jinsi(), new Sapogi());
        System.out.println("Второй человек:");
        System.out.println("Мое имя - " + human.name("Коля") + " и вот моя история");
        human.odet();
        System.out.println("Спустя какое-то время");
        human.snyat();
        System.out.println();

        Human3 human3 = new Human3(new Puhovik(), new Joggeri(), new Tufli());
        System.out.println("Третий человек:");
        System.out.println("Мое имя - " + human.name("Толя") + " и вот моя история");
        human.odet();
        System.out.println("Спустя какое-то время");
        human.snyat();

    }
}
