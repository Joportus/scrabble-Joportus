package cl.uchile.dcc.scrabble.gui.Scrabble_types.typeFactories;

import cl.uchile.dcc.scrabble.gui.Scrabble_types.Booleans;
import cl.uchile.dcc.scrabble.gui.Scrabble_types.Strings;
import cl.uchile.dcc.scrabble.gui.Scrabble_types.integers;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Map;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class stringsFactoryTest {


    private Random rng;
    private int seed;


    @Test
    void createStrings() {
        seed = new Random().nextInt();
        rng = new Random(seed);
        int strSize = rng.nextInt(20);
        String r1 = RandomStringUtils.random(strSize, 0, Character.MAX_CODE_POINT, true, false, null, rng);
        String r2 = RandomStringUtils.random(strSize, 0, Character.MAX_CODE_POINT, true, false, null, rng);
        String r3 = RandomStringUtils.random(strSize, 0, Character.MAX_CODE_POINT, true, false, null, rng);
        String r4 = RandomStringUtils.random(strSize, 0, Character.MAX_CODE_POINT, true, false, null, rng);

        Map<String, Strings> map1 = stringsFactory.getsFactory().get_map();

        assert map1.size() == 0;

        Strings S = stringsFactory.createStrings(r1);

        System.out.println(S);

        assert map1.size() == 1;

        stringsFactory.createStrings(r1);

        assert map1.size() == 1;

        stringsFactory.createStrings(r2);

        assert map1.size() == 2;

        stringsFactory.createStrings(r2);

        assert map1.size() == 2;

        stringsFactory.createStrings(r3);

        assert map1.size() == 3;

        stringsFactory.createStrings(r3);

        assert map1.size() == 3;

        stringsFactory.createStrings(r4);

        assert map1.size() == 4;

        stringsFactory.createStrings(r2);

        assert map1.size() == 4;

    }
}