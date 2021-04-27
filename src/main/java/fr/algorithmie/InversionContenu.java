package fr.algorithmie;


import java.util.Arrays;

/**
 *
 */
public class InversionContenu {
    /**
     * @param args
     */
    public static void main(String[] args) {
        displayCopyArrayReverse();
    }

    /**
     *
     */
    public static void displayCopyArrayReverse() {
        AfficheInverse aff = new AfficheInverse();
        for (int i = 0; i < aff.array.length; i++) {
            aff.copiedArray[i] = aff.array[i];
        }
        System.out.println(Arrays.toString(aff.copiedArray));
        for (int i = 0; i < aff.array.length / 2; i++) {
            int temp = aff.array[i];
            aff.array[i] = aff.array[aff.array.length - i - 1];
            aff.array[aff.array.length - i - 1] = temp;
        }
        System.out.println(Arrays.toString(aff.array));
    }
}
