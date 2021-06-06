import model.Gebruiker;
import model.PostNL;
import model.PrintOpsturing;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrintOpsturingTest {

    @Test
    void getLocatie() {
        Gebruiker d = new Gebruiker("D","D","D");
        PrintOpsturing x = new PrintOpsturing(d,10,1);
        PostNL a = new PostNL();
        assertEquals(x.getLocatie().getLocatieNaam(),a.getLocatieNaam());
    }



    @Test
    void printBon() {
    }
}