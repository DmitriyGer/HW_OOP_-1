public class Chokolate extends Product {
    
    private double weight;

    private double calories;


    public double getWeight() {
        return weight;
    }

    public void setWeight(double weught) {
        this.weight = weught;
    }

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }


    public Chokolate(String brand, String name, double price, double weight, double calories){
        super(brand, name, price);
        this.weight = weight;
        this.calories = calories;
    }

    @Override
    public String displayInfo() {
        return String.format("Шоколад\n\t [Производитель: %s\n\t Наименование: name %s\n\t Стоимость: %.2f\n\t Вес: %s\n\t Калории: %s]", 
            brand, name, price, weight, calories);
    }


}
