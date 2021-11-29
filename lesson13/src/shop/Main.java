package shop;

public class Main extends Shop {
    public static void main(String[] args) {
//        В main:
//•создаем объект магазина
//•создаем пару тройку товаров и добавляем эти товары в магазин
//•получаем список товаров из магазина, сортируем по цене(по
// возрастанию) и выводим в консоль.
//•удаляем один товар
//•получаем список товаров из магазина, сортируем по порядку
// добавления(последние добавленные в начале) и выводим в консоль.
//•редактируем один товар
//•получаем список товаров и выводим в консоль


        Tovar tovar = new Tovar(1, "Картошка", 2);
        Tovar tovar2 = new Tovar(2, "Котлета", 4);
        Tovar tovar3 = new Tovar(3, "Компот", 1);
        Tovar tovar4 = new Tovar(6, "Биг-мак", 8);
        Tovar tovar5 = new Tovar(5, "Джинсы", 68);
        Shop shop = new Shop();
        shop.addTovar(tovar);
        shop.addTovar(tovar2);
        shop.addTovar(tovar3);
        System.out.println("Весь список товаров -");
        shop.vseTovariPoCene();
        shop.removeTovar(1);
        shop.addTovar(tovar5);
        System.out.println("Список товаров после удаления -");
        shop.vseTovaripoDescindingDataDobavleniya();
        System.out.println("Список товаров после редактирования -");
        shop.setTovar(3, tovar4);
        shop.vseTovari();


    }
}
