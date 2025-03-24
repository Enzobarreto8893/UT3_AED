package org.example;

public class ContadorPalabras {
    public int contarPalabras(String frase){
        int contador = 0;
        boolean enPalabra = false;

        for (int i = 0; i < frase.length(); i++) {
            char caracter = frase.charAt(i);
            if (Character.isLetter(caracter)){
                enPalabra = true;
            }
            if (caracter == ' ' || i == frase.length()-1){
                if (enPalabra){
                    contador++;}
                enPalabra = false;


            }

        }
        return contador;
    }
}
