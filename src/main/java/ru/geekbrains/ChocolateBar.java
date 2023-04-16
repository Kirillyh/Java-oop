package ru.geekbrains;

public class ChocolateBar extends Product {
    private int calories;        // объявление приватной переменной calories

    public ChocolateBar(String name, double price, int calories) {  // конструктор класса ChocolateBar с параметрами name, price и calories
        super(name, price);                 // вызов конструктора суперкласса Product с параметрами name и price
        this.calories = calories;             // присвоение значений переменной calories
    }

    public int getCalories() {               // метод для получения значения переменной calories
        return calories;
    }
    @Override            // переопределение метода displayInfo класса Product
    public String displayInfo() {
        //return super.displayInfo();
        return String.format("%s - %s - %f - объем: %d", brand, name, price, calories);   // возвращение строки с информацией о бутылке
    }
}