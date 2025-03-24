package com.example;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        ContadorPalabras cp = new ContadorPalabras();

        String[] lineas = leerLineasArchivo("UT1_TA4/demo/entrada.txt");

        if (lineas.length >= 2) {
            String[] palabras1 = lineas[0].split(" ");
            String[] palabras2 = lineas[1].split(" ");

            String[] comunes = cp.palabrasComunes(palabras1, palabras2);

            System.out.println("Palabras comunes:");
            for (String palabra : comunes) {
                System.out.println(palabra);
            }
        } else {
            System.out.println("El archivo debe tener al menos dos líneas.");
        }
    }

    public static String[] leerLineasArchivo(String nombreArchivo) {
        ArrayList<String> lineas = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                lineas.add(linea);
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }

        return lineas.toArray(new String[0]);
    }
}
