package cl.uchile.dcc.scrabble.gui.Scrabble_types.typeFactories;

import cl.uchile.dcc.scrabble.gui.Scrabble_types.Booleans;
import cl.uchile.dcc.scrabble.gui.Scrabble_types.integers;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class booleansFactoryTest {

    @Test
    void createBooleans() {

        Map<Boolean, Booleans> map1 = booleansFactory.getbFactory().get_map();

        map1.clear();

        assert map1.size() == 0;

        Booleans T = booleansFactory.createBooleans(true);

        assert map1.size() == 1;

        Booleans T2 = booleansFactory.createBooleans(true);

        assert map1.size() == 1;

        booleansFactory.createBooleans(false);

        assert map1.size() == 2;

        assertEquals(T, T2);

        assertEquals(T.hashCode(), T2.hashCode());


    }
}