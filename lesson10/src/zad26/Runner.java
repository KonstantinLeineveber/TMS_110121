package zad26;

public class Runner {
    public static void main(String[] args) {
        Stiralka stiralnaya = new Stiralka("Staraya sovetskaya", "white", 1945, 60, 60, 140, 25);
        System.out.println(stiralnaya);
        stiralnaya.vkl();
        stiralnaya.vikl();
        Stiralka stiralnaya2 = new Stiralka("Aqua", "black", 2020, 100, 100, 150, 50);
        System.out.println(stiralnaya2);
        stiralnaya2.vkl();
        stiralnaya2.vikl();
    }

}
