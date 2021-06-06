import model.DHL;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DHLTest {

    @Test
    void berekenExtraPrijs() { // (hoeveelheid * 10) + 1000;
        DHL x = new DHL();
        assertEquals(x.berekenExtraPrijs(10),1100);
        assertEquals(x.berekenExtraPrijs(0),1000);
        assertEquals(x.berekenExtraPrijs(1),1010);
    }
}