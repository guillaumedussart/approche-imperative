package fr.algorithmie;

public class RechercheMin {

    AfficheInverse aff = new AfficheInverse();

    public static void main(String[] args) {
        RechercheMin searchMin = new RechercheMin();
        System.out.println("Le plus grand nombre du tableau est :");
        searchMin.arrayMin();
    }

    public void arrayMin() {
        int max = aff.array[0];
        for (int ktr = 0; ktr < aff.array.length; ktr++) {
            if (aff.array[ktr] < max) {
                max = aff.array[ktr];
            }
        }
        System.out.println(max);
        ;
    }
}
