package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GebruikerCheckerTest {

    @Test
    void checkNaamEnWachtwoord() {
        Gebruiker x = new Gebruiker("a", "a", "david");
        GebruikerChecker check = GebruikerChecker.getInstance();
        assertEquals(check.checkNaamEnWachtwoord("a","a"), x);
    }

    @Test
    void ZelfdeGebruikersNaam() {
        Gebruiker x = new Gebruiker("a", "a", "david");
        assertTrue(GebruikerChecker.getInstance().CheckZelfdeGebruikersnaam("a"));
    }


}