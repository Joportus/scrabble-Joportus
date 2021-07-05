package cl.uchile.dcc.scrabble.gui.Scrabble_types.typeFactories;

import cl.uchile.dcc.scrabble.gui.Scrabble_types.integers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Map;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class integersFactoryTest {
    private Random rng;
    private int seed;

    @BeforeEach
    void setUp(){
        seed = new Random().nextInt();
        rng = new Random(seed);
    }

    @Test
    void createIntegers() {
        int r1 = rng.nextInt();
        int r2 = rng.nextInt();
        int r3 = rng.nextInt();
        int r4 = rng.nextInt();



        Map<Integer, integers> map1 = integersFactory.getiFactory().get_map();

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