package Model;

public class Item {

    private final int itemId;
    private final String name;
    private final double price;
    
 private final int item=2;

    public Item(int itemId, String name, double price) {
        this.itemId = itemId;
        this.name = name;
        this.price = price;
    }

    public int getItemId() {
        return itemId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}