package metodichka.zad1;

class Runner {
    public static void main(String[] args) {
        Legkovoj legkovoj = new Legkovoj();
        System.out.println("Легковой автомобиль:");
        legkovoj.legk(100, 250, 500, "Porshe", 4, (float) 3.8, "Pickup", 2);
        System.out.println(legkovoj.vremya(6));

        Gruzovoj gruzovoj = new Gruzovoj();
        System.out.println("Грузовой автомобиль:");
        gruzovoj.gruz(400, 200, 500, "MAZ", 16, (float) 6.8, 5);
        System.out.println(gruzovoj.zagruzka(6));

        Graghdanskij graghdanskij = new Graghdanskij();
        System.out.println("Гражданский самолет:");
        graghdanskij.gragh(800, 650, 2500, "Airbus", 25, 1600, 100, true);
        System.out.println(graghdanskij.posadka(99));

        Voennij voennij = new Voennij();
        System.out.println("Военный самолет:");
        voennij.voenn(1500, 980, 300, "ИЛ-72", 15, 500, true, 1);
        System.out.println(voennij.katap());
        System.out.println(voennij.zapuskRaket());
        System.out.println(voennij.zapuskRaket());
    }

}
