package ru.geekbrains;

public class Product {
        // Определяем поля класса
    protected String name;   // Наименование продукта
    protected String brand;   // Производитель продукта
    protected  double price;

    public double getPrice(){  // Определяем метод для получения цены продукта
        return price;
    }

    //mutator
    public void setPrice(double price){      // Определяем метод для изменения цены продукта
        if (price <= 0)
            throw new RuntimeException("Некорректная сумма товара.");
        this.price = price;
    }

    // accessor                // Определяем метод для получения наименования продукта
    public String getName() {
        return name;
    }

    public void setName(String name) {  // Определяем метод для изменения наименования продукта
        this.name = name;
    }

    public String getBrand() {           // Определяем метод для получения производителя продукта
        return brand;
    }

    public void setBrand(String brand) {   // Определяем метод для изменения производителя продукта
        this.brand = brand;
    }

    int param1;          // Определяем переменные класса
    String param2;
    boolean param3;
    String param4;

    {
        System.out.println("Initializer");  // Создаем блок инициализации, который будет вызываться при создании объекта
        param1 = 100;
        param2 = "...";
        param3 = true;
        param4 = "====";
    }
         // Определяем конструкторы класса
         // Конструктор без параметров
    public Product(){           
        this("Продукт");
    }
          // Конструктор с одним параметром (наименование продукта)
    public Product(String name){
        this(name, 1);
    }
    public Product(String name, double price){
        this("Noname", name, price);
    }

    public Product(String brand, String name, double price){     // Конструктор с тремя параметрами (производитель, наименование продукта и цена)
        System.out.println("Constructor");
        if (brand.length() < 3)
            this.brand = "Noname";
        else
            this.brand = brand;

        if (name.length() < 3)
            this.name = "Товар";
        else
            this.name = name;

        if (price <= 0)
            throw new RuntimeException("Некорректная сумма товара.");
        this.price = price;
    }


    /**
     * Получить информацию по продукту
     * @return Информация по продукту
     */
    public String displayInfo(){
        return String.format("%s - %s - %f", brand, name, price);
    }


}