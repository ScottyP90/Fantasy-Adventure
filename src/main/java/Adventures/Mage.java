package Adventures;

import EquipmentAndFamiliars.Familiar;
import EquipmentAndFamiliars.Spell;
import Interface.Iplayer;

import java.util.ArrayList;
import java.util.Collections;

public class Mage extends Adventurers implements Iplayer {

    private ArrayList<Spell> spells;
    private Familiar familiar;
    private int spellCap;

    public Mage(String name, String title, String race, int vitality, int strength, int magic, int defence, Familiar familiar, int spellCap) {
        super(name, title, race, vitality, strength, magic, defence);
        this.spells = new ArrayList<Spell>();
        this.familiar = familiar;
        this.spellCap = spellCap;
    }

    public int countSpells(){
        return this.spells.size();
    }

    public Familiar getFamiliar() {
        return familiar;
    }

    public int getSpellCap() {
        return spellCap;
    }

    public void learnNewSpell(Spell spell){
        if (this.spells.size() < this.spellCap){
            this.spells.add(spell);
        }
    }

    public int attack() {
        int totalAttack = this.getMagic() + this.spells.get(0).getMagicDamage() + this.familiar.getAttack();
        return totalAttack;
    }

    public void swapSpells(Spell spell){
        if(this.spells.contains(spell)){
            int selectedSpell = this.spells.indexOf(spell);
            Collections.swap(this.spells,0, selectedSpell);
        }
    }

    public Spell checkMainSpell(){
        return this.spells.get(0);
    }

    public void summonNewFamilar(Familiar newFamiliar){
        this.familiar = newFamiliar;
    }
}
