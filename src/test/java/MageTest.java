import Adventures.Mage;
import EquipmentAndFamiliars.Familiar;
import EquipmentAndFamiliars.Spell;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class MageTest {

    Mage mage;
    Spell spell1;
    Spell spell2;
    Familiar familiar1;
    Familiar familiar2;

    @Before
    public void setUp() {
        spell1 = new Spell("Firebolt", 20);
        spell2 = new Spell("Arc Lightning", 75);
        familiar1 = new Familiar("Sliver Fang", "Wyvern", 75, 15);
        familiar2 = new Familiar("Rock Biter", "Golem", 15, 55);
        mage = new Mage("Merlin", "The Wise", "Demon", 100, 5, 70, 10, familiar1, 4);
    }

    @Test
    public void canGetSpellCap() {
        assertEquals(4, mage.getSpellCap());
    }

    @Test
    public void canLearNewSpell() {
        mage.learnNewSpell(spell1);
        assertEquals(1, mage.countSpells());
    }

    @Test
    public void canAttack() {
        mage.learnNewSpell(spell1);
        assertEquals(165, mage.attack());
    }

    @Test
    public void canSwapSpells() {
        mage.learnNewSpell(spell1);
        mage.learnNewSpell(spell2);
        mage.swapSpells(spell2);
        assertEquals(spell2, mage.checkMainSpell());
    }

    @Test
    public void canSummonNewFamiliars() {
        mage.summonNewFamilar(familiar2);
        assertEquals(familiar2, mage.getFamiliar());
    }
}
