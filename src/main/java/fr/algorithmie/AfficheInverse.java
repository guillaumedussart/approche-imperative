package fr.algorithmie;

import java.util.Arrays;

/**
 * AfficheInverse
 * multiple array display
 */
public class AfficheInverse {

    public static int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
    public static int[] copiedArray = new int[array.length];
    public static int[] copiedArrayPair = new int[array.length];
    public static int[] copiedArrayPairIndex = new int[array.length];
    public static int[] copiedArrayOdd = new int[array.length];


    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Affiche le tableau");
        displayArray();
        System.out.println("Affiche le tableau a l'envers");
        displayArrayReverse();
        System.out.println("Affiche la copie du tableau courant");
        displayArrayCopy();
    }

    /**
     * display array
     */
    public static void displayArray() {

        for (int i = 0; i < array.length; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        System.out.println(Arrays.toString(array));
    }

    /**
     *
     */
    public static void displayArrayReverse() {

        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        System.out.println(Arrays.toString(array));

    }

    /**
     *
     */
    public static void displayArrayCopy() {
        for (int i = 0; i < array.length; i++) {
            copiedArray[i] = array[i];
        }
        System.out.println(Arrays.toString(copiedArray));
    }
}
