package fr.algorithmie;

import java.util.Scanner;

public class InteractifSommeArithmetique {

    public static void main(String[] args) {
        System.out.println("Veuillez saisir un nombre :");
        Scanner scanner = new Scanner(System.in);
        int nb = scanner.nextInt();
        int count = 0;
        for (int i = 0; i <= nb; i++) {
            count += i;
        }
        System.out.println(count);
    }
}
