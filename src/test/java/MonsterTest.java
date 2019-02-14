import Dungon.Monster;
import Dungon.Treasure;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MonsterTest {

    Monster monster;
    Treasure treasure;

    @Before
    public void setUp() {
        treasure = new Treasure("Ruby", 100, 2);
        monster = new Monster("Cave Troll", 100, 95, 25, treasure);
    }

    @Test
    public void canGetType() {
        assertEquals("Cave Troll", monster.getType());
    }

    @Test
    public void canGetVitality() {
        assertEquals(100, monster.getVitality());
    }

    @Test
    public void canGetAttack() {
        assertEquals(95, monster.getAttack());
    }

    @Test
    public void canGetDefence() {
        assertEquals(25, monster.getDefence());
    }

    @Test
    public void canDropLoot() {
        assertEquals(treasure, monster.dropTreasure());
    }

    @Test
    public void canAttack() {
        assertEquals(95, monster.attack());
    }
}
