import model.*;

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Gebruiker David = new Gebruiker("Dreddyon","welkom123","David");
            Login log = Login.getInstance();

            log.login("Dreddyon","welkom123");

            System.out.println(log.getIngelogdGebruiker().getNaam() + " is ingelogd");

            Scanner scanner = new Scanner(System.in);
            System.out.println("Kies uit de volgende opties \r\n" +
                    "1) Zwart-Wit papier bij PostNl? \r\n" +
                    "2) Zwart-Wit papier bij DHL \n\r" +
                    "3) Kleur papier bij PostNl? \r\n" +
                    "4) Kleur papier DHL" +
                    "\r\n");
            System.out.print("uw keuze: ");
            int keuze = scanner.nextInt();

            System.out.println("Hoeveel vrachtbrieven worden er geprint?");
            int hoeveelheid = scanner.nextInt();

            PrintOpsturing printopsturing;

            if(keuze < 3) printopsturing = ZwartWit.maakZwartWit(log.getIngelogdGebruiker(), hoeveelheid, keuze);
            else printopsturing = Kleur.maakKleur(log.getIngelogdGebruiker(), hoeveelheid, keuze);

            printopsturing.printBon();
            David.addPrintOpsturing(printopsturing);
            log.logOut();
            if(log.getIngelogdGebruiker() == null)   System.out.println("u bent uitgelogd");


        }
    }
