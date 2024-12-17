package org.example;

public class Main {
    public static void main(String[] args) {

        Factoriel factoriel = new Factoriel();


        int nombre = 5;
        int resultat = factoriel.factoriel(nombre);

       
        System.out.println("La factorielle de " + nombre + " est : " + resultat);
    }
}
