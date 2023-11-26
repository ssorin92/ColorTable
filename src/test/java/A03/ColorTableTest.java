package A03;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ColorTableTest {

    @Test
    public void testConstructorWithValidPaletteSize() {
        // Given
        int paletteSize = 4;

        // When
        ColorTable colorTable = new ColorTable(paletteSize);

        // Then
        assertEquals(paletteSize, colorTable.getPaletteSize());
    }

    @Test
    public void testConstructorWithInvalidPaletteSizeThrowsException() {
        // Given
        int invalidPaletteSize = 3;

        // When and Then
        assertThrows(InvalidPaletteSizeException.class, () -> new ColorTable(invalidPaletteSize));
    }

    @Test
    public void testAddValidColor() {
        // Given
        ColorTable colorTable = new ColorTable(4);
        int rgbValue = 0xFF0000; // Red color

        // When
        colorTable.add(rgbValue);

        // Then
        assertTrue(colorTable.contains(rgbValue));
    }


}