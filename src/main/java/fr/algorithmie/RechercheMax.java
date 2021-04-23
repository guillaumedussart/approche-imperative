package fr.algorithmie;

import java.util.Arrays;
import java.util.OptionalInt;

public class RechercheMax {
    AfficheInverse aff = new AfficheInverse();

    public static void main(String[] args){
    RechercheMax searchMax = new RechercheMax();
        System.out.println("Le plus grand nombre du tableau est :");
    searchMax.arrayMax();
    }

    public void arrayMax() {
        int max = aff.array[0];
        for (int ktr = 0; ktr < aff.array.length; ktr++) {
            if (aff.array[ktr] > max) {
                max = aff.array[ktr];
            }
        }
        System.out.println(max);;
    }
}
