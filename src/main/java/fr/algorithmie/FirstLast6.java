package fr.algorithmie;

public class FirstLast6 {
    public static void main(String[] args) {
        int[] arrayOne = {-1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        boolean verif = false;
        if (arrayOne.length > 1 && (arrayOne[0] == 6 || arrayOne.length - 1 == 6)) {
            verif = true;
        }else{
            verif = false;
        }
        System.out.println(verif);
    }
}
