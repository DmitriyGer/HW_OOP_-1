import java.util.List;

public class VendingMachine {

    private List<Product> products;

    public VendingMachine(List<Product> products) {
        this.products = products;
    }

    public BottleOfWater getBottleOfWater(String name, double volume) {
        for (Product product : products) {
            if (product instanceof BottleOfWater) {
                BottleOfWater bottleOfWater = (BottleOfWater) product;
                if (bottleOfWater.getName().equals(name) && bottleOfWater.getVolume() == volume) {
                    return bottleOfWater;
                }
            }
            
        }
        return null;
    }

    public Cookies getCookies(String name, double calories) {
        for (Product product : products) {
            if (product instanceof Cookies) {
                Cookies cookies = (Cookies) product;
                if (cookies.getName().equals(name) && cookies.getCalories() == calories) {
                    return cookies;
                }
            }
            
        }
        return null;
    }

    public Chokolate getChokolate(String name, double weight) {
        for (Product product : products) {
            if (product instanceof Chokolate) {
                Chokolate chokolate = (Chokolate) product;
                if (chokolate.getName().equals(name) && chokolate.getWeight() == weight) {
                    return chokolate;
                }
            }
            
        }
        return null;
    }

}
