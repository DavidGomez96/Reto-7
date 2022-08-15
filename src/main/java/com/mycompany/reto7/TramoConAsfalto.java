package com.mycompany.reto7;

public class TramoConAsfalto extends Tramo {
    private final double ancho = 8.0;
    private final double espesor = 0.25;
    protected String proveedorAsfalto;
    protected double velocidadMax;
    protected boolean adelantoProivido;

    public TramoConAsfalto(String proveedorAsfalto, double velocidadMax, boolean adelantoProivido, double xInicial, double yInicial, double xFinal, double yFinal) {
        super(xInicial, yInicial, xFinal, yFinal);
        this.proveedorAsfalto = proveedorAsfalto;
        this.velocidadMax = velocidadMax;
        this.adelantoProivido = adelantoProivido;
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
