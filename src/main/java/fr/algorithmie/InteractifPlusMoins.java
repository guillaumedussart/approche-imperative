package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusMoins {
    public static void main(String[] args){
        int myVarNumber = 6;
        int tryPlay = 0;
        boolean verif = true;

        while (verif){
            System.out.println("Veuillez saisir un nombre :");
            Scanner scanner = new Scanner(System.in);
            int nb = scanner.nextInt();
            if(nb > myVarNumber){
                tryPlay++;
                System.out.println("Tu es au dessus !");
                verif = true;
            }
            if(nb < myVarNumber){
                tryPlay++;
                System.out.println("Tu es en dessous !");
                verif = true;
            }
            if(nb == myVarNumber){
                tryPlay++;
                System.out.println("Super tu as reussi en "+tryPlay+" coups !");
                verif = false;
            }
        }
    }
}
