package fr.algorithmie;

import java.util.Arrays;
import java.util.Collections;

public class Rotation {

    public static void main(String[] args) {
        Integer[] arrayOne = {0, 1, 2, 3, 4};
        Collections.rotate(Arrays.asList(arrayOne), 2);
        System.out.println(Arrays.toString(arrayOne));
    }
}
