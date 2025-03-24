package contpalabras;

public class Main {
    public static void main(String[] args) {
        ContadorPalabras contador = new ContadorPalabras();
        String frase = "Hola mundo 123";
        System.out.println(contador.contarPalabras(frase));

        int[] resultados = contador.obtenerConsonantesYVocales(frase);

        System.out.println("Vocales: " + resultados[0]);
        System.out.println("Consonantes: " + resultados[1]);
    }
}