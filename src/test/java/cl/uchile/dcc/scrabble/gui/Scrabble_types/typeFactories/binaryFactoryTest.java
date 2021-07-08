package cl.uchile.dcc.scrabble.gui.Scrabble_types.typeFactories;

import cl.uchile.dcc.scrabble.gui.Scrabble_types.Strings;
import cl.uchile.dcc.scrabble.gui.Scrabble_types.binary;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.jupiter.api.Test;

import java.util.Map;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class binaryFactoryTest {


    @Test
    void createBinary() {

        String r1 = "100110";
        String r2 = "010";
        String r3 = "11";
        String r4 = "01";

        Map<String, binary> map1 = binaryFactory.getBinFactory().get_map();

        map1.clear();

        assert map1.size() == 0;

        binary bin1 = binaryFactory.createBinary(r1);

        assert map1.size() == 1;

        binary bin2 = binaryFactory.createBinary(r1);

        assert map1.size() == 1;

        binaryFactory.createBinary(r2);

        assert map1.size() == 2;

        binaryFactory.createBinary(r2);

        assert map1.size() == 2;

        binaryFactory.createBinary(r3);

        assert map1.size() == 3;

        binaryFactory.createBinary(r3);

        assert map1.size() == 3;

        binaryFactory.createBinary(r4);

        assert map1.size() == 4;

        binaryFactory.createBinary(r2);

        assert map1.size() == 4;



    }
}