package Adventures;

import Dungon.Monster;
import EquipmentAndFamiliars.Weapon;
import Interface.Iplayer;

import java.util.ArrayList;
import java.util.Collections;

public class Warrior extends Adventurers {

    private ArrayList<Weapon> weapons;
    private int weaponsCap;

    public Warrior(String name, String title, String race, int vitality, int strength, int magic, int defence, int weaponsCap) {
        super(name, title, race, vitality, strength, magic, defence);
        this.weapons = new ArrayList<Weapon>();
        this.weaponsCap = weaponsCap;
    }

    public int countWeapons() {
        return this.weapons.size();
    }

    public int getWeaponsCap() {
        return weaponsCap;
    }

    public void addWeapon(Weapon weapon){
        if(this.weapons.size() < this.weaponsCap){
            this.weapons.add(weapon);
        }
    }

    @Override
    public int attack(){
        return this.getStrength() + this.weapons.get(0).getAttackValue();
    }

    public void swapWeapon(Weapon weapon) {
        if(this.weapons.contains(weapon)){
            int selectedWeapon = this.weapons.indexOf(weapon);
            Collections.swap(this.weapons,0, selectedWeapon);
        }
    }

    public Weapon checkMainWeapon(){
        return this.weapons.get(0);
    }

    public void defend(Monster monster) {
        int totalDamage = monster.getAttack() - (this.getDefence() + this.weapons.get(0).getDefenceValue());
        this.takeDamage(totalDamage);
    }
}
