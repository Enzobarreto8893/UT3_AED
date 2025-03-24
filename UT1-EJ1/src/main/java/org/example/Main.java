package org.example;

public class Main {
    public static void main(String[] args) {
        ContadorPalabras contador = new ContadorPalabras();
        String frase = "Hola mundo 123";
        System.out.println(contador.contarPalabras(frase));
    }
}