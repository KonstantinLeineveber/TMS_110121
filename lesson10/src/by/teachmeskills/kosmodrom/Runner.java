package by.teachmeskills.kosmodrom;

public class Runner extends Kosmodrom {
    public static void main(String[] args) {

        Shattl shattl = new Shattl();
        shattl.zapusk(shattl);
        System.out.println();
        SpaceX spaceX = new SpaceX();
        spaceX.zapusk(spaceX);
        System.out.println();
        SpaceRanger spaceRanger = new SpaceRanger();
        spaceRanger.zapusk(spaceRanger);

    }
}
