package Adventures;

import Dungon.Monster;
import EquipmentAndFamiliars.Item;
import Interface.Iplayer;

import java.util.ArrayList;
import java.util.Collections;

public class Cleric extends Adventurers {

    private ArrayList<Item> items;
    private int itemsCap;

    public Cleric(String name, String title, String race, int vitality, int strength, int magic, int defence, int itemsCap) {
        super(name, title, race, vitality, strength, magic, defence);
        this.items = new ArrayList<Item>();
        this.itemsCap = itemsCap;
    }

    public int countItems() {
        return items.size();
    }

    public int getItemsCap() {
        return itemsCap;
    }

    public void addNewItem(Item item){
        if(this.items.size() < this.itemsCap){
            this.items.add(item);
        }
    }

    public int attack() {
        return this.getStrength() + this.items.get(0).getDamageValue();
    }

    public void heal(Adventurers adventurer){
        int totalHeal = this.getMagic() + this.items.get(0).getHealingValue();
        adventurer.recoverVitality(totalHeal);
    }

    public void swapItems(Item item){
        if(this.items.contains(item)){
            int selectedItem = this.items.indexOf(item);
            Collections.swap(this.items,0, selectedItem);
        }
    }

    public Item checkMainItem(){
        return this.items.get(0);
    }

    public void defend(Monster monster){
        int totalDamage = monster.attack() - this.getDefence();
        this.takeDamage(totalDamage);
    }
}
