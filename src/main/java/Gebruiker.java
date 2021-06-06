import java.util.ArrayList;

public class Gebruiker {
    private String gebruikersnaam;
    private String wachtwoord;
    private ArrayList<PrintOpsturing> doet;

    public Gebruiker(String gebruikersnaam, String wachtwoord) {
        this.gebruikersnaam = gebruikersnaam;
        this.wachtwoord = wachtwoord;
        this.doet = new ArrayList<>();
    }

    public String getGebruikersnaam() {
        return gebruikersnaam;
    }

    public String getWachtwoord() {
        return wachtwoord;
    }

    public void addPrintOpsturing(PrintOpsturing printopsturing){
        this.doet.add(printopsturing);
    }
}
