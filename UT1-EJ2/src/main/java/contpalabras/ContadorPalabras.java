package contpalabras;

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

    private boolean esVocal(char caracter){
        String[] vocales = {"a", "e", "i", "o", "u", "á", "é", "í", "ó", "ú"};

        for(String vocal : vocales){
            if(vocal.equalsIgnoreCase(String.valueOf(caracter))){
                return true;
            }
        }
        return false;
    }

    public int[] obtenerConsonantesYVocales(String frase){
        int contadorVocales = 0;
        int contadorConsonantes = 0;

        for(int i = 0; i < frase.length(); i++){
            char caracter = frase.charAt(i);
            if(Character.isLetter(caracter)){
                if(esVocal(caracter)){
                    contadorVocales++;
                } else{
                    contadorConsonantes++;
                }
            }
        }
        return new int[] {contadorVocales, contadorConsonantes};
    }
}
