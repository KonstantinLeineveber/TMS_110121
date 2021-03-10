package blinov3;

public class Runner {
    public static void main(String[] args) {
        Account account = new Account();
        account.snyatAction(900);
        account.postAction(400);
        account.platAction(800);
        System.out.println(account);


    }
}
