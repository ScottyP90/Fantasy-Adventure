package Adventures;

import Dungon.Treasure;

import java.util.ArrayList;

public abstract class Adventurers {

    private String name;
    private String title;
    private String race;
    private int vitality;
    private int strength;
    private int magic;
    private int defence;
    private ArrayList<Treasure> loot;

    public Adventurers(String name, String title, String race, int vitality, int strength, int magic, int defence) {
        this.name = name;
        this.title = title;
        this.race = race;
        this.vitality = vitality;
        this.strength = strength;
        this.magic = magic;
        this.defence = defence;
        this.loot = new ArrayList<Treasure>();
    }

    public String getName() {
        return name;
    }

    public String getTitle() {
        return title;
    }

    public String getRace() {
        return race;
    }

    public int getVitality() {
        return vitality;
    }

    public int getStrength() {
        return strength;
    }

    public int getMagic() {
        return magic;
    }

    public int getDefence() {
        return defence;
    }

    public int countLoot() {
        return loot.size();
    }

    public void addLoot(Treasure treasure) {
        this.loot.add(treasure);
    }

    public String fullTitle() {
        return this.name + " " + this.title;
    }
}
