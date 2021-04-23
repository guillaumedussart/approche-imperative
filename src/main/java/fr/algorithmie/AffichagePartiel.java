package fr.algorithmie;

import java.util.Arrays;

public class AffichagePartiel {

    AfficheInverse aff = new AfficheInverse();


    public static void main(String[] args) {
        AffichagePartiel affp = new AffichagePartiel();
        System.out.println("Affichage des nombres > 3 du tableau \n");
        affp.displayPartial();
        System.out.println("\n");
        System.out.println("Affichage des nombres pairs du tableau \n");
        affp.displayPair();
        System.out.println("\n");
        System.out.println("Affichage des index pairs du tableau \n");
        affp.displayPairIndex();
        System.out.println("\n");
        System.out.println("Affichage des nombres impairs du tableau \n");
        affp.displayOdd();

    }

    public void displayPartial() {
        for (int i = 0; i < aff.array.length; i++) {
            if (aff.array[i] > 3) {
                aff.copiedArray[i] = aff.array[i];
            }
        }
        System.out.println(Arrays.toString(aff.copiedArray));
    }

    public void displayPair() {
        for (int i = 0; i < aff.array.length; i++) {

            if (aff.array[i] % 2 == 0) {
                aff.copiedArrayPair[i] = aff.array[i];
            }
        }
        System.out.println(Arrays.toString(aff.copiedArrayPair));
    }


    public void displayPairIndex() {
        for (int i = 0; i < aff.array.length; i++) {

            if (i % 2 == 0) {
                aff.copiedArrayPairIndex[i] = aff.array[i];
            }
        }
        System.out.println(Arrays.toString(aff.copiedArrayPairIndex));
    }

    public void displayOdd() {
        for (int i = 0; i < aff.array.length; i++) {

            if (aff.array[i] % 2 == 1) {
                aff.copiedArrayOdd[i] = aff.array[i];
            }
        }
        System.out.println(Arrays.toString(aff.copiedArrayOdd));
    }
}
