package fr.algorithmie;

public class AfficheSuite {
    public static void main(String[] args) {

        AfficheSuite affsuite = new AfficheSuite();

        System.out.println("Affiche tous les nombres de 1 à 10 inclus avec for");
        affsuite.displayNumberWithFor();

        System.out.println("\n");
        System.out.println("Affiche tous les nombres pairs entre 0 et 10 inclus avec for");
        affsuite.displayNumberPairWithFor();

        System.out.println("\n");
        System.out.println("Affiche tous les nombres impairs entre 0 et 9 inclus avec for");
        affsuite.displayNumberOddWithFor();

        System.out.println("\n");
        System.out.println("Affiche tous les nombres de 1 à 10 inclus avec while");
        affsuite.displayNumberWithWhile();

        System.out.println("\n");
        System.out.println("Affiche tous les nombres de 1 à 10 inclus avec while");
        affsuite.displayNumberWithWhile();

        System.out.println("\n");
        System.out.println("Affiche tous les nombres pairs entre 0 et 10 inclus avec while");
        affsuite.displayNumberPairWithWhile();

        System.out.println("\n");
        System.out.println("Affiche tous les nombres impairs entre 0 et 10 inclus avec while");
        affsuite.displayNumberOddWithWhile();
    }

    public void displayNumberWithFor() {
        for (int i = 0; i <= 10; i++) {
            System.out.print(" " + i);
        }
    }

    public void displayNumberPairWithFor() {
        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.print(" " + i);
            }
        }
    }

    public void displayNumberOddWithFor() {
        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 1) {
                System.out.print(" " + i);
            }
        }
    }

    public void displayNumberWithWhile() {
        int number = 1;
        while (number <= 10) {
            System.out.print(" "+number);
            number++;
        }
    }

    public void displayNumberPairWithWhile() {
        int number = 1;
        while (number <= 10) {
            if(number %2 == 0) {
                System.out.print(" " + number);
            }
            number++;
        }
    }

    public void displayNumberOddWithWhile() {
        int number = 1;
        while (number <= 10) {
            if(number %2 == 1) {
                System.out.print(" " + number);
            }
            number++;
        }
    }
}
