package ru.geekbrains;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Product product1 = new Product();    // Создаем объект класса Product с помощью конструктора по умолчанию
        //product1.brand = "ООО Источник";
        //product1.name = "Бутылка с водой";
        //product1.price = 100.15;

        System.out.println(product1.displayInfo());     // Выводим информацию о продукте на консоль

        Product product2 = new Product("Бутылка с молоком", 120.25);   // Создаем объект класса Product с помощью конструктора с параметрами
        product2.param2 = "..";
        System.out.println(product2.displayInfo());

        //product2.price = -60;
        //product2.name = "______";
        System.out.println(product2.displayInfo());

        Product product3 = new Product("ss", "__", 100);   // Создаем объект класса Product с помощью конструктора с параметрами
        System.out.println(product3.displayInfo());            // Выводим информацию о продукте на консоль
        product3.setPrice(10);                          // Изменяем цену продукта с помощью метода setPrice()

        Product bottleOfWater1 = new BottleOfWater("Бутылка1", 100, 2);     // Создаем объекты класса BottleOfWater и BottleOfMilk с помощью  конструкторов с параметрами
        Product bottleOfMilk1 = new BottleOfMilk("Молоко", 200, 1, 10);
        Product bottleOfWater2 = new BottleOfWater("Бутылка2", 100, 1);
        Product bottleOfWater3 = new BottleOfWater("Бутылка3", 100, 2);
        Product bottleOfWater4 = new BottleOfWater("Бутылка3", 100, 2);

        String s = "123";               // Создаем строки
        String aaaa = "123";
        String s1 = new String("123");

        List<Product> products = new ArrayList<>();  // Создаем список продуктов и добавляем в него объекты bottleOfWater1, bottleOfMilk1, bottleOfWater2, bottleOfWater3, bottleOfWater4
        products.add(bottleOfWater1);
        products.add(bottleOfMilk1);
        products.add(bottleOfWater2);
        products.add(bottleOfWater3);
        products.add(bottleOfWater4);
        // Создаем объект класса VendingMachine с помощью конструктора с параметром products
        VendingMachine vendingMachine = new VendingMachine(products);
        // Вызываем метод getBottleOfWater() у объекта vendingMachine и передаем ему название продукта и количество
        BottleOfWater bottleOfWaterRes = vendingMachine.getBottleOfWater("Бутылка2", 1);
        if (bottleOfWaterRes != null){
            System.out.println("Вы купили: ");
            System.out.println(bottleOfWaterRes.displayInfo());
        }
        else {
            System.out.println("Такой бутылки с водой нет в автомате.");
        }

    }
}