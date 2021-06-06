public class PrintOpsturing{
    private double prijs;
    private Gebruiker maker;
    private int hoeveelheid;

    public PrintOpsturing(Gebruiker gebruiker, int hoeveelheid){
        this.maker = gebruiker;
    }

    public String getOrderline(){
        return "";
    }

    public void berekenPrijs(BerekenType berkenetype){
        this.prijs = 0;
    }

    public void printBon(){
        System.out.println("Maker = " + maker.getGebruikersnaam() + "\r\n" +
                "met keuze:" + getOrderline() +"\r\n" +
                "waarvan de totale prijs : " + this.prijs + "bedraagd \r\n" +
                "voor " + hoeveelheid + "Vrachtbrieven.");
    }
}