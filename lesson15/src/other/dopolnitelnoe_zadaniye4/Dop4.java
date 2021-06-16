package other.dopolnitelnoe_zadaniye4;

import java.io.*;

public class Dop4 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        4) Сеарилизовать объект Автомобиль(Марка, скорость, цена). После
//        сериализации произвести обратный процесс
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("d:/tms/TMS_110121/lesson15/src/other/dopolnitelnoe_zadaniye4/Serializable.dat"));
        Car c = new Car("BMV X8", 280.0F, 160000);
        oos.writeObject(c);
        oos.close();
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("d:/tms/TMS_110121/lesson15/src/other/dopolnitelnoe_zadaniye4/Serializable.dat"));
        Car a = (Car) ois.readObject();
        System.out.println("Марка автомобиля - " + a.getMarka());
        System.out.println("Скорость автомобиля - " + a.getSpeed() + "км/ч");
        System.out.println("Цена автомобиля - " + a.getPrice() + "$");
    }

    static class Car implements Serializable {
        private String marka;
        private float speed;
        private int price;

        public Car(String marka, float speed, int price) {
            this.marka = marka;
            this.speed = speed;
            this.price = price;
        }

        public String getMarka() {
            return marka;
        }

        public void setMarka(String marka) {
            this.marka = marka;
        }

        public float getSpeed() {
            return speed;
        }

        public void setSpeed(float speed) {
            this.speed = speed;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }
    }
}
