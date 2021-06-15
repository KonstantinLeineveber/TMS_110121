package by.teachmeskills.robot;

import by.teachmeskills.robot.hands.IHand;
import by.teachmeskills.robot.hands.SamsungHand;
import by.teachmeskills.robot.hands.SonyHand;
import by.teachmeskills.robot.hands.ToshibaHand;
import by.teachmeskills.robot.heads.IHead;
import by.teachmeskills.robot.heads.SamsungHead;
import by.teachmeskills.robot.heads.SonyHead;
import by.teachmeskills.robot.heads.ToshibaHead;
import by.teachmeskills.robot.legs.ILeg;
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
        IHand toshibaHand = new ToshibaHand(600);
        IHand sonyHand = new SonyHand(1400);
        IHand samsungHand = new SamsungHand(1300);
        IHead sonyHead = new SonyHead(1600);
        IHead samsungHead = new SamsungHead(1500);
        IHead toshibaHead = new ToshibaHead(2000);
        ILeg samsungLeg = new SamsungLeg(800);
        ILeg toshibaLeg = new ToshibaLeg(400);
        ILeg sonyLeg = new SonyLeg(900);

        Robot robot1 = new Robot(sonyHead, toshibaHand, samsungLeg);
        System.out.println("Первый робот:");
        robot1.action();
        System.out.println("Стоимость первого робота = " + robot1.getPrice() + "$" + '\n');
        Robot robot2 = new Robot(samsungHead, sonyHand,toshibaLeg);
        System.out.println("Второй робот:");
        robot2.action();
        System.out.println("Стоимость второго робота = " + robot2.getPrice() + "$" + '\n');
        Robot robot3 = new Robot(toshibaHead, samsungHand,sonyLeg);
        System.out.println("Третий робот:");
        robot3.action();
        System.out.println("Третий второго робота = " + robot3.getPrice() + "$" + '\n');
    }
}
