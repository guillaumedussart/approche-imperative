package fr.algorithmie;

import java.util.Scanner;

public class InteractifTableMult {

    public static void main(String[] args) {
        boolean verif = false;
        System.out.println("Veuillez saisir un nombre :");
        Scanner scanner = new Scanner(System.in);
        int nb = scanner.nextInt();
        while (nb <= 1 || nb > 11) {
            System.out.println("Veuillez resaisir un nombre :");
            scanner = new Scanner(System.in);
            nb = scanner.nextInt();
            verif = true;
        }
        if (verif) {
            System.out.println("Voici la table de " + nb);
            for (int i = 0; i <= 10; i++) {
                System.out.println(nb + " x " + i + " = " + nb * i);
            }
        }
    }
}
