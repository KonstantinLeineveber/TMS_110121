package annotations;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Runner {

    public static void main(String[] args) throws Exception {
        //    Придумать и написать собственную аннотацию @Version,
//    которая бует хранить информацию о версии класса сервиса
//    (поле обязательное) MyService и кодовое название версии (поле не обязательное)
//    - (например номер версии = 7.1, а кодовое название версии = Nougat).
//    Класс MyService должен иметь переменные c private модификаторами,
//    конструктор по умолчанию, get и set методы, переопределенные методы
//    equals и hashcode, а так же private метод (private thisClassInfo),
//    который будет просто печатать данные о самом классе (данные любые на ваш выбор),
//    в котором он определен.
//    Написать программу, которая будет анализировать присутствие
//    аннотации над классом MyService и если она присутствует - создавать
//    экземпляр этого класса, задавать значения его полям и вызывать метод
//    thisClassInfo (использовать возможности пакета reflection).

        Class<MyService> clazz = MyService.class;
        inspectService(clazz);


    }

    private static void inspectService(Class<MyService> clazz) throws Exception {
        boolean isAnnotated = clazz.isAnnotationPresent(Version.class);
        if (isAnnotated) {
            MyService myService1 = (MyService) clazz.newInstance();
            MyService myService2 = (MyService) clazz.newInstance();
            Method[] methods = clazz.getDeclaredMethods();
            for (Method m : methods) {
                Version annotation = m.getAnnotation(Version.class);
            }
            myService2.setFontSize(3.6);
            myService2.setOption("Armagedon");
            Field privateStringField = clazz.getDeclaredField("dataVersion");

            privateStringField.setAccessible(true);
            privateStringField.set(myService2, "12.03.2005");
            String fieldValue = (String) privateStringField.get(myService2);

            Method method = clazz.getDeclaredMethod("thisClassInfo");
            method.setAccessible(true);
            String returnValue = (String)
                    method.invoke(myService1);
            String returnValue2 = (String)
                    method.invoke(myService2);

            System.out.println("MyService1:" + '\n' + returnValue);
            System.out.println("Дата выпуска версии = " + fieldValue + '\n');
            System.out.println("MyService2:" + '\n' + returnValue2);
            System.out.println("Дата выпуска версии = " + fieldValue + '\n');
            System.out.println("Можно ли сравнить MyService1 и MyService2? - " + '\n' + myService1.equals(myService2));

        } else {
            System.out.printf("Class [ %s ] not annotated with `Version` annotation", clazz.getName());
        }
    }
}