package Seminar4.task2;

public class Product {
    String name;
    int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
