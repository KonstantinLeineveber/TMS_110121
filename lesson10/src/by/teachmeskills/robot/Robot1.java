package by.teachmeskills.robot;

import by.teachmeskills.robot.hands.ToshibaHand;
import by.teachmeskills.robot.heads.SonyHead;
import by.teachmeskills.robot.legs.SamsungLeg;

public class Robot1 implements IRobot {
    private SonyHead head;
    private ToshibaHand hand;
    private SamsungLeg leg;

    public Robot1(SonyHead head, ToshibaHand hand, SamsungLeg leg) {
        this.head = head;
        this.hand = hand;
        this.leg = leg;
    }

    public Robot1() {
    }

    public SonyHead getHead() {
        return head;
    }

    public void setHead(SonyHead head) {
        this.head = head;
    }

    public ToshibaHand getHand() {
        return hand;
    }

    public void setHand(ToshibaHand hand) {
        this.hand = hand;
    }

    public SamsungLeg getLeg() {
        return leg;
    }

    public void setLeg(SamsungLeg leg) {
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
