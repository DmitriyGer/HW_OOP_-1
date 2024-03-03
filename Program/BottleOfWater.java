public class BottleOfWater extends Product {
    
    private double volume;

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }


    public BottleOfWater(String brand, String name, double price, double volume){
        super(brand, name, price);
        this.volume = volume;
    }

    @Override
    public String displayInfo() {
        return String.format("Бутылка с водой\n\t [Производитель: %s\n\t Наименование: name %s\n\t Стоимость: %.2f\n\t Объем: %.2f]", 
            brand, name, price, volume);
    }

}
