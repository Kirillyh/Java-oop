package ru.geekbrains;

import java.util.List;

public class VendingMachine {

    private final List<Product> products;             // объявление приватной неизменяемой переменной products, которая является списком продуктов

    public VendingMachine(List<Product> products) {     // объявление конструктора класса VendingMachine с параметром products
        this.products = products;                      // присваивание значения переменной products
    }

    public BottleOfWater getBottleOfWater(String name, int volume){    // объявление метода getBottleOfWater для получения объекта класса BottleOfWater с указанным именем и объемом
        for (Product product: products) {             // цикл по продуктам в списке products
            if (product instanceof BottleOfWater){     // проверка, является ли продукт экземпляром класса BottleOfWater
                BottleOfWater bottle = ((BottleOfWater)product);   // приведение продукта к типу BottleOfWater
                if (bottle.name.equals(name) && bottle.getVolume() == volume)   // проверка, совпадает ли имя и объем бутылки с заданными значениями
                    return bottle;
            }
        }
        return null;          // возвращение null, если бутылка не найдена
    }
    /**
     * @param name
     * @param calories
     * @return
     */
    public ChocolateBar getChocolateBar(String name, int calories){
        for (Product product: products) {
            if (product instanceof ChocolateBar){
                ChocolateBar pack = ((ChocolateBar)product);
                if (pack.name.equals(name) && pack.getCalories() == calories)
                    return pack;
            }
        }
        return null;
    }


}

