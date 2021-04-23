package fr.algorithmie;

import java.util.Arrays;

public class SommeDeTableau {

    public static void main(String[] args) {
        int[] arrayOne = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        int[] arrayTwo = {-1, 12, 17, 14, 5, -9, 0, 18, -6, 0, 4, -13, 5, 7, -2, 8, -1};
        somme(arrayOne, arrayTwo);
        System.out.println(Arrays.toString(somme(arrayOne, arrayTwo)));

    }

    public static int[] somme(int[] t1, int[] t2) {
        int[] Tab = new int[t1.length];
        if (t1.length > t2.length) {
            int[] Newt2 = addZeroToLeft(t2, t1.length - t2.length);
            Tab = new int[t1.length];
            for (int i = 0; i < t1.length; i++) {
                Tab[i] = t1[i] + Newt2[i];
            }
        } else if (t1.length < t2.length) {
            int[] Newt1 = addZeroToLeft(t1, t2.length - t1.length);
            Tab = new int[t2.length];
            for (int i = 0; i < t2.length; i++) {
                Tab[i] = Newt1[i] + t2[i];
            }
        } else {
            Tab = new int[t1.length];
            for (int i = 0; i < t1.length; i++) {
                Tab[i] = t1[i] + t2[i];
            }
        }
        return Tab;
    }

    public static int[] addZeroToLeft(int[] t, int p) {
        int[] Newtable1 = new int[t.length + p];
        for (int i = 0; i < p; i++) {
            Newtable1[i] = 0;
        }
        for (int j = p; j < Newtable1.length; j++) {
            Newtable1[j] = t[j - p];
        }
        return Newtable1;
    }
}
