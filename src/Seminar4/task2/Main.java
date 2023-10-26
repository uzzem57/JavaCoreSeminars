package Seminar4.task2;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {
       Object [][] check = {
               {buyers[0], products[0],20},
               {buyers[0], products[0],-40},
               {buyers[0], products[0],180},
               {buyers[1],new Product("Fish",47),4},
               {new Buyer("Vasya", 41, 8899), products[2],55}
       };

       int tmp = 0;
       int i =0;

       while(tmp != orders.length -1 || i != check.length){
           try {
                orders[tmp] = buy((Buyer) check[i][0],(Product) check[i][1],(int) check[i][2]);
                tmp++;
           }
           catch (ProductException e){
               e.printStackTrace();
           }
           catch (OrderException e){
               orders[tmp++] = buy((Buyer) check[i][0],(Product) check[i][1],1);
           }

           catch (BuyerException e){
               throw  new BuyerException("Такого покупателя нет в базе");
           }
           finally {
               System.out.println("Количество покупок " + tmp);
           }
           i++;

       }
    }

    private final static Buyer[] buyers = {
            new Buyer("Petr", 25, 4477),
            new Buyer("Tom", 30, 5555)
    };
    private final static Product[] products = {
            new Product("Bread", 15),
            new Product("Milk", 10),
            new Product("Beer", 50),
            new Product("Apple", 40),
            new Product("Water", 55)
    };
    private final static Order[] orders = new Order[5];

    private static boolean isInArrayBuyer(Buyer[] array, Buyer o) {
        for (int i = 0; i < array.length; i++)
            if (array[i].equals(o)) return true;
        return false;
   }
    private static boolean isInArrayProduct(Product[] array, Product o) {
        for (int i = 0; i < array.length; i++)
            if (array[i].equals(o)) return true;
        return false;
    }
   public static Order buy (Buyer buyer, Product product,int count){
        if(!isInArrayBuyer(buyers, buyer)){
            throw new BuyerException("Неизвестный покупатель, точно вор!");
        }
        if(!isInArrayProduct(products, product)){
            throw new ProductException("Продукта нет в наличии");
        }
        if(count < 0 || count > 100){
            throw new OrderException("Не адекватное количество");
        }
        else
            return new Order(buyer,product,count);

   }
}
