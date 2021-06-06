package model;

import javax.swing.plaf.SliderUI;
import java.util.ArrayList;

public class GebruikerChecker {
    private static ArrayList<Gebruiker> slaatop;

    protected GebruikerChecker(){}

    protected boolean checkNaamEnWachtwoord(Gebruiker gebruiker){
        for (Gebruiker e : slaatop){
              if(e.getGebruikersnaam().equals(gebruiker.getGebruikersnaam())){
                  return e.getWachtwoord().equals(gebruiker.getWachtwoord());
              }
        }
        return false;
    }

    protected static void addGebruiker(Gebruiker gebruiker){
        slaatop.add(gebruiker);
    }
}
