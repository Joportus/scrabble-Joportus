package cl.uchile.dcc.scrabble.gui.Scrabble_types.typeFactories;

import cl.uchile.dcc.scrabble.gui.Scrabble_types.floats;
import cl.uchile.dcc.scrabble.gui.Scrabble_types.integers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Map;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class floatsFactoryTest {
    private Random rng;
    private int seed;

    @BeforeEach
    void setUp(){
        seed = new Random().nextInt();
        rng = new Random(seed);

    }
    @Test
    void createFloats() {
        int i1 = rng.nextInt();
        int i2 = rng.nextInt();
        int i3 = rng.nextInt();
        int i4 = rng.nextInt();
        double d1 = new Random().nextDouble();
        double r1 = i1 * d1;
        double d2 = new Random().nextDouble();
        double r2 = i2 * d2;
        double d3 = new Random().nextDouble();
        double r3 = i3 * d3;
        double d4 = new Random().nextDouble();
        double r4 = i4 * d4;

        Map<Double , floats> map1 = floatsFactory.getfFactory().get_map();

        assert map1.size() == 0;

        floats F = floatsFactory.createFloats(r1);

        assert map1.size() == 1;

        floats F2 = floatsFactory.createFloats(r1);

        assert map1.size() == 1;

        floatsFactory.createFloats(r2);

        assert map1.size() == 2;

        floatsFactory.createFloats(r2);

        assert map1.size() == 2;

        floatsFactory.createFloats(r3);

        assert map1.size() == 3;

        floatsFactory.createFloats(r3);

        assert map1.size() == 3;

        floatsFactory.createFloats(r4);

        assert map1.size() == 4;

        floatsFactory.createFloats(r2);

        assert map1.size() == 4;


        assertEquals(F, F2);

        assertEquals(F.hashCode(), F2.hashCode());

    }
}