package com.ut1ej3;

public class App {
    public static void main(String[] args) {
        ContadorPalabras contador = new ContadorPalabras();
        String frase = "Hola mundo 123";
        System.out.println(contador.contarPalabras(frase));

        
        String archivo = "hola.txt";

        try {
            String[] lineas = contador.obtenerLineas(archivo);
            System.out.println(contador.cantPalabras(lineas));
            System.out.println("lineas: " + lineas.length);
        } catch (Exception e) {
            System.out.println("Error al leer el archivo");
        }
    }
}