package org.example;

public class Marcapasos {
    private short presionSanguinea;
    private short frecuenciaCardiaca;
    private short nivelAzucar;
    private long fuerzaMaxima;
    private float tiempoMinimo;
    private double bateriaRestante;
    private String codigoFabricante;

    public Marcapasos(short presionSanguinea, short frecuenciaCardiaca,
                      short nivelAzucar, long fuerzaMaxima, float tiempoMinimo,
                      double bateriaRestante, String codigoFabricante) {
        this.presionSanguinea = presionSanguinea;
        this.frecuenciaCardiaca = frecuenciaCardiaca;
        this.nivelAzucar = nivelAzucar;
        this.fuerzaMaxima = fuerzaMaxima;
        this.tiempoMinimo = tiempoMinimo;
        this.bateriaRestante = bateriaRestante;
        this.codigoFabricante = codigoFabricante;
    }


}
