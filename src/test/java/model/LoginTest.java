package model;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LoginTest {

    @AfterEach

    @Test
    void getInstance() {
        assertNotNull(Login.getInstance());
    }


    @Test
    void getIngelogdGebruiker() {
        Login a = Login.getInstance();
        Gebruiker z = new Gebruiker("s","sss","sss");
        assertTrue(a.login("s","sss"));
        assertEquals(a.getIngelogdGebruiker(),z);
    }

    @Test
    void login() {
        Gebruiker x = new Gebruiker("x","x","David");
        Login a = Login.getInstance();
        assertTrue(a.login("x","x"));
        a.logOut();
    }

    @Test
    void Foutlogin() {
        Gebruiker x = new Gebruiker("d","x","David");
        Login a = Login.getInstance();
        assertFalse(a.login("x","x"));
        a.logOut();
    }

    @Test
    void logOut() {
        Login a = Login.getInstance();
        Gebruiker z = new Gebruiker("c","sss","sss");
        assertTrue(a.login("c","sss"));
        a.logOut();
        assertNull(a.getIngelogdGebruiker());
    }

}