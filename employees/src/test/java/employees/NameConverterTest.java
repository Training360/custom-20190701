package employees;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NameConverterTest {

    @Test
    void testWithACharacter() {
        assertEquals("alom", new NameConverter().convertName("álom"));
    }

    @Test
    void testWithAnotherCharacter() {
        assertEquals("edes", new NameConverter().convertName("édes"));
    }

    @Test
    void testToLowercase() {
        assertEquals("alma", new NameConverter().convertName("ALMA"));
    }

    @Test
    void testAll() {
        assertEquals("arvizturo tukorfurogep", new NameConverter().convertName("ÁrVízTŰRŐ tükÖrFúróGÉP"));
    }
}
