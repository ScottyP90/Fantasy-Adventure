import Adventures.Warrior;
import EquipmentAndFamiliars.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class WarriorTest {

    Warrior warrior;
    Weapon weapon1;
    Weapon weapon2;

    @Before
    public void setUp() {
        weapon1 = new Weapon("Iron Sword", "Sword", 10, 5);
        weapon2 = new Weapon("Skull Smasher", "Hammer", 25, 0);
        warrior = new Warrior("Arnack","The Daft", "Human", 100, 50, 5, 45,3);
    }

    @Test
    public void canGetName() {
        assertEquals("Arnack", warrior.getName());
    }

    @Test
    public void canGetTitle() {
        assertNotNull("The Daft", warrior.getTitle());
    }

    @Test
    public void canGetFullTitle() {
        assertEquals("Arnack The Daft", warrior.fullTitle());
    }

    @Test
    public void canGetStats() {
        assertEquals(100, warrior.getVitality());
        assertEquals(50, warrior.getStrength());
        assertEquals(5, warrior.getMagic());
        assertEquals(45, warrior.getDefence());
    }

    @Test
    public void canCountWeapons() {
        assertEquals(0, warrior.countWeapons());
    }

    @Test
    public void canGetWeaponCap() {
        assertEquals(3, warrior.getWeaponsCap());
    }

    @Test
    public void canAddWeaponToWarrior() {
        warrior.addWeapon(weapon1);
        assertEquals(1, warrior.countWeapons());
    }

    @Test
    public void canSwapWeapon() {
        warrior.addWeapon(weapon1);
        warrior.addWeapon(weapon2);
        warrior.swapWeapon(weapon2);
        assertEquals(weapon2, warrior.checkMainWeapon());
    }

    @Test
    public void canWeaponNotSwap() {
        warrior.addWeapon(weapon1);
        warrior.addWeapon(weapon1);
        warrior.swapWeapon(weapon2);
        assertEquals(weapon1, warrior.checkMainWeapon());
    }

    @Test
    public void attack() {
        warrior.addWeapon(weapon1);
        assertEquals(60, warrior.attack());
    }
}
