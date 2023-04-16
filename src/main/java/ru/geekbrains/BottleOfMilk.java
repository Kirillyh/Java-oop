package ru.geekbrains;

public class BottleOfMilk extends Product {
// объявление приватных переменных класса
    private int volume;
    private int fat;
// объявление метода getVolume для получения значения переменной volume
    public int getVolume() {
        return volume;
    }
// объявление конструктора класса BottleOfMilk с параметрами name, price, volume и fat
    public BottleOfMilk(String name, double price, int volume, int fat){
        super(name, price);        // вызов конструктора суперкласса Product с параметрами name и price
        this.volume = volume;      // присваивание значения переменной volume
        this.fat = fat;            // присваивание значения переменной fat
    }

    @Override                      // переопределение метода displayInfo класса Product
    public String displayInfo() {
        //return super.displayInfo();
        return String.format("%s - %s - %f - объем: %d", brand, name, price, volume);   // возвращение строки с информацией о бутылке молока

    }

}