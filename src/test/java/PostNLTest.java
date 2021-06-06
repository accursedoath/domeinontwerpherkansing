import model.PostNL;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PostNLTest {

    @Test
    void berekenExtraPrijs() { //hoeveelheid < 100 return 500;   else hoeveelheid * 5
        PostNL x = new PostNL();
        assertEquals(x.berekenExtraPrijs(98),500);
        assertEquals(x.berekenExtraPrijs(99),500);
        assertEquals(x.berekenExtraPrijs(100),500);
        assertEquals(x.berekenExtraPrijs(101),505);
    }
}