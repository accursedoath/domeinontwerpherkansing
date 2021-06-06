package model;

import java.util.ArrayList;

public class Login {
    private static Login loginsingleton;
    private Gebruiker ingelogdGebruiker;
    private ArrayList<Gebruiker> slaatop = new ArrayList<>();
    private GebruikerChecker checker;

    private Login(){
        checker = new GebruikerChecker();
    }

    public static Login getInstance() {
        if(loginsingleton == null){
            loginsingleton = new Login();
        }
        return loginsingleton;
    }

    public boolean login(Gebruiker gebruiker){
        if(ingelogdGebruiker != null){
            return true;
        }
        else return checker.checkNaamEnWachtwoord(gebruiker);
    }

    public void logOut(){
        this.ingelogdGebruiker = null;
    }

    public Gebruiker getIngelogdGebruiker() {
        return ingelogdGebruiker;
    }

}
