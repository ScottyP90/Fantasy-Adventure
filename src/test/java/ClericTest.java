import Adventures.Cleric;
import EquipmentAndFamiliars.Item;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ClericTest {

    Cleric cleric;
    Item item1;
    Item item2;

    @Before
    public void setUp() {
        cleric = new Cleric("Dale","The Old Priest","Elf",100,15,15,60,10);
        item1 = new Item("Bear Trap", "Attack",0, 75);
        item2 = new Item("Mega Potion","Healing",80,0);
    }

    @Test
    public void canGetItemcap() {
        assertEquals(10, cleric.getItemsCap());
    }

    @Test
    public void canAddItem() {
        cleric.addNewItem(item1);
        assertEquals(1, cleric.countItems());
    }

    @Test
    public void canAttackWithItem() {
        cleric.addNewItem(item1);
        assertEquals(90, cleric.attack());
    }

    @Test
    public void canSwapItems() {
        cleric.addNewItem(item1);
        cleric.addNewItem(item2);
        cleric.swapItems(item2);
        assertEquals(item2, cleric.checkMainItem());
    }

    @Test
    public void canHealWithItems() {
        cleric.addNewItem(item2);
        assertEquals(95, cleric.heal());
    }
}
