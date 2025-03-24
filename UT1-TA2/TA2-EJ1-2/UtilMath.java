package UT1.TA2;

public class UtilMath {

    public static int factorial(int num) {
        int resultado = 1;
        for (int i = 1; i <= num; i++) {
            resultado *= i;
        }
        return resultado;
    }

    public static boolean esPrimo(int n) {
        if (n < 2) return false;
        if (n == 2) return true;

        int i = 2;
        while (i <= Math.sqrt(n)) {
            if (n % i == 0) return false;
            i++;
        }
        return true;
    }

    public static int sumarPares(int n) {
        int suma = 0;
        int i = 0;
        while (i <= n) {
            if (i % 2 == 0) {
                suma += i;
            }
            i++;
        }
        return suma;
    }

    public static int sumarImpares(int n) {
        int suma = 0;
        int i = 0;
        while (i <= n) {
            if (i % 2 != 0) {
                suma += i;
            }
            i++;
        }
        return suma;
    }
}
