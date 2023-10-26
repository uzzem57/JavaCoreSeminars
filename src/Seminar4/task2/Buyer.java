package Seminar4.task2;

public class Buyer  {
    String name;
    int age;
    int numberCart;

    public Buyer(String name, int age, int numberCart) {
        this.name = name;
        this.age = age;
        this.numberCart = numberCart;
    }

    @Override
    public String toString() {
        return "buyer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", numberCart=" + numberCart +
                '}';
    }
}
