package by.teachmeskills.robot;

import by.teachmeskills.robot.hands.SonyHand;
import by.teachmeskills.robot.heads.SamsungHead;
import by.teachmeskills.robot.legs.ToshibaLeg;

public class Robot2 implements IRobot {
    private SamsungHead head;
    private SonyHand hand;
    private ToshibaLeg leg;

    public Robot2(SamsungHead head, SonyHand hand, ToshibaLeg leg) {
        this.head = head;
        this.hand = hand;
        this.leg = leg;
    }

    public Robot2() {
    }

    public SamsungHead getHead() {
        return head;
    }

    public void setHead(SamsungHead head) {
        this.head = head;
    }

    public SonyHand getHand() {
        return hand;
    }

    public void setHand(SonyHand hand) {
        this.hand = hand;
    }

    public ToshibaLeg getLeg() {
        return leg;
    }

    public void setLeg(ToshibaLeg leg) {
        this.leg = leg;
    }

    @Override
    public void action() {
        head.speek();
        hand.upHand();
        leg.step();
    }

    /**
     * Get the cost of a robot
     *
     * @return int
     */
    @Override
    public int getPrice() {
        int price = head.getPrice() + hand.getPrice() + leg.getPrice();
        return price;
    }


}
