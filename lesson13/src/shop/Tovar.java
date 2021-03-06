package shop;

public class Tovar {

    //    Создать класс Товар, поля:
//•id(целое число)
//•name(строка)
//•price(целое число)
    private int id;
    private String name;
    private int price;

    public int getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Tovar(int id, String name, int price) {
        setId(id);
        setName(name);
        setPrice(price);

    }

    @Override
    public String toString() {
        return "Информация о товаре:" + '\n' +
                "Наименование товара: " + getName() + '\n' +
                "Цена: " + getPrice() + '\n' +
                "id товара: " + getId() + '\n';
    }
}

