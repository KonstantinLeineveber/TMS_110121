package by.teachmeskills.robot;

import by.teachmeskills.robot.hands.SamsungHand;
import by.teachmeskills.robot.heads.ToshibaHead;
import by.teachmeskills.robot.legs.SonyLeg;

public class Robot3 implements IRobot {
    private ToshibaHead head;
    private SamsungHand hand;
    private SonyLeg leg;

    public Robot3(ToshibaHead head, SamsungHand hand, SonyLeg leg) {
        this.head = head;
        this.hand = hand;
        this.leg = leg;
    }

    public Robot3() {
    }

    public ToshibaHead getHead() {
        return head;
    }

    public void setHead(ToshibaHead head) {
        this.head = head;
    }

    public SamsungHand getHand() {
        return hand;
    }

    public void setHand(SamsungHand hand) {
        this.hand = hand;
    }

    public SonyLeg getLeg() {
        return leg;
    }

    public void setLeg(SonyLeg leg) {
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
