package zad24;

class Runner {
    public static void main(String[] args) {


        Vremya a = new Vremya(1163, 32360, 165);
        Vremya.print(a);
        System.out.println();
        Vremya b = new Vremya(144123, 2, 7552);
        Vremya.print(b);
        System.out.println();
        a.compareTo(b);

    }
}
