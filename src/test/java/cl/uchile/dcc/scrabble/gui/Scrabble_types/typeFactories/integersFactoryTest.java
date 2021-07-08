package cl.uchile.dcc.scrabble.gui.Scrabble_types.typeFactories;

import cl.uchile.dcc.scrabble.gui.Scrabble_types.integers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Map;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class integersFactoryTest {



    @Test
    void createIntegers() {
        int r1 = 2723233;
        int r2 = 13232;
        int r3 = -123423;
        int r4 = 0;



        Map<Integer, integers> map1 = integersFactory.getiFactory().get_map();

        map1.clear();

        assert map1.size() == 0;

        integers I = integersFactory.createIntegers(r1);

        assert map1.size() == 1;

        integers I2 = integersFactory.createIntegers(r1);

        assert map1.size() == 1;

        integersFactory.createIntegers(r2);

        assert map1.size() == 2;

        integersFactory.createIntegers(r2);

        assert map1.size() == 2;

        integersFactory.createIntegers(r3);

        assert map1.size() == 3;

        integersFactory.createIntegers(r3);

        assert map1.size() == 3;

        integersFactory.createIntegers(r4);

        assert map1.size() == 4;

        integersFactory.createIntegers(r2);

        assert map1.size() == 4;

        assertEquals(I, I2);

        assertEquals(I.hashCode(), I2.hashCode());



    }
}