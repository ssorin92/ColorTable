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


}