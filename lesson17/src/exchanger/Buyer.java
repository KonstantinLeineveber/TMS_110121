package exchanger;

public class Buyer {

    private int count = 1;
    private double USD = 1000;
    private double EUR = 1000;
    private double BYR = 100000;

    public void CurrencyExchange() {
        if (count == 1) {
            System.out.println("Я пришел купить 300 USD");
            USD -= 300;
            BYR += (300 * 2.63);
            System.out.println("Количество денег оставшихся в кассе:");
            System.out.println("USD = " + USD + '\n' + "EUR = " + EUR + '\n' + "BYR = " + BYR);
        }
        if (count == 2) {
            System.out.println("Я пришел купить 300 EUR");
            EUR -= 300;
            BYR += (300 * 3.1);
            System.out.println("Количество денег оставшихся в кассе:");
            System.out.println("USD = " + USD + '\n' + "EUR = " + EUR + '\n' + "BYR = " + BYR);
        }
        if (count == 3) {
            System.out.println("Я пришел купить 300 USD и продать 300 EUR");
            USD -= 300;
            EUR += 300;
            BYR -= (300 * 0.47);
            System.out.println("Количество денег оставшихся в кассе:");
            System.out.println("USD = " + USD + '\n' + "EUR = " + EUR + '\n' + "BYR = " + BYR);
        }
        if (count == 4) {
            System.out.println("Я пришел купить 300 EUR и продать 300 USD");
            USD += 300;
            EUR -= 300;
            BYR += (300 * 0.47);
            System.out.println("Количество денег оставшихся в кассе:");
            System.out.println("USD = " + USD + '\n' + "EUR = " + EUR + '\n' + "BYR = " + BYR);
        }
        if (count == 5) {
            System.out.println("Я пришел купить 300 EUR и 300 USD");
            USD -= 300;
            EUR -= 300;
            BYR += (300 * 5.73);
            System.out.println("Количество денег оставшихся в кассе:");
            System.out.println("USD = " + USD + '\n' + "EUR = " + EUR + '\n' + "BYR = " + BYR);
        }
        if (count == 6) {
            System.out.println("Я пришел продать 300 EUR и 300 USD");
            USD += 300;
            EUR += 300;
            BYR -= (300 * 5.73);
            System.out.println("Количество денег оставшихся в кассе:");
            System.out.println("USD = " + USD + '\n' + "EUR = " + EUR + '\n' + "BYR = " + BYR);
            count = 0;
        }

        count++;
    }
}
