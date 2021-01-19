public class Operators3 {

    public static void main(String[] args) {
        int n = 6565;
        int a = n % 1000;
        int firstNumber = (n - a) / 1000;
        int b = a % 100;
        int twoNumber = (a - b) / 100;
        int fourNumber = b % 10;
        int threeNumber = (b - fourNumber) / 10;

        boolean q = firstNumber == twoNumber;
        boolean w = firstNumber == threeNumber;
        boolean e = firstNumber == fourNumber;
        boolean r = twoNumber == threeNumber;
        boolean t = twoNumber == fourNumber;
        boolean y = threeNumber == fourNumber;

        System.out.println(" равно ли первое и второе число? " + q);
        System.out.println(" равно ли первое и третье число? " + w);
        System.out.println(" равно ли первое и четвертое число? " + e);
        System.out.println(" равно ли второе и третье число? " + r);
        System.out.println(" равно ли третье и четвертое число? " + t);
        System.out.println(" равно ли третье и четвертое число? " + y);
    }

}
