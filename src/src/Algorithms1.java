package src;

import java.util.Random;

/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 27/10/2020
 */

public class Algorithms1 {

    // TODO 1 - Gennemse Data klassen, og skriv gode kommentarer til det

    // TODO 2 - Skriv en randomBoyName() metode i Algorithms1, som returnerer et tilfældigt drengenavn fra Data klassens randomDrengeNavne property OBS: randomDrengeNavne skal forblive private!
//Assignment 2:
    public static String randomBoyName() {
        // Laver en random
        Random rand = new Random();
        rand.setSeed(20L); // Fjern for at opnå random drengenavne igen
        // Ny string med names med drengenavnene fra Data
        String[] names = new Data().getRandomDrengeNavne();
        // Henter et random navn ud af de 45 navne der er i Arrayet
        String randomNavn = names[rand.nextInt(names.length)];
        // Udskriver det random navn
        System.out.println("Random Drenge navn er: " + randomNavn);
        return randomNavn;

    }


    // TODO 3 - Skriv en test til randomBoyName() metoden HINT: Se metoden exampleOfPredictableRandomNumber() for at se, hvordan du kan lave et tilfældigt nummer som er altid det samme (til test)
// Assignment 3:
    //Se tests
    // TODO 4 - Skriv en randomGirlName() metode i Algorithms1, som returnerer et tilfældigt pigenavn fra Data klassen

    public static String randomPigenavne(){
        // Laver en random
        Random rand = new Random();
        // Ny string med names med pigenavnene fra Data
        String[] names = new Data().getRandomPigeNavne();
        // Henter et random navn ud af de 45 navne der er i Arrayet
        String randomNavn = names[rand.nextInt(names.length)];
        // Udskriver det random navn
        System.out.println("Random Pige navn er: " + randomNavn);
        return randomNavn;

    }
    // TODO 5 - Skriv en randomName() metode i Algorithms1, som laver et sammenlagt array som indeholder både piger og drenge, og returnerer det

    // TODO 6 - Skriv en test til randomName() metoden

    // TODO 7 - Skriv en random bogstavs-generator metode (du kan tage udgangspunkt i randomNumbers() i Data)

    // TODO 8 - Skriv en  plet eller krone generator metode (plet er boolean true og krone er boolean false)

    public static void main(String[] args) {
       // exampleOfPredictableRandomNumber();
        randomBoyName();
        randomPigenavne();

    }

    private static void exampleOfPredictableRandomNumber() {
        Random random = new Random();
        random.setSeed(15L); // Hvis vi angiver et seed som et long number, vil random klassen altid generere det samme tal, i det her tilfælde 21
        System.out.print("Hvis vi bruger seed, vil random altid returnere de samme værdier, f.eks. giver denne 21 --> ");
        System.out.println(random.nextInt(45));
    }


}




