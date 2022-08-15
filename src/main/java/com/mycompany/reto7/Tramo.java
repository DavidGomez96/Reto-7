package com.mycompany.reto7;

public abstract class Tramo {
    protected double xInicial;
    protected double yInicial;
    protected double xFinal;
    protected double yFinal;
    public abstract double area();
    public abstract double volumen();

    public Tramo(double xInicial, double yInicial, double xFinal, double yFinal) {
        this.xInicial = xInicial;
        this.yInicial = yInicial;
        this.xFinal = xFinal;
        this.yFinal = yFinal;
    }
    
    public double longitud(){
        double d;
        d = Math.sqrt(Math.pow(xInicial - xFinal,2) + Math.pow(yInicial - yFinal,2));
        return d;
    }

    public double getxInicial() {
        return xInicial;
    }

    public void setxInicial(double xInicial) {
        this.xInicial = xInicial;
    }

    public double getyInicial() {
        return yInicial;
    }

    public void setyInicial(double yInicial) {
        this.yInicial = yInicial;
    }

    public double getxFinal() {
        return xFinal;
    }

    public void setxFinal(double xFinal) {
        this.xFinal = xFinal;
    }

    public double getyFinal() {
        return yFinal;
    }

    public void setyFinal(double yFinal) {
        this.yFinal = yFinal;
    }

}


