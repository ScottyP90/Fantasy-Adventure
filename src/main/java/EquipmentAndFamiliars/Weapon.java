package EquipmentAndFamiliars;

public class Weapon {

    private String weaponName;
    private String weaponType;
    private int attackValue;
    private int defenceValue;

    public Weapon(String weaponName, String weaponType, int attackValue, int defenceValue) {
        this.weaponName = weaponName;
        this.weaponType = weaponType;
        this.attackValue = attackValue;
        this.defenceValue = defenceValue;
    }

    public String getWeaponName() {
        return weaponName;
    }

    public String getWeaponType() {
        return weaponType;
    }

    public int getAttackValue() {
        return attackValue;
    }

    public int getDefenceValue() {
        return defenceValue;
    }

}
