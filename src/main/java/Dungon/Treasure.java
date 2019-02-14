package Dungon;

public class Treasure {

    private String Type;
    private int value;
    private int quantity;

    public Treasure(String type, int value, int quantity) {
        Type = type;
        this.value = value;
        this.quantity = quantity;
    }

    public String getType() {
        return Type;
    }

    public int getValue() {
        return value;
    }

    public int getQuantity() {
        return quantity;
    }
}
