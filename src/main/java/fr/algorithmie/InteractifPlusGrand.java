package fr.algorithmie;

import java.util.*;

public class InteractifPlusGrand {

    public static void main(String[] args) {

        Stack st = new Stack();
        for (int i = 1; i <= 10; i++) {
            System.out.println("Veuillez saisir 10 nombre :");
            Scanner scanner = new Scanner(System.in);
            int nb = scanner.nextInt();
            st.push(nb);

        }
        Comparable max = Collections.max(st);
        System.out.println("Le plus grand nombre saisie est : "+max);
    }
}
