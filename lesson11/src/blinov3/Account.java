package blinov3;

class Account {
//    3. Создать класс Account с внутренним классом,
//    с помощью объектов которого можно хранить информацию
//    обо всех операциях со счетом (снятие, платежи, поступления).

    private AccountAction action;

    private class AccountAction {
        private int snyat, plat, post;

        public void setSnyat(int snyat) {
            this.snyat = snyat;
        }

        public void setPlat(int plat) {
            this.plat = plat;
        }

        public void setPost(int post) {
            this.post = post;
        }
    }

    public void postAction(int post) {
        action.setPost(post);
    }

    public void snyatAction(int snyat) {
        action = new AccountAction();
        action.setSnyat(snyat);
    }

    public void platAction(int plat) {
        action.setPlat(plat);
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append(" Зачислено - " + action.post + "\n");
        s.append(" Оплачено - " + action.plat + "\n");
        s.append(" Снято - " + action.snyat + "\n");
        return s.toString();
    }
}