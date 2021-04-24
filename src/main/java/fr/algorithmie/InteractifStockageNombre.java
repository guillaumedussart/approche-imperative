package fr.algorithmie;

import org.yaml.snakeyaml.util.ArrayUtils;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class InteractifStockageNombre {

    public static void main(String arg[]) {
        choice();
    }

    public static void choice() {
        int array[] = new int[5];
        int i = 0;
        boolean nonStopQuestion = true;


        while (nonStopQuestion) {

            System.out.println("Faites votre choix (attention a ne pas mettre de zero) : \n 1. Ajouter un nombre. \n 2. Afficher les nombres existants");
            Scanner scanner = new Scanner(System.in);
            int nb = scanner.nextInt();
            if (nb == 0) {
                System.out.println("Attention vous avez mis un zero !");
                nonStopQuestion = false;
            }

            if (!contains(array, 0) && array.length <= i) {
                array = (int[]) InteractifStockageNombre.extend(array);
            }
            if (nb == 1) {

                System.out.println("Quel est le nombre a ajouter ?");
                int nbChoice = scanner.nextInt();

                array[i] = nbChoice;

                i++;
            } else {
                System.out.println("Voici l'etat du tableau : " + Arrays.toString(array));
                System.out.println("Voulez continuer ? [y/n]");
                String choiceStop = scanner.next();
                String str = choiceStop.toLowerCase();
                if (str.equals("n") || str.equals("no")) {
                    nonStopQuestion = false;
                    i = 0;
                } else if (str.equals("y") || str.equals("yes")) {
                    nonStopQuestion = true;
                }
            }
        }
    }

    public static boolean contains(final int[] arr, final int key) {
        return Arrays.asList(arr).contains(key);
    }

    public static Object extend(Object a) {
        Class cl = a.getClass();
        if (!cl.isArray()) return null;
        int length = Array.getLength(a);
        int newLength = length + (length / 2);
        Class componentType = a.getClass().getComponentType();
        Object newArray = Array.newInstance(componentType, newLength);
        System.arraycopy(a, 0, newArray, 0, length);
        return newArray;
    }

}
