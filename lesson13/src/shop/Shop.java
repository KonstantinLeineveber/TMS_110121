package shop;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;


public class Shop implements Serializable {

    //    Создать класс Магазин, поля:
//•Список товаров (изначально пустой)
//методы:
//•добавить товар(принимает объект товара и добавляет его в список
//товаров). При попытке добавить товар с id уже существующем в списке,
//вставка производится не должна
//•получить все товары(метод ВОЗВРАЩАЕТ список всех товаров в
//магазине)
//•удалить товар (метод принимает id товара и удаляет из списка товар с
//соответствующим id)
//•редактировать товар(принимает объект товара и редактирует им список
//товаров)
// Обратите внимание что id товара и индекс товара в списке — это разные вещи,
//не перепутайте. Id товара — это поле вашего объекта, которое должно
// автоматически задаваться при создании каждого нового товара и должно быть
// уникальным (начинаться должно с 1). А индекс товара в списке товаров, это
// по сути его порядковый номер в списке(начинается с 0).
    ArrayList<Tovar> arrayTovar = new ArrayList<>();

    public void addTovar(Tovar tovar) {
        for (Tovar tov : arrayTovar) {
            if (tovar.getId() == tov.getId()) {
                return;
            }
        }
        arrayTovar.add(tovar);
    }

    public void vseTovari() {
        arrayTovar.sort(Comparator.comparing(obj -> obj.getId()));
        for (Tovar tov : arrayTovar) {
            System.out.println(tov);
        }
    }

    public void vseTovariPoCene() {
        arrayTovar.sort(Comparator.comparing(obj -> obj.getPrice()));
        for (Tovar tov : arrayTovar) {
            System.out.println(tov);
        }
    }

    public void vseTovaripoDescindingDataDobavleniya() {
        for (int i = 0; i < arrayTovar.size(); i++) {
            System.out.println(arrayTovar.get(arrayTovar.size() - 1 - i));
        }
    }

    public void removeTovar(int id) {
        for (Tovar tov1 : arrayTovar) {
            if (tov1.getId() == id) {
                arrayTovar.remove(arrayTovar.indexOf(tov1));
                return;
            }
        }
    }


    public void setTovar(int ID, Tovar tovar) {
        for (Tovar tov1 : arrayTovar) {
            if (tov1.getId() == ID) {
                tov1.setId(tovar.getId());
                tov1.setName(tovar.getName());
                tov1.setPrice(tovar.getPrice());
                return;
            }
        }

    }

}