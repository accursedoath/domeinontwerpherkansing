package model;

public class PrintOpsturing{
    private Gebruiker maker;
    private int hoeveelheid;
    LocatieDetails locatie;

    protected PrintOpsturing(Gebruiker gebruiker, int hoeveelheid, int locatiekeuze){
        if(locatiekeuze == 1 || locatiekeuze == 3) locatie = new PostNL();
        else locatie = new DHL();
        this.maker = gebruiker;
        this.hoeveelheid = hoeveelheid;
    }

    public String getOrderline(){
        return "";
    }

    public static PrintOpsturing maakPrintOpsturing(Gebruiker gebruiker, int hoeveelheid, int locatiekeuze){
        if(locatiekeuze > 0 && locatiekeuze < 5) return new PrintOpsturing(gebruiker, hoeveelheid, locatiekeuze);
        else return null;
    }

    public double berekenPrijs(){
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
        System.out.println("Maker = " + maker.getGebruikersnaam() + "\r\n" +
                getOrderline() +"\r\n" +
                "waarvan de totale prijs : " + berekenPrijs() + berekenLocatiePrijs() + "bedraagd \r\n" +
                "voor " + hoeveelheid + " Vrachtbrieven.");
    }
}