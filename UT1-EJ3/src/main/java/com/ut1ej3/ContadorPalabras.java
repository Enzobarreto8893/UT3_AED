package com.ut1ej3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ContadorPalabras {
    
    public int contarPalabras(String frase) {
        int contador = 0;
        boolean enPalabra = false;
        for (int i = 0; i < frase.length(); i++) {
            char caracter = frase.charAt(i);
            if (Character.isLetter(caracter)) {
                enPalabra = true;
            }
            if (caracter == ' ' || i == frase.length() - 1) {
                if (enPalabra) {
                    contador++;
                }
                enPalabra = false;
            }
        }
        return contador;
    }

    //metodos del ejercicio 3
    public String[] obtenerLineas(String archivo) throws IOException {
        List<String> lineas = Files.readAllLines(Paths.get(archivo));
        return lineas.toArray(new String[0]);
    }

    public int cantPalabras(String[] lineasArchivo) {
        int totalPalabras = 0;
        for (String linea : lineasArchivo) {
            totalPalabras += contarPalabras(linea);
        }
        return totalPalabras;
    }
}