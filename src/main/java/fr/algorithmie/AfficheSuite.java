package fr.algorithmie;

public class AfficheSuite {
    public static void main(String[] args) {

        System.out.println("Affiche tous les nombres de 1 à 10 inclus avec for");
        displayNumberWithFor();

        System.out.println("\n");
        System.out.println("Affiche tous les nombres pairs entre 0 et 10 inclus avec for");
        displayNumberPairWithFor();

        System.out.println("\n");
        System.out.println("Affiche tous les nombres impairs entre 0 et 9 inclus avec for");
        displayNumberOddWithFor();

        System.out.println("\n");
        System.out.println("Affiche tous les nombres de 1 à 10 inclus avec while");
        displayNumberWithWhile();

        System.out.println("\n");
        System.out.println("Affiche tous les nombres de 1 à 10 inclus avec while");
        displayNumberWithWhile();

        System.out.println("\n");
        System.out.println("Affiche tous les nombres pairs entre 0 et 10 inclus avec while");
        displayNumberPairWithWhile();

        System.out.println("\n");
        System.out.println("Affiche tous les nombres impairs entre 0 et 10 inclus avec while");
        displayNumberOddWithWhile();
    }

    public static void displayNumberWithFor() {
        for (int i = 0; i <= 10; i++) {
            System.out.print(" " + i);
        }
    }

    public static void displayNumberPairWithFor() {
        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.print(" " + i);
            }
        }
    }

    public static void displayNumberOddWithFor() {
        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 1) {
                System.out.print(" " + i);
            }
        }
    }

    public static void displayNumberWithWhile() {
        int number = 1;
        while (number <= 10) {
            System.out.print(" "+number);
            number++;
        }
    }

    public static void displayNumberPairWithWhile() {
        int number = 1;
        while (number <= 10) {
            if(number %2 == 0) {
                System.out.print(" " + number);
            }
            number++;
        }
    }

    public static void displayNumberOddWithWhile() {
        int number = 1;
        while (number <= 10) {
            if(number %2 == 1) {
                System.out.print(" " + number);
            }
            number++;
        }
    }
}
