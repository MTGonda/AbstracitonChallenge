import java.util.*;


public class Main {


    public static void main(String[] args) {

        ProductForSale eclipse = new Item1("Eclipse", 3000.0, "Hitting an enemy with " +
                "2 abilities within 2 " +
                "seconds damages them for 6% max health dmg and gives " +
                "u a shield amount equal to 40% of your ad");
        ProductForSale voltaicCyclesword = new Item2("Voltaic Cyclesword" ,2900,"While charged, " +
                "basic attack slows for 99% and deals 150 additional magic damage");
        ProductForSale axiomArc = new Item3("Axiom Arc",3100,"Takedowns shortens the cooldown " +
                "of the ultimate ability for 20% of your lethality");
        List<OrderItem> list = new ArrayList<>();

        addItem(list, 2, eclipse);
        addItem(list,1,voltaicCyclesword);
        addItem(list,4,axiomArc);

        ListTheOrder(list);
        getOverallPrice(list);


    }

    public static void ListTheOrder(List<OrderItem> orderItemList) {
        for (var item : orderItemList) {
            System.out.println("-".repeat(30));
            System.out.println(item.product.type);
            System.out.println(item.product.price);
            System.out.println(item.product.description);
            System.out.println("-".repeat(30));

        }
    }


    public static void addItem(List<OrderItem> orderItemList, int quantity, ProductForSale productForSale) {
        orderItemList.add(new OrderItem(quantity, productForSale));
    }

    public static void getOverallPrice(List<OrderItem> orderItemList) {
        double salesSum = 0;
        for (var item : orderItemList) {
            item.product.price(item.quantity);
            salesSum += item.product.price(item.quantity);
        }
        System.out.println("Total price: " + salesSum);
    }
}