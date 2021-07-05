package cl.uchile.dcc.scrabble.gui.Scrabble_types.typeFactories;

import cl.uchile.dcc.scrabble.gui.Scrabble_types.NullType;
import cl.uchile.dcc.scrabble.gui.Scrabble_types.binary;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class nullTypeFactoryTest {

    @Test
    void createNull() {
        NullType n1 = nullTypeFactory.createNull();
        NullType n2 = nullTypeFactory.createNull();
        NullType n3 = nullTypeFactory.createNull();

        assertEquals(n1, n2);

        assertEquals(n2, n3);


    }
}