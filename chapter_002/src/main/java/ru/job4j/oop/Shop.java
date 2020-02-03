package ru.job4j.oop;

public class Shop {
    public Product[] delete(Product[] products, int index) {
        products[index] = null;
        for (int i = index; i < products.length - 1; i++) {
                products[i] = products[i + 1];
                products[i + 1] = null;
        }
        return products;
    }

    public static void main(String[] args) {
        Shop shop = new Shop();
        Product[] products = new Product[5];
        products[0] = new Product("Milk", 10);
        products[1] = new Product("Bread", 4);
        products[2] = new Product("Egg", 19);
        products[3] = new Product("Fish", 3);
        products[4] = new Product("Meat", 4);

        System.out.println("После удаления Milk\n");

        shop.delete(products, 0);
        for (int i = 0; i < products.length; i++) {
            Product product = products[i];
            if (products[i] != null) {
                System.out.println(product.getName() + ": " + product.getQuantity());
            } else {
                System.out.println("null");
            }
        }
    }
}


