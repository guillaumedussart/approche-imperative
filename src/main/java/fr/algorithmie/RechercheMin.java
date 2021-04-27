package fr.algorithmie;

import java.util.Arrays;

public class RechercheMin {


    public static void main(String[] args) {
        System.out.println("Le plus grand nombre du tableau :");
        arrayMin();
    }

    public static void arrayMin() {

        AfficheInverse aff = new AfficheInverse();
        int max = aff.array[0];
        for (int ktr = 0; ktr < aff.array.length; ktr++) {
            if (aff.array[ktr] < max) {
                max = aff.array[ktr];
            }
        }
        System.out.println(Arrays.toString(aff.array));
        System.out.println("est");
        System.out.println(max);
    }
}
