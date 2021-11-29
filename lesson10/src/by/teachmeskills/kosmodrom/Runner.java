package by.teachmeskills.kosmodrom;

public class Runner extends Kosmodrom {
    public static void main(String[] args) {

        Istart shattl = new Shattl();
        Kosmodrom.zapusk(shattl);
        System.out.println();
        Istart spaceX = new SpaceX();
        Kosmodrom.zapusk(spaceX);
        System.out.println();
        Istart spaceRanger = new SpaceRanger();
        Kosmodrom.zapusk(spaceRanger);

    }
}
