package org.example;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SuperheroDatabase database = new SuperheroDatabase();
        SuperheroController superheroController = new SuperheroController(database);
        Scanner scanner = new Scanner(System.in);

        boolean exitProgram = false;

        while (!exitProgram) {
            System.out.println("Menu ");
            System.out.println("1. Tilføj superhelt");
            System.out.println("2. Fjern superhelt");
            System.out.println("3. Vis liste over superhelte");
            System.out.println("4. Afslut programmet");
            try {
                int choice = scanner.nextInt();
                scanner.nextLine();
                switch (choice) {
                    case 1:
                        System.out.println("Indtast realname: ");
                        String name = scanner.nextLine();
                        System.out.println("Indtast superheltenavn: ");
                        String superheroName = scanner.nextLine();
                        System.out.println("Indtast superpower: ");
                        String superpower = scanner.nextLine();
                        System.out.println("Indtast oprindelsesår (YYYY-MM-DD): ");
                        String yearCreatedStr = scanner.nextLine();
                        LocalDate yearCreated = LocalDate.parse(yearCreatedStr, DateTimeFormatter.ISO_LOCAL_DATE);
                        boolean isHuman;
                        do {
                            System.out.print("Er din superhelt et menneske? (ja/nej): ");
                            String isHumanInput = scanner.nextLine().toLowerCase();
                            if (isHumanInput.equals("ja")) {
                                isHuman = true;
                                break;
                            } else if (isHumanInput.equals("nej")) {
                                isHuman = false;
                                break;
                            } else {
                                System.out.println("Ugyldigt svar. Skriv enten 'ja' eller 'nej'.");
                            }
                        } while (true);
                        System.out.println("Hvor stærk er din superhelt? ");
                        int strength = scanner.nextInt();
                        superheroController.addSuperhero(name, superheroName, superpower, yearCreated, isHuman, strength);
                        System.out.println("Superhelt er tilføjet i databasen.");
                        break;
                    case 2:
                        System.out.println("Indtast superheronavnet på din superhelt du vil have fjernet se listen ...");
                        database.showSuperheroes();
                        String superName = scanner.nextLine();
                        database.removeSuperhero(superName);
                        break;
                    case 3:
                        superheroController.showSuperhero();
                        break;
                    case 4:
                        System.out.println("Farvel!");
                        exitProgram = true; // Afslut programmet
                        break;
                    default:
                        System.out.println("Ugyldigt valg. Prøv igen ...");
                }
            } catch (InputMismatchException e) {
                System.out.println("Fejl: Indtast venligst en gyldig værdi.");
                scanner.nextLine();
            } catch (DateTimeParseException e) {
                System.out.println("Fejl: Forkert datoformat. Brug YYYY-MM-DD.");
                scanner.nextLine();
            } catch (Exception e) {
                System.out.println("Der opstod en fejl: " + e.getMessage());
                scanner.nextLine();
            }
        }
    }
}
