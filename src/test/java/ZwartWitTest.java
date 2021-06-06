import model.Gebruiker;
import model.ZwartWit;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ZwartWitTest {
    @Test
    public void prijs(){
        Gebruiker d = new Gebruiker("D","D","D");
        ZwartWit x = new ZwartWit(d,10,1); //return super.getHoeveelheid() * 10;
        assertEquals(x.berekenPrijs(),100);
    }
    //1postnl hv < 100 return 500     else return hv x 5    2DHL: (hoeveelheid * 10) + 1000;
    @Test
    public void PostNLprijs(){
        Gebruiker d = new Gebruiker("D","D","D");
        ZwartWit x = new ZwartWit(d,10,1); //return super.getHoeveelheid() * 10;
        assertEquals(x.berekenPrijs() + x.berekenLocatiePrijs(), 100 + 500);
    }

    public void DHLprijs(){
        Gebruiker d = new Gebruiker("D","D","D");
        ZwartWit x = new ZwartWit(d,10,2); //return super.getHoeveelheid() * 10;
        assertEquals(x.berekenPrijs() + x.berekenLocatiePrijs(), 100 + 1100);
    }
}
