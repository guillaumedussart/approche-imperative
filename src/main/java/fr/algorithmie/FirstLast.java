package fr.algorithmie;

public class FirstLast {

    public static void main(String[] args) {
        int[] arrayOne = {-1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        boolean verif = false;
        System.out.println(arrayOne[arrayOne.length-1]);
        if (arrayOne.length > 1 && arrayOne[0] == arrayOne[arrayOne.length -1]) {
            verif = true;
        } else {
            verif = false;
        }
        System.out.println(verif);
    }
}
