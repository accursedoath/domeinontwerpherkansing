package model;

import java.util.ArrayList;

public class Gebruiker {
    private String gebruikersnaam;
    private String wachtwoord;
    private String naam;
    private ArrayList<PrintOpsturing> doet;

    public Gebruiker(String gebruikersnaam, String wachtwoord, String naam) {
        this.wachtwoord = wachtwoord;
        this.doet = new ArrayList<>();

        if(GebruikerChecker.getInstance().CheckZelfdeGebruikersnaam(gebruikersnaam)){
            this.gebruikersnaam = gebruikersnaam + "x";
        }

        else this.gebruikersnaam = gebruikersnaam;
        GebruikerChecker.getInstance().addGebruiker(this);
    }

    public String getGebruikersnaam() {
        return gebruikersnaam;
    }

    public String getWachtwoord() {
        return wachtwoord;
    }

    public String getNaam(){
        return this.naam;
    }

    public void addPrintOpsturing(PrintOpsturing printopsturing){
        this.doet.add(printopsturing);
    }

}
