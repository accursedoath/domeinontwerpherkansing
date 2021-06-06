package model;

import java.util.ArrayList;

public class GebruikerChecker {
    private static ArrayList<Gebruiker> onthoudt = new ArrayList<>();
    private static GebruikerChecker gebruikerChecker;

    private GebruikerChecker(){
    }

    public static GebruikerChecker getInstance(){
        if(gebruikerChecker == null){
            return new GebruikerChecker();
        }
        else return gebruikerChecker;
    }

    protected Gebruiker checkNaamEnWachtwoord(String gebruikersnaam,String wachtwoord){
        for (Gebruiker e : onthoudt){
              if(e.getGebruikersnaam().equals(gebruikersnaam)
                      && e.getWachtwoord().equals(wachtwoord)){
                  return e;
              }
        }
        return null;
    }

    protected void addGebruiker(Gebruiker gebruiker){
        onthoudt.add(gebruiker);
    }

    protected boolean CheckZelfdeGebruikersnaam(String gebruikersnaam){
        if(onthoudt.isEmpty()) return false;
            for (Gebruiker e : onthoudt) {
                if (e.getGebruikersnaam().equals(gebruikersnaam)) {
                    System.out.println("Er is nog iemand met deze gebruikersnaam, " +
                            "vandaar is uw gebruikersnaam nu: " + gebruikersnaam + "x is.");
                    return true;
                }
            }
        return false;
    }
    public static ArrayList<Gebruiker> Go(){return onthoudt;}
}
