package com.example;

import java.util.ArrayList;

public class ContadorPalabras {

    public String[] palabrasComunes(String[] palabras1, String[] palabras2) {
        ArrayList<String> comunes = new ArrayList<>();

        for (int i = 0; i < palabras1.length; i++) {
            String palabra1 = palabras1[i];

            for (int j = 0; j < palabras2.length; j++) {
                if (palabra1.equals(palabras2[j]) && !comunes.contains(palabra1)) {
                    comunes.add(palabra1);
                }
            }
        }

        return comunes.toArray(new String[0]);
    }
}
