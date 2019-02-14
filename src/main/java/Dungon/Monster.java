package Dungon;

public class Monster {

    private String type;
    private int vitality;
    private int attack;
    private int defence;
    private Treasure treasure;

    public Monster(String type, int vitality, int attack, int defence, Treasure treasure) {
        this.type = type;
        this.vitality = vitality;
        this.attack = attack;
        this.defence = defence;
        this.treasure = treasure;
    }

    public String getType() {
        return type;
    }

    public int getVitality() {
        return vitality;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefence() {
        return defence;
    }

    public Treasure dropTreasure() {
        return treasure;
    }

    public int attack(){
        return this.attack;
    }


}
