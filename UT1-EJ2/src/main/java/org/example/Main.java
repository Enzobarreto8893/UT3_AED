package org.example;

public class Main {
    public static void main(String[] args) {
        ContadorPalabras contador = new ContadorPalabras();
        String frase = "Si piensas que tu profesor es exigente,... espera conocer a tu jefe!";
        int totalPalabras = contador.contarPalabras(frase);
        System.out.println("Cantidad de palabras: " + totalPalabras);
        int palabrasLargas = contador.ContadorLargoPalabras(frase, 5);
        System.out.println("Cantidad de palabras con más de 5 caracteres: " + palabrasLargas);
    }
}
