package fr.algorithmie;

public class CalculMoyenne {


    public static void main(String[] args) {
        System.out.println("La moyenne des éléments du tableau est de :");
        calculAverage();
    }

    public static void calculAverage() {
        AfficheInverse aff = new AfficheInverse();

        int somme = 0;
        for (int i = 0; i < aff.array.length; i++) {
            somme += aff.array[i];
        }
        float moyenne = (float) somme / aff.array.length;

        System.out.print(moyenne);
    }
}
