package example;

import org.example.Factoriel;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FactorielTest {
    @Test
    public void testFactorielOne() {
        // Given
        Factoriel factoriel = new Factoriel();

        // When
        int n = 4;
        int result = factoriel.factoriel(n);

        // Then
        assertEquals("La factorielle de 4 devrait être 24", 24, result);
    }

    @Test
    public void testFactorielZero() {
        // Given
        Factoriel factoriel = new Factoriel();

        // When
        int n = 0;
        int result = factoriel.factoriel(n);

        // Then
        assertEquals("La factorielle de 0 devrait être 1", 1, result);
    }
}
