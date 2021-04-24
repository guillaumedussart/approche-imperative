package fr.algorithmie;

import java.util.Scanner;

public class InteractifFibonacci {
    public static void main(String[] args) {


        System.out.println("Quel rang de la suite de fibonacci voulez vous ?");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        System.out.println(N + ": " + fib(N));
    }

    private static int fib(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }
}
