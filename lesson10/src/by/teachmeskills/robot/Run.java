package by.teachmeskills.robot;

import by.teachmeskills.robot.hands.SamsungHand;
import by.teachmeskills.robot.hands.SonyHand;
import by.teachmeskills.robot.hands.ToshibaHand;
import by.teachmeskills.robot.heads.SamsungHead;
import by.teachmeskills.robot.heads.SonyHead;
import by.teachmeskills.robot.heads.ToshibaHead;
import by.teachmeskills.robot.legs.SamsungLeg;
import by.teachmeskills.robot.legs.SonyLeg;
import by.teachmeskills.robot.legs.ToshibaLeg;

public class Run {
    public static void main(String[] args) {
        /*
        Создать по 3 реализации(Sony, Toshiba, Samsung) каждой запчасти(IHead, IHand, ILeg)
        Класс SonyHead является примером реализацией головы от Sony.
        Создайте 3 робота с разными комплектующими.
        Например у робота голова и нога от Sony а, рука от Samsung.
        У всех роботов вызовите метод action.
        Среди 3-х роботов найдите самого дорогого.
        */

        Robot1 robot1 = new Robot1();
        robot1.setHand(new ToshibaHand(600));
        robot1.setHead(new SonyHead(1600));
        robot1.setLeg(new SamsungLeg(800));
        System.out.println("Первый робот:");
        robot1.action();
        System.out.println("Стоимость первого робота = " + robot1.getPrice() + "$" + '\n');
        Robot2 robot2 = new Robot2();
        robot2.setHand(new SonyHand(1400));
        robot2.setHead(new SamsungHead(1500));
        robot2.setLeg(new ToshibaLeg(400));
        System.out.println("Второй робот:");
        robot2.action();
        System.out.println("Стоимость второго робота = " + robot2.getPrice() + "$" + '\n');
        Robot3 robot3 = new Robot3();
        robot3.setHand(new SamsungHand(1300));
        robot3.setHead(new ToshibaHead(2000));
        robot3.setLeg(new SonyLeg(900));
        System.out.println("Третий робот:");
        robot3.action();
        System.out.println("Третий второго робота = " + robot3.getPrice() + "$" + '\n');
    }
}
