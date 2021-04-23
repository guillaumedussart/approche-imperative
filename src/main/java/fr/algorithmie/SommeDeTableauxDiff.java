package fr.algorithmie;

import java.util.Arrays;

public class SommeDeTableauxDiff {

    public static void main(String[] args) {
        int[] arrayOne = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        int[] arrayTwo = {-1, 12, 17, 14, 5, -9, 0, 18};
        sommeDiff(arrayOne, arrayTwo);
        System.out.println("La valeur de la somme des 2 tableaux est :");
        System.out.println(Arrays.toString(sommeDiff(arrayOne, arrayTwo)));
    }

    public static int[] sommeDiff(int[] t1, int[] t2) {

        int[] Tab = new int[t1.length];
        for (int i = 0; i < t1.length; i++) {
            if (i <= t2.length - 1) {
                Tab[i] = t1[i] + t2[i];
            }
        }
        return Tab;
    }
}
