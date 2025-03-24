package org.example;
public class Main {
    public static void main(String[] args) {
        byte TamanoPresionSanguinea = 2;//2 Bytes por el tamaño del short
        byte TamanoFrecuenciaCardiaca = 2;//2 Bytes por el tamaño del short
        byte TamanoNivelAzucar = 2;//2 Bytes por el tamaño del short
        byte TamanoFuerzaMax = 4;//4 Bytes por el tamaño del long
        byte TamanoTiempoMin = 4;//4 Bytes por el tamaño del float
        byte TamanoBateríaRestante = 8;//8 Bytes por el tamaño del double (es mas exacto)
        byte TamanoCodigoFabricante = 18;//cada caracter son 2 bytes + 2 bytes del BOM (Byte Order Mark)
        //imprimo la suma para calcular cuanta memoria consume
        System.out.println (TamanoPresionSanguinea + TamanoFrecuenciaCardiaca + TamanoNivelAzucar + TamanoFuerzaMax + TamanoTiempoMin + TamanoBateríaRestante + TamanoCodigoFabricante);
    }

}

