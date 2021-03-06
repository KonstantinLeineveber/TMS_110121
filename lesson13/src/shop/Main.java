package shop;

public class Main extends Shop {
    public static void main(String[] args) {

        Tovar tovar = new Tovar(1, "Картошка", 2);
        Tovar tovar2 = new Tovar(2, "Котлета", 4);
        Tovar tovar3 = new Tovar(3, "Компот", 1);
        Tovar tovar4 = new Tovar(6, "Биг-мак", 8);
        Shop shop = new Shop();
        System.out.println("Весь список товаров -");
        shop.addTovar(tovar);
        shop.addTovar(tovar2);
        shop.addTovar(tovar3);
        shop.vseTovari();
        shop.removeTovar(1);
        System.out.println("Список товаров после удаления -");
        shop.vseTovari();
        System.out.println("Список товаров после редактирования -");
        shop.setTovar(3, tovar4);
        shop.vseTovari();


    }
}
