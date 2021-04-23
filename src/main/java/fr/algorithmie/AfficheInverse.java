package fr.algorithmie;

import java.util.Arrays;

public class AfficheInverse {

    public int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
    public int[] copiedArray = new int[this.array.length];


    public static void main(String[] args) {
        AfficheInverse aff = new AfficheInverse();
        System.out.println("Affiche le tableau");
        aff.displayArray();
        System.out.println("Affiche le tableau a l'envers");
        aff.displayArrayReverse();
        System.out.println("Affiche la copie du tableau courant");
        aff.displayArrayCopy();
    }

    public void displayArray() {

        for (int i = 0; i < this.array.length; i++) {
            int temp = this.array[i];
            this.array[i] = this.array[this.array.length - i - 1];
            this.array[this.array.length - i - 1] = temp;
        }
        System.out.println(Arrays.toString(this.array));
    }

    public void displayArrayReverse() {

        for (int i = 0; i < this.array.length / 2; i++) {
            int temp = this.array[i];
            this.array[i] = this.array[this.array.length - i - 1];
            this.array[this.array.length - i - 1] = temp;
        }
        System.out.println(Arrays.toString(this.array));

    }

    public void displayArrayCopy() {
        for (int i = 0; i < this.array.length; i++) {
            this.copiedArray[i] = this.array[i];
        }
        System.out.println(Arrays.toString(this.copiedArray));
    }
}
