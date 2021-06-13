package model;

public class PrintOpsturing{
    private Gebruiker maker;
    private int hoeveelheid;
    private LocatieDetails locatie;

    protected PrintOpsturing(Gebruiker gebruiker, int hoeveelheid, int locatiekeuze){
        if(locatiekeuze == 1 || locatiekeuze == 3) locatie = new PostNL();
        else locatie = new DHL();
        this.maker = gebruiker;
        this.hoeveelheid = hoeveelheid;
    }

    public String getOrderline(){
        return "Sasagar BV";
    }

    public static PrintOpsturing maakPrintOpsturing(Gebruiker gebruiker, int hoeveelheid, int locatiekeuze){
        if(locatiekeuze > 0 && locatiekeuze < 5) return new PrintOpsturing(gebruiker, hoeveelheid, locatiekeuze);
        else return null;
    }

    public double berekenPrijs(){ // temporary field , abusing variable (misschien ervoor zorgen dat de prijs in 1 locatie wordt berekent)
        return hoeveelheid * 2;
    }

    public double berekenLocatiePrijs(){
       return locatie.berekenExtraPrijs(hoeveelheid);
    }

    public int getHoeveelheid() {
        return hoeveelheid;
    }

    public LocatieDetails getLocatie() {
        return locatie;
    }

    public void printBon(){
        System.out.println("Maker " + maker.getGebruikersnaam() + "\r\n" + "Doet een printopsturing " +
                getOrderline() +"\r\n" +
                "waarvan de totale prijs : " + (berekenPrijs() + berekenLocatiePrijs()) + " eurocent bedraagd \r\n" +
                "voor " + hoeveelheid + " Vrachtbrieven. \r\n" +
                "Deze vrachtbrieven worden bezorgd door " + locatie.getLocatieNaam());
    }
}