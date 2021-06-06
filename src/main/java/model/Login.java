package model;

public class Login {
    private static Login loginsingleton;
    private Gebruiker ingelogdGebruiker;

    private Login(){
    }

    public static Login getInstance() {
        if(loginsingleton == null){
            loginsingleton = new Login();
        }
        return loginsingleton;
    }

    public boolean login(String gebruikersnaam,String wachtwoord){
        if(ingelogdGebruiker != null){
            return true;
        }
        else ingelogdGebruiker = GebruikerChecker.getInstance().checkNaamEnWachtwoord(gebruikersnaam, wachtwoord);
            return ingelogdGebruiker != null;
    }

    public void logOut(){
        this.ingelogdGebruiker = null;
    }

    public Gebruiker getIngelogdGebruiker() {
        return this.ingelogdGebruiker;
    }

}
