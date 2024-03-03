import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {

        // Product product1 = new Product("Brand #1", "Name #1", 200);
        // System.out.println(product1.displayInfo());

        // product1.setPrice(-1400);
        // product1.setName("~");
        // System.out.println(product1.displayInfo());

        // product1.brand = "Brand #1";
        // product1.name = "Name #1";
        // product1.price = 200;

        // Product product2 = new Product();

        BottleOfWater bottleOfWater1 = new BottleOfWater("Вода", "Бутылка №1", 210, 0.5);
        // System.out.println(bottleOfWater1.displayInfo());

        Product bottleOfWater2 = new BottleOfWater("Вода", "Бутылка №2", 210, 0.5);
        // System.out.println(bottleOfWater2.displayInfo());

        BottleOfMilk bottleOfMilk1 = new BottleOfMilk("Молоко", "Бутыка №1", 310, 0.5, 10);
        // System.out.println(bottleOfMilk1.displayInfo());

        Product bottleOfMilk2 = new BottleOfMilk("Молоко", "Бутыка №2", 310, 0.5, 10);
        // System.out.println(bottleOfMilk2.displayInfo());


        ArrayList<Product> list = new ArrayList<>();
        list.add(bottleOfMilk1);
        list.add(bottleOfWater1);
        list.add(bottleOfMilk2);
        list.add(bottleOfWater2);
        list.add(new BottleOfMilk("Молоко", "Бутылка №3", 310, 0.33, 10));
        list.add(new Chokolate("Шоколад", "Упаковка №1", 400, 100, 544));
        list.add(new Chokolate("Шоколад", "Упаковка №2", 450, 120, 750));
        list.add(new Cookies("Печенье", "Упаковка №1", 350, 150, 6, 400));
        list.add(new Cookies("Печенье", "Упаковка №2", 375, 250, 9, 600));


        VendingMachine vendingMachine = new VendingMachine(list);

        BottleOfWater bottleOfWaterRes = vendingMachine.getBottleOfWater("Бутылка №1", 0.5);
        if (bottleOfWaterRes != null) {
            System.out.println("Вы купили: ");
            System.out.println(bottleOfWaterRes.displayInfo());
        } else {
            System.out.println("Такого товара нет в автомате.");
        }

        Cookies cookies = vendingMachine.getCookies("Упаковка №2", 600);
        if (cookies != null) {
            System.out.println("Вы купили: ");
            System.out.println(cookies.displayInfo());
        } else {
            System.out.println("Такого товара нет в автомате.");
        }

        Chokolate chokolate = vendingMachine.getChokolate("Упаковка №1", 100);
        if (chokolate != null) {
            System.out.println("Вы купили: ");
            System.out.println(chokolate.displayInfo());
        } else {
            System.out.println("Такого товара нет в автомате.");
        }

    }

}
