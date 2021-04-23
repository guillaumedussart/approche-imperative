package fr.algorithmie;

public class CalculMoyenne {

    AfficheInverse aff = new AfficheInverse();

    public static void main(String[] args) {
        CalculMoyenne calcAverage = new CalculMoyenne();
        System.out.println("La moyenne des éléments du tableau est de :");
        calcAverage.calculAverage();
    }

    public void calculAverage() {
        int somme = 0;
        for (int i = 0; i < aff.array.length; i++) {
            somme += aff.array[i];
        }
        float moyenne = (float) somme / aff.array.length;

        System.out.print(moyenne);
    }
}
