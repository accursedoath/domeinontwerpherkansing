package model;

public class PostNL implements LocatieDetails {

    @Override
    public double berekenExtraPrijs(int hoeveelheid) {
        if(hoeveelheid < 100){
            return 500;
        }
        else return hoeveelheid * 5;
    }

    @Override
    public String getLocatieNaam() {
        return "model.PostNL";
    }
}
