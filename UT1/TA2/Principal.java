package UT1.TA2;

public class Principal {
    public static void main(String[] args) {
        int numero = 8;
        int resultado = UtilMath.factorial(numero);

        System.out.println("El factorial de " + numero + " es: " + resultado);
        
        if (UtilMath.esPrimo(numero)) {
            System.out.println(numero + " es primo.");
            System.out.println("Suma de pares hasta " + numero + ": " + UtilMath.sumarPares(numero));
        } else {
            System.out.println(numero + " NO es primo.");
            System.out.println("Suma de impares hasta " + numero + ": " + UtilMath.sumarImpares(numero));
        }
    
    
    }
    
}
