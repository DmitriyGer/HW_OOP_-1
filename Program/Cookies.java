public class Cookies extends Product {
    
    private double quantity;

    private double weight;

    private double calories;


    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public double getWeught() {
        return weight;
    }

    public void setWeught(double weught) {
        this.weight = weught;
    }

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }


    public Cookies(String brand, String name, double price, double weight, double quantity, double calories){
        super(brand, name, price);
        this.weight = weight;
        this.quantity = quantity;
        this.calories = calories;
    }

    @Override
    public String displayInfo() {
        return String.format("Печенье\n\t [Производитель: %s\n\t Наименование: name %s\n\t Стоимость: %.2f\n\t Количество в упаковке: %s\n\t Вес: %s\n\t Калории: %s]", 
        brand, name, price, quantity, weight, calories);
    }


}
