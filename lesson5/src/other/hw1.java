package other;

public class hw1 {
    public static void main(String[] args) {
//        Начав тренировки, спортсмен в первый день пробежал 10 км.
//        Каждый день он увеличивал дневную норму на 10% нормы предыдущего дня.
//        Какой суммарный путь пробежит спортсмен за 7 дней?
        double preSumm = 10;
        double summ = 10;
        for (int beg = 1; beg < 7; beg++) {
            preSumm *= 1.1;
            summ += preSumm;
        }
        summ =  (int) summ;
        System.out.println(summ);
    }
}
