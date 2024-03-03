/**
 * Продукт
 */
public class Product {
    
    protected String name;

    
    protected String brand;


    protected double price;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        processName(name);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        processBrand(brand);
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        processPrice(price);

    }

    /*
     * метод для проверки стоимости товара
     */
    private void processPrice(double price){
        if (price < 100){
            this.price = 250;
        }
        else {
            this.price = price;
        }
    }

    /*
     * метод для проверки названия бренда
     */
    private void processBrand(String brand){
        if (brand == null || brand.length() < 3){
            this.brand = "<BRAND>";
        }
        else {
            this.brand = brand;
        }
    }

    /*
     * метод для проверки названия товара
     */
    private void processName(String name){
        if (name == null || name.length() < 3){
            name = "<NameD>";
        }
        else {
            this.name = name;
        }
    }


    public Product(String brand, String name, double price){
        
        processBrand(brand); // создали отдельный метод, чтобы каждый раз не дублировать код для проверки бренда
        processName(name); // создали отдельный метод, чтобы каждый раз не дублировать код для названия товара
        processPrice(price); // создали отдельный метод, чтобы каждый раз не дублировать код для проверки стоимости
        
        /*if (brand == null || brand.length() < 3){
            this.brand = "<BRAND>";
        }
        else {
            this.brand = brand;
        }

        if (name == null || name.length() < 3){
            name = "<NameD>";
        }
        else {
            this.name = name;
        }

        if (price < 100){
            price = 250;
        }
        else {
            this.price = price;
        }*/

    }

    public Product(String name, double price){
        this("<BRAND>", name, price);
        
        /*this.brand = "<BRAND>";
        if (name == null || name.length() < 3){
            name = "<NameD>";
        }
        else {
            this.name = name;
        }

        if (price < 100){
            this.price = 250;
        }
        else {
            this.price = price;
        }*/
    }

    public Product(String name){
        this(name, 250);
        
        /*this.brand = "<BRAND>";
        this.price = 250;
        if (name == null || name.length() < 3){
            name = "<NameD>";
        }
        else {
            this. name = name;
        }*/
    }

    public Product(){
        this("<NAME>");
        
        /*this.brand = "<BRAND>";
        this.name = "<NAME>";
        this.price = 250;*/
    }


    public String displayInfo(){
        return String.format("%s - %s - %.2f", brand, name, price);
    }

}
