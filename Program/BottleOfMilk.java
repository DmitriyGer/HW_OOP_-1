public class BottleOfMilk extends Product {
    
    private double volume; // объем

    private double fat; // содержание жирности

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getFat() {
        return fat;
    }

    public void setFat(double fat) {
        this.fat = fat;
    }

    public BottleOfMilk(String brand, String name, double price, double volume, double fat){
        super(brand, name, price);
        this.volume = volume;
        this.fat = fat;
    }

    @Override
    public String displayInfo() {
        return String.format("Бутылка с молоком\n\t [Производитель: %s\n\t Наименование: name %s\n\t Стоимость: %.2f\n\t Объем: %.2f\n\t Жирновть: %.2f]", 
                brand, name, price, volume, fat);
    }

}
