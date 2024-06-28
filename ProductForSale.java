import java.util.Random;

public abstract class ProductForSale {
    private final String type;
    private final double price;
    private final String description;

    public ProductForSale(String type, double price,String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }



    public double price(int quantity){
        return quantity*getPrice();
    }
    public void getPricedLane(int quantity){
        double price = quantity * getPrice();
        System.out.println("item " + getType() + " costs :" + price + "\ndescribtion: " + getDescription());
    }
    public abstract void showDetails();

    @Override
    public String toString() {
        return "ProductForSale{" +
                "type='" + type + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }
}