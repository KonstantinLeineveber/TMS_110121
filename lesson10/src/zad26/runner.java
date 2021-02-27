package zad26;

public class runner {
    public static void main(String[] args) {
        stiralka stiralnaya = new stiralka("Staraya sovetskaya", "white", 1945, 60, 60, 140, 25);
        System.out.println(stiralnaya);
        stiralnaya.vkl();
        stiralnaya.vikl();
        stiralka stiralnaya2 = new stiralka("Aqua", "black", 2020, 100, 100, 150, 50);
        System.out.println(stiralnaya2);
        stiralnaya2.vkl();
        stiralnaya2.vikl();
    }

}
