package zad28;

public class Runner extends Massiv {
    public static void main(String[] args) {

        Massiv<Number> arr = new Massiv<>();
        arr.setArray(16, 15, 11516, 15.3, 182, 1616, 4841, 616);
        System.out.println(arr.get(6));
    }
}