public class Operators2 {

        public static void main(String[] args) {
            int n = 5498;
            int a = n % 1000;
            int firstNumber = (n - a) / 1000;
            int b = a % 100;
            int twoNumber = (a - b) / 100;
            int fourNumber = b % 10;
            int threeNumber = (b - fourNumber) / 10;
            int obrat = fourNumber*1000+threeNumber*100+twoNumber*10+firstNumber;

            System.out.print(obrat);
        }
    }

