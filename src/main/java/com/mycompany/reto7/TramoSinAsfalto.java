package com.mycompany.reto7;

public class TramoSinAsfalto extends Tramo{
    private final double ancho = 6;
    protected double espesor;
    protected String tipoMaterial;
    
    public TramoSinAsfalto(double espesor, String tipoMaterial, double xInicial, double yInicial, double xFinal, double yFinal) {
        super(xInicial, yInicial, xFinal, yFinal);
        this.espesor = espesor;
        this.tipoMaterial = tipoMaterial;
    }

    @Override
    public double area() {
        double area = ancho * this.longitud();
        return area;
    }

    @Override
    public double volumen() {
        double volumen = espesor * ancho * this.longitud();
        return volumen;
    }
}
