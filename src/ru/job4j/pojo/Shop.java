package ru.job4j.pojo;

public class Shop {

    public Product[] delete(Product[] products, int index) {
        for (int i = 0; i < products.length - 1; i++) {
            products[i] = products[i + index];
        }
        products[products.length - index] = null;
        return products;
    }

    public static void main(String[] args) {
       /* Product[] products = new Product[5];
        products[0] = new Product("Milk", 10);
        products[1] = new Product("Bread", 4);
        products[2] = new Product("Egg", 19);
        for (int index = 0; index < products.length; index++) {
            Product product = products[index];
            if (product != null) {
                System.out.println(product.getName());
            }
        }
        System.out.println();
        System.out.println("Удаляем значение из ячейки с индексом 1");
        products[1] = null;
        for (Product product : products) {
            if (product != null) {
                System.out.println(product.getName());
            } else {
                System.out.println("null");
            }
        }
        System.out.println();
        System.out.println("Записываем в ячейку с индексом 1 ячейку с индексом 2"
                + " и удаляем значение из ячейки с индексом 2"
        );
        products[1] = products[2];
        products[2] = null;
        for (Product product : products) {
            System.out.println(product != null ? product.getName() : "null");
        }*/
        System.out.println();
        System.out.println("Реализация метода delete.");
        Product[] food = new Product[4];
        food[0] = new Product("Butter", 5);
        food[1] = new Product("Cheese", 8);
        food[2] = new Product("Oil", 2);
        food[3] = new Product("Onion", 20);
        System.out.println("Просмотр содержимого массива");
        for (Product product : food) {
            System.out.println(product.getName());
        }
        System.out.println("После применения метода delete");
        Shop foodShop = new Shop();
        foodShop.delete(food, 1);
        for (Product product : food) {
            System.out.println(product != null ? product.getName() : "null");
        }
    }
}
