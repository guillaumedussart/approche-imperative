package fr.declaration.variable;


public class DeclarationApp {


    public static void main(String[] args) {
        byte bytefirst = 10;
        short shortfirst = -17282;
        int intfirst = 28546952;
        long longfirst = 1000L;
        float floatfirst = 1.2f;
        double doublefirst = 5.2d;
        boolean boolfirst = true;
        var total = bytefirst + intfirst;
        String randonString = "Voici le résultat d’un calcul : \n" + bytefirst + "+" + intfirst + "=" + total;
        System.out.println(randonString);
        int[] tab = {-1, 2, 3, 5, 4, -12};
        System.out.println(tab.length);
    }


}
