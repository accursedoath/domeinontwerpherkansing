import model.Gebruiker;
import model.Kleur;
import model.PrintOpsturing;
import model.ZwartWit;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kies uit de volgende opties \r\n" +
                "1) Zwart-Wit papier bij PostNl? \r\n" +
                "2) Zwart-Wit papier bij model.DHL \n\r" +
                "3) model.Kleur papier bij PostNl? \r\n" +
                "4) model.Kleur papier model.DHL" +
                "\r\n");
        System.out.print("uw keuze: ");
        int keuze = scanner.nextInt();
        Gebruiker g = new Gebruiker("dav","a","David");

        System.out.println("Hoeveel vrachtbrieven worden er geprint?");
        int hoeveelheid = scanner.nextInt();

        PrintOpsturing printopsturing;

        if(keuze < 3) printopsturing = ZwartWit.maakZwartWit(g, hoeveelheid, keuze);
        else printopsturing = Kleur.maakKleur(g, hoeveelheid, keuze);


        printopsturing.printBon();

        }
    }

