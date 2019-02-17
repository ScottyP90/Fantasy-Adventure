import Adventures.Cleric;
import Adventures.Mage;
import Adventures.Warrior;
import Dungon.Monster;
import Dungon.Room;
import Dungon.Treasure;
import EquipmentAndFamiliars.Familiar;
import EquipmentAndFamiliars.Item;
import EquipmentAndFamiliars.Spell;
import EquipmentAndFamiliars.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoomTest {

    Room room;
    Monster monster1;
    Monster monster2;
    Treasure treasure1;
    Treasure treasure2;
    Warrior warrior;
    Mage mage;
    Cleric cleric;
    Weapon weapon;
    Familiar familiar1;
    Spell spell;
    Item item1;
    Item item2;

    @Before
    public void setUp() {
        treasure1 = new Treasure("Blue Slime Earring",15,1);
        monster1 = new Monster("Slime",50,10,30,treasure1);
        treasure2 = new Treasure("Bronze Coin",1,100);
        monster2 = new Monster("Scrap Iron Hedgehog", 200, 45, 50, treasure2);
        room = new Room("The Pit",3,3);
        weapon = new Weapon("Iron Sword","Long Sword", 20, 5);
        item1 = new Item("Mega Potion", "Healing", 50, 0);
        item2 = new Item("Fire Bomb", "Attack", 0, 50);
        warrior = new Warrior("Arnack","The Daft", "Human", 100, 50, 5, 35,3);
        familiar1 = new Familiar("Sliver Fang", "Wyvern", 75, 15);
        mage = new Mage("Merlin", "The Wise", "Demon", 100, 5, 70, 10, familiar1, 4);
        cleric = new Cleric("Dale","The Old Priest","Elf",100,15,15,40,10);
        spell = new Spell("Firebolt", 15);
        warrior.addWeapon(weapon);
        cleric.addNewItem(item1);
        cleric.addNewItem(item2);
        mage.learnNewSpell(spell);
        room.addAdventurers(warrior);
        room.addAdventurers(mage);
        room.addAdventurers(cleric);
        room.addMonster(monster1);
        room.addMonster(monster2);
        room.addTresure(treasure1);
        room.addTresure(treasure2);
    }

    @Test
    public void canMonstersAndWarriorDoBattle() {
        room.battle(warrior,monster2);
        assertEquals(95, warrior.getVitality());
        assertEquals(180, monster2.getVitality());
    }

    @Test
    public void canMonstersAndMageDoBattle() {
        room.battle(mage,monster2);
        assertEquals(80, mage.getVitality());
        assertEquals(90, monster2.getVitality());
    }

    @Test
    public void canMonsterAndClericDoBattle() {
        cleric.swapItems(item2);
        room.battle(cleric,monster2);
        assertEquals(95, cleric.getVitality());
        assertEquals(185, monster2.getVitality());
    }

    @Test
    public void canClericHealOtherPlayersAfterBattle() {
        room.battle(mage,monster2);
        cleric.heal(mage);
        assertEquals(145, mage.getVitality());
    }

    @Test
    public void canMonsterBeRemovedFromRoom() {
        room.battle(mage,monster1);
        assertEquals(1, room.getMonsters());
    }
}
