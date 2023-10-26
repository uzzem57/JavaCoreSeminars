package Seminar4.task2;

public class Order {
Buyer buyer;
Product product;
int amount;

    public Order(Buyer buyer, Product product, int amount) {
        this.buyer = buyer;
        this.product = product;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Order{" +
                "buyer=" + buyer +
                ", product=" + product +
                ", amount=" + amount +
                '}';
    }
}
