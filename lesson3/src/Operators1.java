public class Operators1 {

        public static void main(String[] args) {
            int s = 4500;
            int sec = s % 60;
            int m = (s - sec) / 60;
            int min = m % 60;
            int h = (m - min) / 60;
            int hours = h % 24;
            int d = (h - hours) / 24;
            int days = d % 7;
            int w = (d - days) / 7;

            System.out.println(m + " минут " + sec + " секунд");
            System.out.println(h + " часов " + min + " минут " + sec + " секунд");
            System.out.println(d + " дней " + hours + " часов " + min + " минут " + sec + " секунд");
            System.out.println(w + " недель " + days + " дней " + hours + " часов " + min + " минут " + sec + " секунд");
        }
    }
