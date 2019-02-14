package EquipmentAndFamiliars;

public class Familiar {

    private String familiarName;
    private String monsterType;
    private int attack;
    private int defence;

    public Familiar(String familiarName, String monsterType, int attack, int defence) {
        this.familiarName = familiarName;
        this.monsterType = monsterType;
        this.attack = attack;
        this.defence = defence;
    }

    public String getFamiliarName() {
        return familiarName;
    }

    public String getMonsterType() {
        return monsterType;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefence() {
        return defence;
    }
}
