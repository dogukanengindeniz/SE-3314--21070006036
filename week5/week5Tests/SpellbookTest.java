package week5Tests;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

public class SpellbookTest {

    @Test
    public void testGetSpellValidIndex() {
        Spellbook spellbook = new Spellbook(List.of("Alohomora", "Lumos", "Expelliarmus"));
        assertEquals("Lumos", spellbook.getSpell(1));
    }

    @Test
    public void testGetSpellInvalidIndex() {
        Spellbook spellbook = new Spellbook(List.of("Alohomora", "Lumos"));
        assertThrows(IndexOutOfBoundsException.class, () -> spellbook.getSpell(5));
    }

    @Test
    public void testGetSpellsByExactPrefix() {
        Spellbook spellbook = new Spellbook(List.of("Alohomora", "Accio", "Lumos"));
        List<String> result = spellbook.getSpellsByPrefix("Alo");
        assertEquals(List.of("Alohomora"), result);
    }

    @Test
    public void testGetSpellsByEmptyPrefix() {
        Spellbook spellbook = new Spellbook(List.of("Alohomora", "Accio", "Lumos"));
        List<String> result = spellbook.getSpellsByPrefix("");
        assertEquals(List.of("Alohomora", "Accio", "Lumos"), result);
    }

    @Test
    public void testGetSpellsByNoMatchPrefix() {
        Spellbook spellbook = new Spellbook(List.of("Alohomora", "Lumos"));
        List<String> result = spellbook.getSpellsByPrefix("Ex");
        assertTrue(result.isEmpty());
    }
}
