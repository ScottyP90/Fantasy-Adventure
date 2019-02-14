package EquipmentAndFamiliars;

public class Item {

    private String itemName;
    private String itemType;
    private int healingValue;
    private int damageValue;

    public Item(String itemName, String itemType, int healingValue, int damageValue) {
        this.itemName = itemName;
        this.itemType = itemType;
        this.healingValue = healingValue;
        this.damageValue = damageValue;
    }

    public String getItemName() {
        return itemName;
    }

    public String getItemType() {
        return itemType;
    }

    public int getHealingValue() {
        return healingValue;
    }

    public int getDamageValue() {
        return damageValue;
    }
}
