public class Item1 extends ProductForSale{

    public Item1(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.println("the type of the item is: " + getType());
        System.out.println("the price of the item is: " + getPrice());
        System.out.println(getDescription());
    }


}
