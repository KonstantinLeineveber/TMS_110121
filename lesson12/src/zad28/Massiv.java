package zad28;

import java.util.ArrayList;

public class Massiv<T> {
//    Написать класс, который умеет хранить в себе массив любых типов данных (int, long
//    etc.). Реализовать метод get(int index), который возвращает любой элемент
//    массива по индексу.

    private T[] array;

    public T[] getArray() {
        return array;
    }

    public void setArray(T... array) {
        this.array = array;
    }

    public T get(int numberOfArray) {
        return array[numberOfArray];
    }


}
