package org.example;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Saisie du premier nombre
        System.out.print("Entrez le premier nombre : ");
        double nombre1 = scanner.nextDouble();

        // Saisie du deuxième nombre
        System.out.print("Entrez le deuxième nombre : ");
        double nombre2 = scanner.nextDouble();

        // Appels des méthodes pour effectuer les opérations
        double resultatAddition = addition(nombre1, nombre2);
        double resultatSoustraction = soustraction(nombre1, nombre2);
        double resultatMultiplication = multiplication(nombre1, nombre2);

        // Affichage des résultats
        System.out.println("Résultat de l'addition : " + resultatAddition);
        System.out.println("Résultat de la soustraction : " + resultatSoustraction);
        System.out.println("Résultat de la multiplication : " + resultatMultiplication);

        // Fermeture du scanner
        scanner.close();
    }

    // Méthode pour l'addition
    public static double addition(double a, double b) {
        return a + b;
    }

    // Méthode pour la soustraction
    public static double soustraction(double a, double b) {
        return a - b;
    }

    // Méthode pour la multiplication
    public static double multiplication(double a, double b) {
        return a * b;
    }
    
}