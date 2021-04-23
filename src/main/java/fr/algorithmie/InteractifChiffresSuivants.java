package fr.algorithmie;

import java.util.Scanner;

public class InteractifChiffresSuivants {

    public static void main(String[] args) {
        System.out.println("Veuillez saisir un nombre :");
        Scanner scanner = new Scanner(System.in);
        int nb = scanner.nextInt();
        int somme = nb+10;
        int start = nb;
        for (int i = start; i < somme; i++) {
            System.out.println(i+1);
        }
    }
}
